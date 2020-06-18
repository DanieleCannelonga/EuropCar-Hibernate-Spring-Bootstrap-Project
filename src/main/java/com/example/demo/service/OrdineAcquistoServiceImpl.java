package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.OrdineAcquisto;
import com.example.demo.repository.OrdineAcquistoRepository;

@Service
@Transactional
public class OrdineAcquistoServiceImpl implements OrdineAcquistoService {

	@Autowired
	OrdineAcquistoRepository ordineAcquistoRepository;
	
	@Override
	public List<OrdineAcquisto> getAllOrdiniAcquisto() {
		return (List<OrdineAcquisto>) ordineAcquistoRepository.findAll();
	}

	@Override
	public OrdineAcquisto getOrdineAcquistoById(Integer idOrdineAcquisto) {
		return ordineAcquistoRepository.findById(idOrdineAcquisto).get();
	}

	@Override
	public OrdineAcquisto saveOrUpdate(OrdineAcquisto oOrdineAcquisto) {
		return ordineAcquistoRepository.save(oOrdineAcquisto);
	}

	@Override
	public void deleteOrdineAcquisto(Integer idOrdineAcquisto) {
		ordineAcquistoRepository.deleteById(idOrdineAcquisto);
	}

	@Override
	public List<OrdineAcquisto> getOrdineAcquistoPerFornitore(Integer idFornitore) {
		return ordineAcquistoRepository.GetOrdiniPerFornitore(idFornitore);
	}
}