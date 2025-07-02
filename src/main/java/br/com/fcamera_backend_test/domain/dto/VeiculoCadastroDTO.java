package br.com.fcamera_backend_test.domain.dto;

import br.com.fcamera_backend_test.domain.enums.TipoVeiculo;
import jakarta.validation.constraints.NotNull;

public record VeiculoCadastroDTO(
        @NotNull(message = "Campo invalido")
        String marca,

        @NotNull(message = "Campo invalido")
        String modelo,

        @NotNull(message = "Campo invalido")
        String cor,

        @NotNull(message = "Campo invalido")
        String placa,

        @NotNull(message = "Campo invalido")
        TipoVeiculo tipoVeiculo
) {
}
