package com.modulo5.controleEstoque.controller;

import com.modulo5.controleEstoque.model.ItemEstoqueModel;
import com.modulo5.controleEstoque.service.ItemEstoqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ItemEstoqueController {
    @Autowired
    private ItemEstoqueService itemEstoqueService;

    @GetMapping(path = "/controle_estoque/itens_estoque")
    public ResponseEntity<List<ItemEstoqueModel>> buscarTodosItensEstoque() {
        return ResponseEntity.ok(itemEstoqueService.buscarTodos());
    }

    @GetMapping(path = "/controle_estoque/itens_estoque/{codigo}")
    public ResponseEntity<Optional<ItemEstoqueModel>> buscarItemEstoquePorId(@PathVariable Long codigo) {
        return ResponseEntity.ok(itemEstoqueService.buscarPorId(codigo));
    }

    @PostMapping(path = "/controle_estoque/itens_estoque")
    public ResponseEntity<ItemEstoqueModel> cadastrarItemEstoque(@RequestBody ItemEstoqueModel itemEstoqueModel) {
        return new ResponseEntity<>(itemEstoqueService.cadastrar(itemEstoqueModel), HttpStatus.CREATED);
    }

    @PutMapping(path = "/controle_estoque/itens_estoque/{codigo}")
    public ResponseEntity<ItemEstoqueModel> alterarItemEstoque(@RequestBody ItemEstoqueModel itemEstoqueModel, @PathVariable Long codigo) {
        return ResponseEntity.ok(itemEstoqueService.alterar(itemEstoqueModel, codigo));
    }

    @DeleteMapping(path = "/controle_estoque/itens_estoque/{codigo}")
    public ResponseEntity<?> deletarItemEstoque(@PathVariable Long codigo) {
        itemEstoqueService.deletar(codigo);
        return ResponseEntity.noContent().build();
    }
}
