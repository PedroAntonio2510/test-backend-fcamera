package br.com.fcamera_backend_test.domain.dto;

import br.com.fcamera_backend_test.domain.enums.TipoVeiculo;

public record VeiculoRespostaDTO(
        String marca,
        String modelo,
        String cor,
        String placa,
        TipoVeiculo tipoVeiculo,
//        RegistroRespostaDTO registro,
        String estabelecimento_nome
) {
}
