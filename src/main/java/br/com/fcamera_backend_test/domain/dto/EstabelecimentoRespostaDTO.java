package br.com.fcamera_backend_test.domain.dto;

import java.util.List;
import java.util.Set;

public record EstabelecimentoRespostaDTO(
        String nome,
        String cnpj,
        List<EnderecoRespostaDTO> enderecoRespostaDTO,
        String telefone,
        Integer qnt_vagas_motos,
        Integer qnt_vagas_carros,
        Set<VeiculoRespostaDTO> veiculos,
        List<RegistroRespostaDTO> registros
) {
}
