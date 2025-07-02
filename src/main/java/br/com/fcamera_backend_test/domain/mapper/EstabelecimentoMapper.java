package br.com.fcamera_backend_test.domain.mapper;

import br.com.fcamera_backend_test.domain.Endereco;
import br.com.fcamera_backend_test.domain.Estabelecimento;
import br.com.fcamera_backend_test.domain.dto.*;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class EstabelecimentoMapper {

    public static Estabelecimento toEntity(EstabelecimentoCadastroDTO dto) {
        if (dto == null) {
            return null;
        }
        Estabelecimento estabelecimento = new Estabelecimento();
        estabelecimento.setNome(dto.nome());
        estabelecimento.setCnpj(dto.cnpj());
        estabelecimento.setEnderecos(dto.endereco().stream()
                .map(enderecoDTO -> new Endereco(enderecoDTO.cep(),
                        enderecoDTO.rua(),
                        enderecoDTO.numero(),
                        enderecoDTO.cidade(),
                        enderecoDTO.bairro(),
                        enderecoDTO.complemento(),
                        estabelecimento)
                ).collect(Collectors.toList()));
        estabelecimento.setTelefone(dto.telefone());
        estabelecimento.setQnt_vagas_motos(dto.qnt_vagas_motos());
        estabelecimento.setQnt_vagas_carros(dto.qnt_vagas_carros());
        return estabelecimento;
    }

    public static EstabelecimentoRespostaDTO toRespostaDTO(Estabelecimento estabelecimento) {
        return new EstabelecimentoRespostaDTO(
                estabelecimento.getNome(),
                estabelecimento.getCnpj(),
                estabelecimento.getEnderecos().stream()
                        .map(endereco -> new EnderecoRespostaDTO(
                                endereco.getCep(),
                                endereco.getRua(),
                                endereco.getNumero(),
                                endereco.getCidade(),
                                endereco.getBairro(),
                                endereco.getComplemento()
                        )).collect(Collectors.toList()),
                estabelecimento.getTelefone(),
                estabelecimento.getQnt_vagas_motos(),
                estabelecimento.getQnt_vagas_carros(),
                estabelecimento.getVeiculos().stream()
                        .map(veiculo -> new VeiculoRespostaDTO(
                                veiculo.getMarca(),
                                veiculo.getModelo(),
                                veiculo.getCor(),
                                veiculo.getPlaca(),
                                veiculo.getTipoVeiculo(),
                                veiculo.getEstabelecimento().getNome()
                        )).collect(Collectors.toSet()),
                estabelecimento.getRegistro().stream()
                        .map(registro -> new RegistroRespostaDTO(
                                registro.getId(),
                                registro.getveiculo().getMarca(),
                                registro.getveiculo().getModelo(),
                                registro.getveiculo().getPlaca(),
                                registro.getDataEntrada(),
                                registro.getDataSaida(),
                                registro.getValorTotal()
                        )).collect(Collectors.toList())
        );
    }
}
