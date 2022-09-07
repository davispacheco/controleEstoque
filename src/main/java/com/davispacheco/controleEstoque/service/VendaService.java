package com.davispacheco.controleEstoque.service;

import com.davispacheco.controleEstoque.model.VendaModel;
import com.davispacheco.controleEstoque.repository.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VendaService {
    @Autowired
    private VendaRepository vendaRepository;

    public List<VendaModel> buscarTodas() {
        return vendaRepository.findAll();
    }

    public Optional<VendaModel> buscarPorId(Long codigo) {
        return vendaRepository.findById(codigo);
    }

    public VendaModel cadastrar(VendaModel vendaModel) {
        return vendaRepository.save(vendaModel);
    }

    public VendaModel alterar(VendaModel vendaModel, Long codigo) {
        return vendaRepository.save(vendaModel);
    }

    public void deletar(Long codigo) {
        vendaRepository.deleteById(codigo);
    }
}
