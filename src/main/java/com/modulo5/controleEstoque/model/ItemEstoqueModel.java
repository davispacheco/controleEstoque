package com.modulo5.controleEstoque.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "itens_estoque")
public class ItemEstoqueModel implements Serializable {
    @Id
    private Long codigo;

    @ManyToOne
    @JoinColumn(name = "produto_codigo", referencedColumnName = "codigo")
    private ProdutoModel produto;
}
