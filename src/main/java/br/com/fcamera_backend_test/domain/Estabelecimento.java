package br.com.fcamera_backend_test.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import org.hibernate.validator.constraints.br.CNPJ;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "tb_estabelecimento")
@EntityListeners(AuditingEntityListener.class)
public class Estabelecimento {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @CNPJ
    private String cnpj;

    @Column(length = 100, name = "nome")
    private String nome;

    @Column(name = "enderecos")
    @OneToMany(mappedBy = "estabelecimento", cascade =  CascadeType.ALL)
    @JsonManagedReference
    private List<Endereco> enderecos;

    @Column(name = "telefone", length = 30)
    private String telefone;

    @Column(name = "qnt_vagas_motos")
    private Integer qnt_vagas_motos;

    @Column(name = "qnt_vagas_carros")
    private Integer qnt_vagas_carros;

    @Column(name = "veiculos")
    @OneToMany(mappedBy = "estabelecimento", cascade = CascadeType.ALL)
    private Set<Veiculo> veiculos;

    @OneToMany(mappedBy = "estabelecimento", cascade = CascadeType.ALL)
    private List<Registro> registro;

    @CreatedDate
    private LocalDateTime data_criacao;

    public Estabelecimento() {
    }

    public Estabelecimento(String id, String cnpj, String nome, List<Endereco> enderecos, String telefone, Integer qnt_vagas_motos, Integer qnt_vagas_carros, Set<Veiculo> veiculos) {
        this.id = id;
        this.cnpj = cnpj;
        this.nome = nome;
        this.enderecos = enderecos;
        this.telefone = telefone;
        this.qnt_vagas_motos = qnt_vagas_motos;
        this.qnt_vagas_carros = qnt_vagas_carros;
        this.veiculos = veiculos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Integer getQnt_vagas_motos() {
        return qnt_vagas_motos;
    }

    public void setQnt_vagas_motos(Integer qnt_vagas_motos) {
        this.qnt_vagas_motos = qnt_vagas_motos;
    }

    public Integer getQnt_vagas_carros() {
        return qnt_vagas_carros;
    }

    public void setQnt_vagas_carros(Integer qnt_vagas_carros) {
        this.qnt_vagas_carros = qnt_vagas_carros;
    }

    public Set<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(Set<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public List<Registro> getRegistro() {
        return registro;
    }

    public void setRegistro(List<Registro> registro) {
        this.registro = registro;
    }

    public LocalDateTime getData_criacao() {
        return data_criacao;
    }

    public void setData_criacao(LocalDateTime data_criacao) {
        this.data_criacao = data_criacao;
    }
}

