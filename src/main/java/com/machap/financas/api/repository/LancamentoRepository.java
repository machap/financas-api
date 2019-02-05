package com.machap.financas.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.machap.financas.api.model.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{

}
