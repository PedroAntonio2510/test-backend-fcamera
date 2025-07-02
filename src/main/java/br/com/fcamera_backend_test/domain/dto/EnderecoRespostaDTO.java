package br.com.fcamera_backend_test.domain.dto;

public record EnderecoRespostaDTO(
        String cep,
        String rua,
        int numero,
        String bairro,
        String cidade,
        String complemento
) {
}
