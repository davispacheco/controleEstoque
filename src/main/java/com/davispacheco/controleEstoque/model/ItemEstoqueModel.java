package com.davispacheco.controleEstoque.model;

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
@Table(name = "estoques")
public class ItemEstoqueModel implements Serializable {
    @Id
    private Long codigo;

    @ManyToOne
    @JoinColumn(name = "produto_codigo", referencedColumnName = "codigo")
    private ProdutoModel produto;
}
