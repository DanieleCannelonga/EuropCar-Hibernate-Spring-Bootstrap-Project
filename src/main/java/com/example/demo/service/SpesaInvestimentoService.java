package com.example.demo.service;

import java.util.List;

import com.example.demo.model.SpesaInvestimento;

public interface SpesaInvestimentoService {

	public List<SpesaInvestimento> getAllSpeseInvestimento();
	public SpesaInvestimento getSpesaInvestimentoById(Integer idSpesaInvestimento);
	public SpesaInvestimento saveOrUpdate(SpesaInvestimento oSpesaInvestimento); 
	public void deleteSpesaInvestimento(Integer idSpesaInvestimento);
}
