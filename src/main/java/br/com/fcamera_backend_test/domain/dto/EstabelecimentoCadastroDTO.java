package br.com.fcamera_backend_test.domain.dto;

import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.br.CNPJ;

import java.util.List;

public record EstabelecimentoCadastroDTO(
        @NotNull(message = "Precisa informar o nome do estabelecimento")
        String nome,

        @CNPJ(message = "CNPJ inválido")
        @NotNull(message = "Precisa informar um cnpj")
        String cnpj,

        @NotNull(message = "Precisa informar o endereco do estabelecimento")
        List<EnderecoCadastroDTO> endereco,

        @NotNull(message = "Precisa especificar o telefone do estabelecimento")
        String telefone,

        @NotNull(message = "Precisa especificar quantidade de vagas")
        Integer qnt_vagas_motos,

        @NotNull(message = "Precisa especificar quantidade de vagas")
        Integer qnt_vagas_carros
) {
}
