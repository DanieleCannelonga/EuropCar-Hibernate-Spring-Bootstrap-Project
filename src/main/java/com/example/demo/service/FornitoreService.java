package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Fornitore;

public interface FornitoreService {

	public List<Fornitore> getAllFornitori();
	public Fornitore getFornitoreById(Integer idFornitore);
	public Fornitore saveOrUpdate(Fornitore oFornitore); 
	public void deleteFornitore(Integer idFornitore);
}
