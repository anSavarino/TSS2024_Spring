package com.savarino.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "posti")
public class Posto {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private int fila;
	private int numero;
	private TipoPosto tipoPosto;
	
	public Posto(int fila, int numero, TipoPosto tipoPosto) {
		this.fila = fila;
		this.numero = numero;
		this.tipoPosto = tipoPosto;
	}

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public TipoPosto getTipoPosto() {
		return tipoPosto;
	}

	public void setTipoPosto(TipoPosto tipoPosto) {
		this.tipoPosto = tipoPosto;
	}
	
	
	
	
}
