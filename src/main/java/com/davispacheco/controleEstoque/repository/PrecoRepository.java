package com.davispacheco.controleEstoque.repository;

import com.davispacheco.controleEstoque.model.PrecoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrecoRepository extends JpaRepository<PrecoModel, long> {
}
