package com.davispacheco.controleEstoque.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "vendedores")
public class VendedorModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column(length = 10, nullable = false)
    private String nome;

    @Column(length = 20, nullable = false)
    private String sobrenome;

    @Column(length = 11, nullable = false)
    private String cpf;

    private LocalDateTime dataCadastro;

    @OneToMany(mappedBy = "vendedor", cascade = CascadeType.ALL)
    private List<VendaModel> vendas = new ArrayList<>();
}
