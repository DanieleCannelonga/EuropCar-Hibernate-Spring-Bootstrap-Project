package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Azienda;

public interface AziendaService {

	public List<Azienda> getAllAziende();
	public Azienda getAziendaById(Integer idAzienda);
	public Azienda saveOrUpdate(Azienda oAzienda); 
	public void deleteAzienda(Integer idAzienda);
}
