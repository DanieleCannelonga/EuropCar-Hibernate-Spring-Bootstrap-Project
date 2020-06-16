package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Gruppo;

public interface GruppoService {

	public List<Gruppo> getAllGruppi();
	public Gruppo getGruppoById(Integer idGruppo);
	public Gruppo saveOrUpdate(Gruppo oGruppo); 
	public void deleteGruppo(Integer idGruppo);
}
