package com.modulo5.controleEstoque.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "precos")
public class PrecoModel {
    @Id
    private Long codigo;

    @Column(length = 10, nullable = false)
    private BigDecimal precoDeCusto;

    @Column(length = 10, nullable = false)
    private BigDecimal precoParaRevenda;

    @Column(length = 10, nullable = false)
    private BigDecimal precoParaCliente;

    @OneToOne
    @JoinColumn(name = "produto_codigo", referencedColumnName = "codigo")
    private ProdutoModel produto;
}
