
package com.fabio.rest.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityResult;
import javax.persistence.Id;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.ColumnResult;
import org.springframework.stereotype.Component;

/**La classe che rappresenta la risposta del servizio*/
/*
@SqlResultSetMapping(
	name="stanzeConLivello",entities= {
			@EntityResult(entityClass=com.fabio.rest.bean.StanzaResponse.class)
	}
)
*/
@Entity
public class StanzaResponse implements Serializable{
	@Id
	@Column(name="codiceStanza")
	private String codiceStanza;
	@Column(name="descrizione")
	private String livello;
	@Column(name="prezzo")
	private Double prezzo;
	@Column(name="prenotata")
	private boolean disponibile;
	@Column(name="superficie")
	private Double superficie;
	
	public StanzaResponse(String codiceStanza,String livello,Double prezzo,boolean disponibile,Double superficie) {
		this.codiceStanza=codiceStanza;
		this.livello=livello;
		this.prezzo=prezzo;
		this.disponibile=disponibile;
		this.superficie=superficie;
	}

	public String getCodiceStanza() {
		return codiceStanza;
	}

	public void setCodiceStanza(String codiceStanza) {
		this.codiceStanza = codiceStanza;
	}

	public String getLivello() {
		return livello;
	}

	public void setLivello(String livello) {
		this.livello = livello;
	}

	

	public Double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(Double prezzo) {
		this.prezzo = prezzo;
	}

	public boolean isDisponibile() {
		return disponibile;
	}

	public void setDisponibile(boolean disponibile) {
		this.disponibile = disponibile;
	}

	public Double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(Double superficie) {
		this.superficie = superficie;
	}
	
	
}
