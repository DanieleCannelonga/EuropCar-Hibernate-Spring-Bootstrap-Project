package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Gruppo;
import com.example.demo.repository.GruppoRepository;

@Service
@Transactional
public class GruppoServiceImpl implements GruppoService{

	@Autowired
	GruppoRepository gruppoRepository;
	
	@Override
	public List<Gruppo> getAllGruppi() {
		return (List<Gruppo>) gruppoRepository.findAll();
	}

	@Override
	public Gruppo getGruppoById(Integer idGruppo) {
		return gruppoRepository.findById(idGruppo).get();
	}

	@Override
	public Gruppo saveOrUpdate(Gruppo oGruppo) {
		return gruppoRepository.save(oGruppo);
	}

	@Override
	public void deleteGruppo(Integer idGruppo) {
		gruppoRepository.deleteById(idGruppo);
	}
}
