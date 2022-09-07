package com.davispacheco.controleEstoque.service;

import com.davispacheco.controleEstoque.model.ItemEstoqueModel;
import com.davispacheco.controleEstoque.repository.ItemEstoqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemEstoqueService {
    @Autowired
    private ItemEstoqueRepository itemEstoqueRepository;

    public List<ItemEstoqueModel> buscarTodos() {
        return itemEstoqueRepository.findAll();
    }

    public Optional<ItemEstoqueModel> buscarPorId(Long codigo) {
        return itemEstoqueRepository.findById(codigo);
    }

    public ItemEstoqueModel cadastrar(ItemEstoqueModel itemEstoqueModel) {
        return itemEstoqueRepository.save(itemEstoqueModel);
    }

    public ItemEstoqueModel alterar(ItemEstoqueModel itemEstoqueModel, Long codigo) {
        return itemEstoqueRepository.save(itemEstoqueModel);
    }

    public void deletar(Long codigo) {
        itemEstoqueRepository.deleteById(codigo);
    }
}
