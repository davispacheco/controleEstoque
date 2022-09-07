package com.davispacheco.controleEstoque.repository;

import com.davispacheco.controleEstoque.model.PedidoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<PedidoModel, Long> {
}
