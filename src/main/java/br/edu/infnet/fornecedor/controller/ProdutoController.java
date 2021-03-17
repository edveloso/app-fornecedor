package br.edu.infnet.fornecedor.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.fornecedor.controller.to.ProdutoTO;
import br.edu.infnet.fornecedor.model.service.ProdutoService;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;
	
	@GetMapping
	public List<ProdutoTO> getProdutos(){
		return produtoService.getAll();
	}
	
	@PostMapping
	public ProdutoTO incluir(@RequestBody ProdutoTO produto) {
		return produtoService.salvar(produto);
	}
	
	@GetMapping("/{id}")
	public ProdutoTO getProdutos(@PathVariable  Long id){
		
		Optional<ProdutoTO> produto = produtoService.getById(id);
		
		if(produto.isEmpty())
			return null;
		
		return produto.get();
	}
	
	
	
	
}
