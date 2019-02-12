package com.machap.financas.api.repository.pessoa;

import java.util.List;

import com.machap.financas.api.model.Pessoa;
import com.machap.financas.api.repository.filter.PessoaFilter;

public interface PessoaRepositoryQuery {
	public List<Pessoa> filtrar(PessoaFilter pessoaFilter);
}
