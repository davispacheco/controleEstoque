package com.davispacheco.controleEstoque.controller;

import com.davispacheco.controleEstoque.model.ItemPedidoModel;
import com.davispacheco.controleEstoque.service.ItemPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ItemPedidoController {
    @Autowired
    private ItemPedidoService itemPedidoService;

    @GetMapping(path = "/itens_pedido")
    public ResponseEntity<List<ItemPedidoModel>> buscarTodosItensPedido() {
        return ResponseEntity.ok(itemPedidoService.buscarTodos());
    }

    @GetMapping(path = "/itens_pedido/{codigo}")
    public ResponseEntity<Optional<ItemPedidoModel>> buscarItemPedidoPorId(@PathVariable Long codigo) {
        return ResponseEntity.ok(itemPedidoService.buscarPorId(codigo));
    }

    @PostMapping(path = "/itens_pedido")
    public ResponseEntity<ItemPedidoModel> cadastrarItemPedido(@RequestBody ItemPedidoModel itemPedidoModel) {
        return new ResponseEntity<>(itemPedidoService.cadastrar(itemPedidoModel), HttpStatus.CREATED);
    }

    @PutMapping(path = "/itens_estoque/{codigo}")
    public ResponseEntity<ItemPedidoModel> alterarItemPedido(@RequestBody ItemPedidoModel itemPedidoModel, @PathVariable Long codigo) {
        return ResponseEntity.ok(itemPedidoService.alterar(itemPedidoModel, codigo));
    }

    @DeleteMapping(path = "/itens_estoque/{codigo}")
    public ResponseEntity<?> deletarItemPedido(@PathVariable Long codigo) {
        itemEstoqueService.deletar(codigo);
        return ResponseEntity.noContent().build();
    }
}
