package com.davispacheco.controleEstoque.controller;

import com.davispacheco.controleEstoque.model.PrecoModel;
import com.davispacheco.controleEstoque.service.PrecoService;
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

    @GetMapping(path = "/precos")
    public ResponseEntity<List<PrecoModel>> buscarTodosPrecos() {
        return ResponseEntity.ok(precoService.buscarTodos());
    }

    @GetMapping(path = "/precos/{codigo}")
    public ResponseEntity<Optional<PrecoModel>> buscarPrecoPorId(@PathVariable Long codigo) {
        return ResponseEntity.ok(precoService.buscarPorId(codigo));
    }

    @PostMapping(path = "/precos")
    public ResponseEntity<PrecoModel> cadastrarPreco(@RequestBody PrecoModel precoModel) {
        return new ResponseEntity<>(precoService.cadastrar(precoModel), HttpStatus.CREATED);
    }

    @PutMapping(path = "/precos/{codigo}")
    public ResponseEntity<PrecoModel> alterarPreco(@RequestBody PrecoModel precoModel, @PathVariable Long codigo) {
        return ResponseEntity.ok(precoService.alterar(precoModel));
    }

    @DeleteMapping(path = "/precos/{codigo}")
    public ResponseEntity<?> deletarPreco(@PathVariable Long codigo) {
        precoService.deletar(codigo);
        return ResponseEntity.noContent().build();
    }
}
