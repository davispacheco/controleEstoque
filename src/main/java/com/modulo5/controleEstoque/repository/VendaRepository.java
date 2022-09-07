package com.modulo5.controleEstoque.repository;

import com.modulo5.controleEstoque.model.VendaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendaRepository extends JpaRepository<VendaModel, Long> {
}
