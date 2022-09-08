package com.modulo5.controleEstoque.controller;

import com.modulo5.controleEstoque.model.VendaModel;
import com.modulo5.controleEstoque.service.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class VendaController {
    @Autowired
    private VendaService vendaService;

    @GetMapping(path = "/controle_estoque/vendas")
    public ResponseEntity<List<VendaModel>> buscarTodasVendas() {
        return ResponseEntity.ok(vendaService.buscarTodas());
    }

    @GetMapping(path = "/controle_estoque/vendas/{codigo}")
    public ResponseEntity<Optional<VendaModel>> buscarVendaPorId(@PathVariable Long codigo) {
        return ResponseEntity.ok(vendaService.buscarPorId(codigo));
    }

    @PostMapping(path = "/controle_estoque/vendas")
    public ResponseEntity<VendaModel> cadastrarVenda(@RequestBody VendaModel vendaModel) {
        return new ResponseEntity<>(vendaService.cadastrar(vendaModel), HttpStatus.CREATED);
    }

    @PutMapping(path = "/controle_estoque/vendas/{codigo}")
    public ResponseEntity<VendaModel> alterarVenda(@RequestBody VendaModel vendaModel, @PathVariable Long codigo) {
        return ResponseEntity.ok(vendaService.alterar(vendaModel, codigo));
    }

    @DeleteMapping(path = "/controle_estoque/vendas/{codigo}")
    public ResponseEntity<?> deletarVenda(@PathVariable Long codigo) {
        vendaService.deletar(codigo);
        return ResponseEntity.noContent().build();
    }
}
