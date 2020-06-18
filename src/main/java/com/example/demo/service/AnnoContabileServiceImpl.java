package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.AnnoContabile;
import com.example.demo.repository.AnnoContabileRepository;

@Service
@Transactional
public class AnnoContabileServiceImpl implements AnnoContabileService {

	@Autowired
	AnnoContabileRepository annoContabileRepository;
	
	@Override
	public List<AnnoContabile> getAllAnniContabili() {
		return (List<AnnoContabile>) annoContabileRepository.findAll();
	}

	@Override
	public AnnoContabile getAreaById(Integer idAnnoContabile) {
		return annoContabileRepository.findById(idAnnoContabile).get();
	}

	@Override
	public AnnoContabile saveOrUpdate(AnnoContabile oAnnoContabile) {
		return annoContabileRepository.save(oAnnoContabile);
	}

	@Override
	public void deleteAnnoContabile(Integer idAnnoContabile) {
		annoContabileRepository.deleteById(idAnnoContabile);
	}
}