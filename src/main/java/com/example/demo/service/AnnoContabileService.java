package com.example.demo.service;

import java.util.List;

import com.example.demo.model.AnnoContabile;

public interface AnnoContabileService {

	public List<AnnoContabile> getAllAnniContabili();
	public AnnoContabile getAreaById(Integer idAnnoContabile);
	public AnnoContabile saveOrUpdate(AnnoContabile oAnnoContabile); 
	public void deleteAnnoContabile(Integer idAnnoContabile);
}
