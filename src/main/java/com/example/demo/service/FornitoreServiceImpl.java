package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Fornitore;
import com.example.demo.repository.FornitoreRepository;

@Service
@Transactional
public class FornitoreServiceImpl implements FornitoreService {

	@Autowired
	FornitoreRepository fornitoreRepository;
	
	@Override
	public List<Fornitore> getAllFornitori() {
		return (List<Fornitore>) fornitoreRepository.findAll();
	}

	@Override
	public Fornitore getFornitoreById(Integer idFornitore) {
		return fornitoreRepository.findById(idFornitore).get();
	}

	@Override
	public Fornitore saveOrUpdate(Fornitore oFornitore) {
		return fornitoreRepository.save(oFornitore);
	}

	@Override
	public void deleteFornitore(Integer idFornitore) {
		fornitoreRepository.deleteById(idFornitore);
	}
}
