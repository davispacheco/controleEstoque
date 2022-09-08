package com.modulo5.controleEstoque.controller;

import com.modulo5.controleEstoque.model.EnderecoModel;
import com.modulo5.controleEstoque.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EnderecoController {
    @Autowired
    private EnderecoService enderecoService;

    @GetMapping(path = "/controle_estoque/enderecos")
    public ResponseEntity<List<EnderecoModel>> buscarTodosEnderecos() {
        return ResponseEntity.ok(enderecoService.buscarTodos());
    }

    @GetMapping(path = "/controle_estoque/enderecos/{codigo}")
    public ResponseEntity<Optional<EnderecoModel>> buscarEnderecoPorId(@PathVariable Long codigo) {
        return ResponseEntity.ok(enderecoService.buscarPorId(codigo));
    }

    @PostMapping(path = "/controle_estoque/enderecos")
    public ResponseEntity<EnderecoModel> cadastrarEndereco(@RequestBody EnderecoModel enderecoModel) {
        return new ResponseEntity<>(enderecoService.cadastrar(enderecoModel), HttpStatus.CREATED);
    }

    @PutMapping(path = "/controle_estoque/enderecos/{codigo}")
    public ResponseEntity<EnderecoModel> alterarEndereco(@RequestBody EnderecoModel enderecoModel, @PathVariable Long codigo) {
        return ResponseEntity.ok(enderecoService.alterar(enderecoModel, codigo));
    }

    @DeleteMapping(path = "/controle_estoque/enderecos/{codigo}")
    public ResponseEntity<?> deletarEndereco(@PathVariable Long codigo) {
        enderecoService.deletar(codigo);
        return ResponseEntity.noContent().build();
    }
}
