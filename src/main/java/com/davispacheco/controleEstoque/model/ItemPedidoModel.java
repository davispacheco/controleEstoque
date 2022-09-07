package com.davispacheco.controleEstoque.model;

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
@Table(name = "itens_pedido")
public class ItemPedidoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    private BigDecimal precoUnitario;

    @ManyToOne
    @JoinColumn(name = "pedido_codigo", referencedColumnName = "codigo")
    private PedidoModel pedido;

    @ManyToOne
    @JoinColumn(name = "produto_codigo", referencedColumnName = "codigo")
    private ProdutoModel produto;
}
