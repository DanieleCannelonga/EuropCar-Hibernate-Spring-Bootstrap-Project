package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Progetto;

public interface ProgettoService {

	public List<Progetto> getAllProgetti();
	public Progetto getProgettoById(Integer idProgetto);
	public Progetto saveOrUpdate(Progetto oProgetto); 
	public void deleteProgetto(Integer idProgetto);
}
