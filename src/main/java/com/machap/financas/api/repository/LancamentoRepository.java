package com.machap.financas.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.machap.financas.api.model.Lancamento;
import com.machap.financas.api.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {

}
