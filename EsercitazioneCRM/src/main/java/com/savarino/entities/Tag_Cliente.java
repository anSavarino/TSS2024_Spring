package com.savarino.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Tag_Cliente")
public class Tag_Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_Tag")
	private int ID_Tag;
	
	private String Nome_Tag;
	

	public int getID_Tag() {
		return ID_Tag;
	}

	public void setID_Tag(int iD_Tag) {
		ID_Tag = iD_Tag;
	}

	public String getNome_Tag() {
		return Nome_Tag;
	}

	public void setNome_Tag(String nome_Tag) {
		Nome_Tag = nome_Tag;
	}

	
}
