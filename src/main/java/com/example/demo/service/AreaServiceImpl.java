package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Area;
import com.example.demo.repository.AreaRepository;

@Service
@Transactional
public class AreaServiceImpl implements AreaService {

	@Autowired
	AreaRepository areaRepository;
	
	@Override
	public List<Area> getAllAree() {
		return (List<Area>) areaRepository.findAll();
	}

	@Override
	public Area getAreaById(Integer idArea) {
		return areaRepository.findById(idArea).get();
	}

	@Override
	public Area saveOrUpdate(Area oArea) {
		return areaRepository.save(oArea);
	}

	@Override
	public void deleteArea(Integer idArea) {
		areaRepository.deleteById(idArea);
	}
}