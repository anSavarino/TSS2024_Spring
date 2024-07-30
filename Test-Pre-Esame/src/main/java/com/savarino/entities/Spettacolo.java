package com.savarino.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "spettacoli")
public class Spettacolo {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String titolo;
    private String regista;
    private List<String> attori;
    
	public Spettacolo(String titolo, String regista, List<String> attori) {
		this.titolo = titolo;
		this.regista = regista;
		this.attori = attori;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getRegista() {
		return regista;
	}

	public void setRegista(String regista) {
		this.regista = regista;
	}

	public List<String> getAttori() {
		return attori;
	}

	public void setAttori(List<String> attori) {
		this.attori = attori;
	}
	
	
    
    
    
}
