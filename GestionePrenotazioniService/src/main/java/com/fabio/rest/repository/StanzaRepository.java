package com.fabio.rest.repository;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.NamedQuery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.fabio.rest.modelli.Stanza;
@Repository
public interface StanzaRepository extends JpaRepository<Stanza,Integer> {
	
	@Query(value="SELECT s.codice_stanza as codiceStanza,s.prenotata as prenotata,s.prezzo as prezzo,s.superfice as superficie,l.descrizione as descrizione FROM stanze s JOIN livelli l on (l.id_livello=s.id_livello)",nativeQuery=true)
	List<StanzaResponse> getListStanzeLivelli();
	
	public interface StanzaResponse{

		String getCodiceStanza();
		String getDescrizione();
		boolean isPrenotata();
		Double getPrezzo();
		Double getSuperficie();
		
	}
}
