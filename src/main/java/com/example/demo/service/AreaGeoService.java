package com.example.demo.service;

import java.util.List;

import com.example.demo.model.AreaGeo;

public interface AreaGeoService {

	public List<AreaGeo> getAllAreeGeo();
	public AreaGeo getAreaGeoById(Integer idAreaGeo);
	public AreaGeo saveOrUpdate(AreaGeo oAreaGeo); 
	public void deleteAreaGeo(Integer idAreaGeo);
}
