package com.davispacheco.controleEstoque.repository;

import com.davispacheco.controleEstoque.model.ItemEstoqueModel;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ItemEstoqueRepository extends JpaRepository<ItemEstoqueModel, Long> {
}
