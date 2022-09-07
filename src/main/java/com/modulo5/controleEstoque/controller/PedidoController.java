package com.modulo5.controleEstoque.controller;

import com.modulo5.controleEstoque.model.PedidoModel;
import com.modulo5.controleEstoque.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PedidoController {
    @Autowired
    private PedidoService pedidoService;

    @GetMapping(path = "/pedidos")
    public ResponseEntity<List<PedidoModel>> buscarTodosPedidos() {
        return ResponseEntity.ok(pedidoService.buscarTodos());
    }

    @GetMapping(path = "/pedidos/{codigo}")
    public ResponseEntity<Optional<PedidoModel>> buscarPedidoPorId(@PathVariable Long codigo) {
        return ResponseEntity.ok(pedidoService.buscarPorId(codigo));
    }

    @PostMapping(path = "/pedidos")
    public ResponseEntity<PedidoModel> cadastrarPedido(@RequestBody PedidoModel pedidoModel) {
        return new ResponseEntity<>(pedidoService.cadastrar(pedidoModel), HttpStatus.CREATED);
    }

    @PutMapping(path = "/pedidos/{codigo}")
    public ResponseEntity<PedidoModel> alterarPedido(@RequestBody PedidoModel pedidoModel, @PathVariable Long codigo) {
        return ResponseEntity.ok(pedidoService.alterar(pedidoModel));
    }

    @DeleteMapping(path = "/pedidos/{codigo}")
    public ResponseEntity<?> deletarPedido(@PathVariable Long codigo) {
        pedidoService.deletar(codigo);
        return ResponseEntity.noContent().build();
    }
}
