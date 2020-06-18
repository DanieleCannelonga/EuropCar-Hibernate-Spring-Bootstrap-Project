package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.OrdineAcquisto;

public interface OrdineAcquistoRepository extends CrudRepository<OrdineAcquisto, Integer> {
	
	@Query("select a from OrdineAcquisto a where a.ofornitore.idfornitore = :idfornitore")
	List<OrdineAcquisto> GetOrdiniPerFornitore(Integer idfornitore);
}