package com.fabio.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fabio.rest.modelli.Livello;

@Repository
public interface LivelliRepository extends JpaRepository<Livello,Integer>{

}
