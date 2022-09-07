package com.davispacheco.controleEstoque.service;

import com.davispacheco.controleEstoque.model.VendedorModel;
import com.davispacheco.controleEstoque.repository.VendedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VendedorService {
    @Autowired
    private VendedorRepository vendedorRepository;

    public List<VendedorModel> buscarTodos() {
        return vendedorRepository.findAll();
    }

    public Optional<VendedorModel> buscarPorId(Long codigo) {
        return vendedorRepository.findById(codigo);
    }

    public VendedorModel cadastrar(VendedorModel vendedorModel) {
        return vendedorRepository.save(vendedorModel);
    }

    public VendedorModel alterar(VendedorModel vendedorModel, Long codigo) {
        return vendedorRepository.save(vendedorModel);
    }

    public void deletar(Long codigo) {
        vendedorRepository.deleteById(codigo);
    }
}
