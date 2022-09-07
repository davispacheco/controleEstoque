package com.davispacheco.controleEstoque.repository;

import com.davispacheco.controleEstoque.model.ItemPedidoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedidoModel, Long> {
}
