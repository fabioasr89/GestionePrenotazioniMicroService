package com.fabio.rest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fabio.rest.repository.LivelliRepository;
import com.fabio.rest.repository.StanzaRepository;

/**Classe che utilizziamo per gestire le eventuali transazioni quando eseguiamo più operazioni contemporanemente*/
@Service
public class Services {
	
	@Autowired
	private LivelliRepository livelliRepo;
	
	@Autowired
	private StanzaRepository stanzaRepo;
	
	public Services() {
		
	}
	
	public LivelliRepository getLivelliRepo() {
		return livelliRepo;
	}

	public void setLivelliRepo(LivelliRepository livelliRepo) {
		this.livelliRepo = livelliRepo;
	}

	public StanzaRepository getStanzaRepo() {
		return stanzaRepo;
	}

	public void setStanzaRepo(StanzaRepository stanzaRepo) {
		this.stanzaRepo = stanzaRepo;
	}
	
	
}
