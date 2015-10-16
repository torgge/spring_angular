package com.gbonespirito.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Produtos")
public class Produto {
	@Id
	@GeneratedValue
	private int id;
	private String descricao;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Produto() {		
		
	}

	public Produto(String descricao) {		
		this.descricao = descricao;
	}

}
