package com.example.demo.service;

import java.util.List;

import com.example.demo.model.AliquotaIva;

public interface AliquotaIvaService {

	public List<AliquotaIva> getAllAliquoteIva();
	public AliquotaIva getAliquotaIvaById(Integer idAliquotaIva);
	public AliquotaIva saveOrUpdate(AliquotaIva oAliquotaIva); 
	public void deleteAliquotaIva(Integer idAliquotaIva);
}
