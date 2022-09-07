package com.davispacheco.controleEstoque.service;

import com.davispacheco.controleEstoque.model.PedidoModel;
import com.davispacheco.controleEstoque.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;

    public List<PedidoModel> buscarTodos() {
        return pedidoRepository.findAll();
    }

    public Optional<PedidoModel> buscarPorId(Long codigo) {
        return pedidoRepository.findById(codigo);
    }

    public PedidoModel cadastrar(PedidoModel pedidoModel) {
        return pedidoRepository.save(pedidoModel);
    }

    public PedidoModel alterar(PedidoModel pedidoModel, Long codigo) {
        return pedidoRepository.save(pedidoModel);
    }

    public void deletar(Long codigo) {
        pedidoRepository.deleteById(codigo);
    }
}
