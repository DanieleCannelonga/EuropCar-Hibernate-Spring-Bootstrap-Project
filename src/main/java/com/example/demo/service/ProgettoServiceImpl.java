package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Progetto;
import com.example.demo.repository.ProgettoRepository;

@Service
@Transactional
public class ProgettoServiceImpl implements ProgettoService {

	@Autowired
	ProgettoRepository progettoRepository;
	
	@Override
	public List<Progetto> getAllProgetti() {
		return (List<Progetto>) progettoRepository.findAll();
	}

	@Override
	public Progetto getProgettoById(Integer idProgetto) {
		return progettoRepository.findById(idProgetto).get();
	}

	@Override
	public Progetto saveOrUpdate(Progetto oProgetto) {
		return progettoRepository.save(oProgetto);
	}

	@Override
	public void deleteProgetto(Integer idProgetto) {
		progettoRepository.deleteById(idProgetto);
	}
}