package com.modulo5.controleEstoque.service;

import com.modulo5.controleEstoque.model.ItemPedidoModel;
import com.modulo5.controleEstoque.repository.ItemPedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemPedidoService {
    @Autowired
    private ItemPedidoRepository itemPedidoRepository;

    public List<ItemPedidoModel> buscarTodos() {
        return itemPedidoRepository.findAll();
    }

    public Optional<ItemPedidoModel> buscarPorId(Long codigo) {
        return itemPedidoRepository.findById(codigo);
    }

    public ItemPedidoModel cadastrar(ItemPedidoModel itemPedidoModel) {
        return itemPedidoRepository.save(itemPedidoModel);
    }

    public ItemPedidoModel alterar(ItemPedidoModel itemPedidoModel, Long codigo) {
        return itemPedidoRepository.save(itemPedidoModel);
    }

    public void deletar(Long codigo) {
        itemPedidoRepository.deleteById(codigo);
    }
}
