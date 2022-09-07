package com.davispacheco.controleEstoque.service;

import com.davispacheco.controleEstoque.model.ProdutoModel;
import com.davispacheco.controleEstoque.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;

    public List<ProdutoModel> buscarTodos() {
        return produtoRepository.findAll();
    }

    public Optional<ProdutoModel> buscarPorId(Long codigo) {
        return produtoRepository.findById(codigo);
    }

    public ProdutoModel cadastrar(ProdutoModel produtoModel) {
        return produtoRepository.save(produtoModel);
    }

    public ProdutoModel alterar(ProdutoModel produtoModel, Long codigo) {
        return produtoRepository.save(produtoModel);
    }

    public void deletar(Long codigo) {
        produtoRepository.deleteById(codigo);
    }
}
