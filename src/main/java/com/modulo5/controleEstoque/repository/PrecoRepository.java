package com.modulo5.controleEstoque.repository;

import com.modulo5.controleEstoque.model.PrecoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrecoRepository extends JpaRepository<PrecoModel, long> {
}
