package com.machap.financas.api.repository.lancamento;

import java.util.List;

import com.machap.financas.api.model.Lancamento;
import com.machap.financas.api.repository.filter.LancamentoFilter;

public interface LancamentoRepositoryQuery {
	public List<Lancamento> filtrar(LancamentoFilter filter);
}
