package br.com.fcamera_backend_test.service;

import br.com.fcamera_backend_test.domain.Estabelecimento;
import br.com.fcamera_backend_test.repository.EstabelecimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstabelecimentoService {

    @Autowired
    private EstabelecimentoRepository repository;

    public Estabelecimento criarEstabelecimento(Estabelecimento estabelecimento) {
        return repository.save(estabelecimento);
    }

    public List<Estabelecimento> buscarTodos() {
        return repository.findAll();
    }

    public Optional<Estabelecimento> obterEstabelecimentoPorCnpj(String cnpj) {
        return repository.findByCnpj(cnpj);
    }
}
