package br.edu.infnet.fornecedor.model.repository;

import org.springframework.data.repository.CrudRepository;

import br.edu.infnet.fornecedor.controller.to.ProdutoTO;

public interface ProdutoRepository extends CrudRepository<ProdutoTO, Long> {

}
