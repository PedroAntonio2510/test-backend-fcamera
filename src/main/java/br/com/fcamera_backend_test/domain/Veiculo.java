package br.com.fcamera_backend_test.domain;

import br.com.fcamera_backend_test.domain.enums.TipoVeiculo;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_veiculo")
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "marca")
    private String marca;

    @Column(name = "modelo")
    private String modelo;

    @Column(name = "cor")
    private String cor;

    @Column(name = "placa")
    private String placa;

    @Enumerated(EnumType.STRING)
    private TipoVeiculo tipoVeiculo;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "veiculo_id")
    private Registro registro;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "veiculos")
    private Estabelecimento estabelecimento;
}
