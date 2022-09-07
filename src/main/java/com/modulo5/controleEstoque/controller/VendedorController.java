package com.modulo5.controleEstoque.controller;

import com.modulo5.controleEstoque.model.VendedorModel;
import com.modulo5.controleEstoque.service.VendedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class VendedorController {
    @Autowired
    private VendedorService vendedorService;

    @GetMapping(path = "/vendedores")
    public ResponseEntity<List<VendedorModel>> buscarTodasVendas() {
        return ResponseEntity.ok(vendedorService.buscarTodos());
    }

    @GetMapping(path = "/vendedores/{codigo}")
    public ResponseEntity<Optional<VendedorModel>> buscarVendaPorId(@PathVariable Long codigo) {
        return ResponseEntity.ok(vendedorService.buscarPorId(codigo));
    }

    @PostMapping(path = "/vendedores")
    public ResponseEntity<VendedorModel> cadastrarVendedor(@RequestBody VendedorModel vendedorModel) {
        return new ResponseEntity<>(vendedorService.cadastrar(vendedorModel), HttpStatus.CREATED);
    }

    @PutMapping(path = "/vendedores/{codigo}")
    public ResponseEntity<VendedorModel> alterarVendedor(@RequestBody VendedorModel vendedorModel, @PathVariable Long codigo) {
        return ResponseEntity.ok(vendedorService.alterar(vendedorModel, codigo));
    }

    @DeleteMapping(path = "/vendedores/{codigo}")
    public ResponseEntity<?> deletarVendedor(@PathVariable Long codigo) {
        vendedorService.deletar(codigo);
        return ResponseEntity.noContent().build();
    }
}
