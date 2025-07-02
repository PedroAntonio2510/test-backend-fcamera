package br.com.fcamera_backend_test.domain.dto;

public record EnderecoCadastroDTO(
        String cep,
        String rua,
        int numero,
        String cidade,
        String bairro,
        String complemento
) {
}
