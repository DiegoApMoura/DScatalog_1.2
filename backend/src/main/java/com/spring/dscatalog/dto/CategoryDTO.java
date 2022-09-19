package com.spring.dscatalog.dto;

import java.io.Serializable;

import com.spring.dscatalog.entities.Category;

public class CategoryDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	
	public CategoryDTO() {}

	public CategoryDTO(Long id, String nome) {
		
		this.id = id;
		this.name = nome;
	}
	
	public CategoryDTO (Category entity) {
		this.id = entity.getId();
		this.name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return name;
	}

	public void setNome(String nome) {
		name = nome;
	}

}
