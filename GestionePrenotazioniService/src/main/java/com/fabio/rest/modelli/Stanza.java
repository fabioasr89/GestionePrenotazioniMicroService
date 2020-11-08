package com.fabio.rest.modelli;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="STANZE")
public class Stanza {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="codice_stanza")
	private String codiceStanza;
	
	@Column(name="superfice")
	private Double superfice;
	
	@ManyToOne
	@JoinColumn(name="idLivello")
	private Livello livello;
	
	@Column(name="prezzo")
	private Double prezzo;
	
	@Column(name="prenotata")
	private boolean prenotata;
	public Stanza() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodiceStanza() {
		return codiceStanza;
	}

	public void setCodiceStanza(String codiceStanza) {
		this.codiceStanza = codiceStanza;
	}

	public Double getSuperfice() {
		return superfice;
	}

	public void setSuperfice(Double superfice) {
		this.superfice = superfice;
	}

	public Livello getLivello() {
		return livello;
	}

	public void setLivello(Livello livello) {
		this.livello = livello;
	}

	public Double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(Double prezzo) {
		this.prezzo = prezzo;
	}

	public boolean isPrenotata() {
		return prenotata;
	}

	public void setPrenotata(boolean prenotata) {
		this.prenotata = prenotata;
	}

	
	
}
