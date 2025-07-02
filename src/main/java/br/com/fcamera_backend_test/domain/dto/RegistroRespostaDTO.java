package br.com.fcamera_backend_test.domain.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record RegistroRespostaDTO(
        String id,
        String marcaVeiculo,
        String modeloVeiculo,
        String placaVeiculo,
        LocalDateTime dataEntrada,
        LocalDateTime dataSaida,
        BigDecimal valorTotal
) {
}
