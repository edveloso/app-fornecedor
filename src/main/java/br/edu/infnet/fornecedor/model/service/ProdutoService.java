package br.edu.infnet.fornecedor.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.fornecedor.controller.to.ProdutoTO;
import br.edu.infnet.fornecedor.model.repository.ProdutoRepository;

@Service
public class ProdutoService {

	
	@Autowired
	private ProdutoRepository produtoRepository;

	public List<ProdutoTO> getAll() {
		return (List<ProdutoTO>) produtoRepository.findAll();
	}

	public ProdutoTO salvar(ProdutoTO produto) {
		return produtoRepository.save(produto);
	}

	public Optional<ProdutoTO> getById(Long id) {
		return produtoRepository.findById(id);
	}

}
