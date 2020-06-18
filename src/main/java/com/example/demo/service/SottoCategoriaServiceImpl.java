package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.SottoCategoria;
import com.example.demo.repository.AreaRepository;
import com.example.demo.repository.SottoCategoriaRepository;

@Service
@Transactional
public class SottoCategoriaServiceImpl implements SottoCategoriaService {

	@Autowired
	SottoCategoriaRepository sottoCategoriaRepository;
	AreaRepository areaRepository;
	
	@Override
	public List<SottoCategoria> getAllSottoCategorie() {
		return (List<SottoCategoria>) sottoCategoriaRepository.findAll();
	}

	@Override
	public SottoCategoria getSottoCategoriaById(Integer idSottoCategoria) {
		return sottoCategoriaRepository.findById(idSottoCategoria).get();
	}

	@Override
	public SottoCategoria saveOrUpdate(SottoCategoria oSottoCategoria) {
		return sottoCategoriaRepository.save(oSottoCategoria);
	}

	@Override
	public void deleteSottoCategoria(Integer idSottoCategoria) {
		sottoCategoriaRepository.deleteById(idSottoCategoria);
	}
}