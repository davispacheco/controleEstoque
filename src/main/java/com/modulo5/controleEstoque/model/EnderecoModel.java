package com.modulo5.controleEstoque.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "enderecos")
public class EnderecoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column(length = 20, nullable = false)
    private String logradouro;

    @Column(length = 3, nullable = false)
    private String numero;

    @Column(length = 20, nullable = false)
    private String bairro;

    @Column(length = 8, nullable = false)
    private String cep;

    @Column(length = 20, nullable = false)
    private String cidade;

    @Column(length = 20, nullable = false)
    private String estado;

    @ManyToOne
    @JoinColumn(name = "cliente_codigo", referencedColumnName = "codigo")
    private ClienteModel cliente;
}
