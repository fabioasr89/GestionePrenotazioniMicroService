package com.fabio.rest.modelli;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="LIVELLI")
public class Livello {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_livello")
	private Integer idLivello;
	
	@Column(name="descrizione")
	private String descrizione;
	
	@OneToMany(mappedBy="livello")
	private Set<Stanza> stanze;
	
	public Livello() {
		
	}
	public Integer getIdLivello() {
		return idLivello;
	}
	public void setIdLivello(Integer idLivello) {
		this.idLivello = idLivello;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public Set<Stanza> getStanze() {
		return stanze;
	}
	public void setStanze(Set<Stanza> stanze) {
		this.stanze = stanze;
	}
	
	
}
