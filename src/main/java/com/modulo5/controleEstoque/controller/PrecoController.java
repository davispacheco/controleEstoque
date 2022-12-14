package com.modulo5.controleEstoque.controller;

import com.modulo5.controleEstoque.model.PrecoModel;
import com.modulo5.controleEstoque.service.PrecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PrecoController {
    @Autowired
    private PrecoService precoService;

    @GetMapping(path = "/controle_estoque/precos")
    public ResponseEntity<List<PrecoModel>> buscarTodosPrecos() {
        return ResponseEntity.ok(precoService.buscarTodos());
    }

    @GetMapping(path = "/controle_estoque/precos/{codigo}")
    public ResponseEntity<Optional<PrecoModel>> buscarPrecoPorId(@PathVariable Long codigo) {
        return ResponseEntity.ok(precoService.buscarPorId(codigo));
    }

    @PostMapping(path = "/controle_estoque/precos")
    public ResponseEntity<PrecoModel> cadastrarPreco(@RequestBody PrecoModel precoModel) {
        return new ResponseEntity<>(precoService.cadastrar(precoModel), HttpStatus.CREATED);
    }

    @PutMapping(path = "/controle_estoque/precos/{codigo}")
    public ResponseEntity<PrecoModel> alterarPreco(@RequestBody PrecoModel precoModel, @PathVariable Long codigo) {
        return ResponseEntity.ok(precoService.alterar(precoModel, codigo));
    }

    @DeleteMapping(path = "/controle_estoque/precos/{codigo}")
    public ResponseEntity<?> deletarPreco(@PathVariable Long codigo) {
        precoService.deletar(codigo);
        return ResponseEntity.noContent().build();
    }
}
