package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Area;

public interface AreaService {

	public List<Area> getAllAree();
	public Area getAreaById(Integer idArea);
	public Area saveOrUpdate(Area oArea); 
	public void deleteArea(Integer idArea);
}
