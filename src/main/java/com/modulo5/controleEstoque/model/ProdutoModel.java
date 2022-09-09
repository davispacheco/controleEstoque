package com.modulo5.controleEstoque.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "produtos")
public class ProdutoModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column(length = 20, nullable = false)
    private String nome;

    private LocalDateTime dataCadastro;

    @OneToOne
    @JoinColumn(name = "preco_codigo", referencedColumnName = "codigo")
    private PrecoModel preco;

    @OneToMany(mappedBy = "produto", cascade = CascadeType.ALL)
    private List<ItemPedidoModel> itensPedido = new ArrayList<>();
}
