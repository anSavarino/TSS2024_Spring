package com.savarino.entities;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "prenotazioni")
public class Prenotazione {
	String nomeCliente;
    private Date dataPrenotazione;
    private Replica replica;
    private List<Biglietto> biglietti;

    public Prenotazione(String nomeCliente, Date dataPrenotazione, Replica replica, List<Biglietto> biglietti) {
        this.nomeCliente = nomeCliente;
        this.dataPrenotazione = dataPrenotazione;
        this.replica = replica;
        this.biglietti = biglietti;
    }

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public Date getDataPrenotazione() {
		return dataPrenotazione;
	}

	public void setDataPrenotazione(Date dataPrenotazione) {
		this.dataPrenotazione = dataPrenotazione;
	}

	public Replica getReplica() {
		return replica;
	}

	public void setReplica(Replica replica) {
		this.replica = replica;
	}

	public List<Biglietto> getBiglietti() {
		return biglietti;
	}

	public void setBiglietti(List<Biglietto> biglietti) {
		this.biglietti = biglietti;
	}
    
    
}
