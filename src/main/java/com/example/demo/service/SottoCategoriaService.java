package com.example.demo.service;

import java.util.List;

import com.example.demo.model.SottoCategoria;

public interface SottoCategoriaService {

	public List<SottoCategoria> getAllSottoCategorie();
	public SottoCategoria getSottoCategoriaById(Integer idSottoCategoria);
	public SottoCategoria saveOrUpdate(SottoCategoria oSottoCategoria); 
	public void deleteSottoCategoria(Integer idSottoCategoria);
}
