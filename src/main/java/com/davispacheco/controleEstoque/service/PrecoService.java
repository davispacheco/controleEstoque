package com.davispacheco.controleEstoque.service;

import com.davispacheco.controleEstoque.model.PrecoModel;
import com.davispacheco.controleEstoque.repository.PrecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PrecoService {
    @Autowired
    private PrecoRepository precoRepository;

    public List<PrecoModel> buscarTodos() {
        return precoRepository.findAll();
    }

    public Optional<PrecoModel> buscarPorId(Long codigo) {
        return precoRepository.findById(codigo);
    }

    public PrecoModel cadastrar(PrecoModel precoModel) {
        return precoRepository.save(precoModel);
    }

    public PrecoModel alterar(PrecoModel precoModel, Long codigo) {
        return precoRepository.save(precoModel);
    }

    public void deletar(Long codigo) {
        precoRepository.deleteById(codigo);
    }
}
