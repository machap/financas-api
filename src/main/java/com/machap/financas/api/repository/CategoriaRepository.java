package com.machap.financas.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.machap.financas.api.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
