package com.modulo5.controleEstoque.repository;

import com.modulo5.controleEstoque.model.ItemEstoqueModel;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ItemEstoqueRepository extends JpaRepository<ItemEstoqueModel, Long> {
}
