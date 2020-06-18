package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.AreaGeo;
import com.example.demo.repository.AreaGeoRepository;

@Service
@Transactional
public class AreaGeoServiceImpl implements AreaGeoService {

	@Autowired
	AreaGeoRepository areaGeoRepository;
	
	@Override
	public List<AreaGeo> getAllAreeGeo() {
		return (List<AreaGeo>) areaGeoRepository.findAll();
	}

	@Override
	public AreaGeo getAreaGeoById(Integer idAreaGeo) {
		return areaGeoRepository.findById(idAreaGeo).get();
	}

	@Override
	public AreaGeo saveOrUpdate(AreaGeo oAreaGeo) {
		return areaGeoRepository.save(oAreaGeo);
	}

	@Override
	public void deleteAreaGeo(Integer idAreaGeo) {
		areaGeoRepository.deleteById(idAreaGeo);
	}
}