package com.fabio.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fabio.rest.modelli.Stanza;
import com.fabio.rest.repository.StanzaRepository.StanzaResponse;
import com.fabio.rest.services.Services;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RestController
@RequestMapping(value="/ApiPrenotazioni/")
public class ServizioController {
	
	@Autowired
	private Services services;
	
	public ServizioController() {
		
	}
	
	
	@RequestMapping(value="getAllStanze",method=RequestMethod.GET)
	public List<StanzaResponse> getAllStanze() {
		StanzaResponse sResponse=null;
		List<StanzaResponse> stanzeAll=null;
		try {
			stanzeAll=services.getStanzaRepo().getListStanzeLivelli();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return stanzeAll;
	}
	
}
