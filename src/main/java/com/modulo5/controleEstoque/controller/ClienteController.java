package com.modulo5.controleEstoque.controller;

import com.modulo5.controleEstoque.model.ClienteModel;
import com.modulo5.controleEstoque.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping(path = "/clientes")
    public ResponseEntity<List<ClienteModel>> buscarTodosClientes() {
        return ResponseEntity.ok(clienteService.buscarTodos());
    }

    @GetMapping(path = "/clientes/{codigo}")
    public ResponseEntity<Optional<ClienteModel>> buscarClientePorId(@PathVariable Long codigo) {
        return ResponseEntity.ok(clienteService.buscarPorId(codigo));
    }

    @PostMapping(path = "/clientes")
    public ResponseEntity<ClienteModel> cadastrarCliente(@RequestBody ClienteModel clienteModel) {
        return new ResponseEntity<>(clienteService.cadastrar(clienteModel), HttpStatus.CREATED);
    }

    @PutMapping(path = "/clientes/{codigo}")
    public ResponseEntity<ClienteModel> alterarCliente(@RequestBody ClienteModel clienteModel, @PathVariable Long codigo) {
        return ResponseEntity.ok(clienteService.alterar(clienteModel, codigo));
    }

    @DeleteMapping(path = "/clientes/{codigo}")
    public ResponseEntity<?> deletarCliente(@PathVariable Long codigo) {
        clienteService.deletar(codigo);
        return ResponseEntity.noContent().build();
    }
}
