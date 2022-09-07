package com.modulo5.controleEstoque.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "clientes")
public class ClienteModel implements Serializable {
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
}
