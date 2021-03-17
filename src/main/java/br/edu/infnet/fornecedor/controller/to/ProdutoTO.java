package br.edu.infnet.fornecedor.controller.to;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ProdutoTO {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String nome;
	
	private Double preco;

	public ProdutoTO() {
	}
	
	public ProdutoTO(String nome, Double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}

	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public Double getPreco() {
		return preco;
	}



	public void setPreco(Double preco) {
		this.preco = preco;
	}
	

	
	@Override
	public String toString() {
		return "ProdutoTO [id=" + id + ", nome=" + nome + ", preco=" + preco + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}



	

}
