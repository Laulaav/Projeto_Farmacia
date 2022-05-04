package com.farmacialider.drugstore.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank(message= "O nome é obrigatório!")
	@Size(min = 5, max = 50, message= "O nome deve conter no mínimo 5 e no máximo 50 caracteres")
	private String nome;
	
	@NotBlank(message= "A data de validade é obrigatório!")
	@Size(max = 10, message= "A validade deve ter no máximo 10 caracteres")
	private String validade;
	
	@NotBlank(message= "A descrição é obrigatório!")
	@Size(min = 10, max = 1000, message= "A descrição deve conter no mínimo 10 e no máximo 1000 caracteres")
	private String descricao;
	
	@NotBlank(message= "O preço é obrigatório!")
	private String preco;
	
	@NotBlank(message= "A marca é obrigatório!")
	@Size(min = 2, max = 20, message= "A marca deve conter no mínimo 2 e no máximo 20 caracteres")
	private String marca;
	
	private int estoque;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getValidade() {
		return validade;
	}

	public void setValidade(String validade) {
		this.validade = validade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
}
