package com.davispacheco.controleEstoque.repository;

import com.davispacheco.controleEstoque.model.VendedorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendedorRepository extends JpaRepository<VendedorModel, Long> {
}
