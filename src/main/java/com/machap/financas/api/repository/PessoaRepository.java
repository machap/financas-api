package com.machap.financas.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.machap.financas.api.model.Pessoa;
import com.machap.financas.api.repository.pessoa.PessoaRepositoryQuery;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>, PessoaRepositoryQuery {

}
