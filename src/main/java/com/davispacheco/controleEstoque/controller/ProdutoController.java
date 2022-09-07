package com.davispacheco.controleEstoque.controller;

import com.davispacheco.controleEstoque.model.ProdutoModel;
import com.davispacheco.controleEstoque.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;

    @GetMapping(path = "/produtos")
    public ResponseEntity<List<ProdutoModel>> buscarTodosProdutos() {
        return ResponseEntity.ok(produtoService.buscarTodos());
    }

    @GetMapping(path = "/produtos/{codigo}")
    public ResponseEntity<Optional<ProdutoModel>> buscarProdutoPorId(@PathVariable Long codigo) {
        return ResponseEntity.ok(produtoService.buscarPorId(codigo));
    }

    @PostMapping(path = "/produtos")
    public ResponseEntity<ProdutoModel> cadastrarProduto(@RequestBody ProdutoModel produtoModel) {
        return new ResponseEntity<>(produtoService.cadastrar(produtoModel), HttpStatus.CREATED);
    }

    @PutMapping(path = "/produtos/{codigo}")
    public ResponseEntity<ProdutoModel> alterarProduto(@RequestBody ProdutoModel produtoModel, @PathVariable Long codigo) {
        return ResponseEntity.ok(produtoService.alterar(produtoModel));
    }

    @DeleteMapping(path = "/produtos/{codigo}")
    public ResponseEntity<?> deletarProduto(@PathVariable Long codigo) {
        produtoService.deletar(codigo);
        return ResponseEntity.noContent().build();
    }
}
