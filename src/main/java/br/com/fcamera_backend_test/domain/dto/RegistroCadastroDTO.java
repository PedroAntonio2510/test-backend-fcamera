package br.com.fcamera_backend_test.domain.dto;

import br.com.fcamera_backend_test.domain.Veiculo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record RegistroCadastroDTO(
        String veiculo_placa,
        LocalDateTime dataEntrada,
        LocalDateTime dataSaida,
        String estabelecimento_nome
) {
}
