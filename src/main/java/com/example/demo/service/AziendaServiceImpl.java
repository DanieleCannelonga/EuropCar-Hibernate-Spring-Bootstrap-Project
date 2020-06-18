package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Azienda;
import com.example.demo.repository.AziendaRepository;

@Service
@Transactional
public class AziendaServiceImpl implements AziendaService {

	@Autowired
	AziendaRepository aziendaRepository;
	
	@Override
	public List<Azienda> getAllAziende() {
		return (List<Azienda>) aziendaRepository.findAll();
	}

	@Override
	public Azienda getAziendaById(Integer idAzienda) {
		return aziendaRepository.findById(idAzienda).get();
	}

	@Override
	public Azienda saveOrUpdate(Azienda oAzienda) {
		return aziendaRepository.save(oAzienda);
	}

	@Override
	public void deleteAzienda(Integer idAzienda) {
		aziendaRepository.deleteById(idAzienda);
	}
}