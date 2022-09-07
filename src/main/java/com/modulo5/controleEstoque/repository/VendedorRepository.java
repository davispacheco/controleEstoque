package com.modulo5.controleEstoque.repository;

import com.modulo5.controleEstoque.model.VendedorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendedorRepository extends JpaRepository<VendedorModel, Long> {
}
