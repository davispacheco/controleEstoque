package com.modulo5.controleEstoque.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "vendas")
public class VendaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    private LocalDateTime dataCadastro;

    @ManyToOne
    @JoinColumn(name = "vendedor_codigo", referencedColumnName = "codigo")
    private VendedorModel vendedor;
}
