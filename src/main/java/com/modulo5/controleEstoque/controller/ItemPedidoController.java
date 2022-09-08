package com.modulo5.controleEstoque.controller;

import com.modulo5.controleEstoque.model.ItemPedidoModel;
import com.modulo5.controleEstoque.service.ItemPedidoService;
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

    @GetMapping(path = "/controle_estoque/itens_pedido")
    public ResponseEntity<List<ItemPedidoModel>> buscarTodosItensPedido() {
        return ResponseEntity.ok(itemPedidoService.buscarTodos());
    }

    @GetMapping(path = "/controle_estoque/itens_pedido/{codigo}")
    public ResponseEntity<Optional<ItemPedidoModel>> buscarItemPedidoPorId(@PathVariable Long codigo) {
        return ResponseEntity.ok(itemPedidoService.buscarPorId(codigo));
    }

    @PostMapping(path = "/controle_estoque/itens_pedido")
    public ResponseEntity<ItemPedidoModel> cadastrarItemPedido(@RequestBody ItemPedidoModel itemPedidoModel) {
        return new ResponseEntity<>(itemPedidoService.cadastrar(itemPedidoModel), HttpStatus.CREATED);
    }

    @PutMapping(path = "/controle_estoque/itens_pedido/{codigo}")
    public ResponseEntity<ItemPedidoModel> alterarItemPedido(@RequestBody ItemPedidoModel itemPedidoModel, @PathVariable Long codigo) {
        return ResponseEntity.ok(itemPedidoService.alterar(itemPedidoModel, codigo));
    }

    @DeleteMapping(path = "/controle_estoque/itens_pedido/{codigo}")
    public ResponseEntity<?> deletarItemPedido(@PathVariable Long codigo) {
        itemPedidoService.deletar(codigo);
        return ResponseEntity.noContent().build();
    }
}
