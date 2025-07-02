package br.com.fcamera_backend_test.controller;

import br.com.fcamera_backend_test.domain.Estabelecimento;
import br.com.fcamera_backend_test.domain.dto.EstabelecimentoCadastroDTO;
import br.com.fcamera_backend_test.domain.dto.EstabelecimentoRespostaDTO;
import br.com.fcamera_backend_test.domain.mapper.EstabelecimentoMapper;
import br.com.fcamera_backend_test.service.EstabelecimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/estabelecimento")
public class EstabelecimentoController {

    @Autowired
    private EstabelecimentoService estabelecimentoService;

    @Autowired
    private EstabelecimentoMapper estabelecimentoMapper;

    @PostMapping
    public ResponseEntity criarEstabelecimento(@RequestBody EstabelecimentoCadastroDTO request) {
        Estabelecimento estabelecimento = estabelecimentoMapper.toEntity(request);
        estabelecimentoService.criarEstabelecimento(estabelecimento);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<EstabelecimentoRespostaDTO>> listarEstabelecimentos() {
        var estabelecimentos = estabelecimentoService.buscarTodos();
        List<EstabelecimentoRespostaDTO> response = estabelecimentos.stream().map(EstabelecimentoMapper::toRespostaDTO).collect(Collectors.toList());
        return ResponseEntity.ok(response);
    }
}

