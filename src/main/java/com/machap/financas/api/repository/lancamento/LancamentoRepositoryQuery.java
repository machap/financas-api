package com.machap.financas.api.repository.lancamento;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.machap.financas.api.model.Lancamento;
import com.machap.financas.api.repository.filter.LancamentoFilter;
import com.machap.financas.api.repository.projection.ResumoLancamento;

public interface LancamentoRepositoryQuery {
	public Page<Lancamento> filtrar(LancamentoFilter filter, Pageable pageable);
	public Page<ResumoLancamento> resumir(LancamentoFilter filter, Pageable pageable);
}
