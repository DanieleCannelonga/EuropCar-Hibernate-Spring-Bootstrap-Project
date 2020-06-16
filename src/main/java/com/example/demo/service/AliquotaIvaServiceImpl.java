package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.AliquotaIva;
import com.example.demo.repository.AliquotaIvaRepository;

@Service
@Transactional
public class AliquotaIvaServiceImpl implements AliquotaIvaService {

	@Autowired
	AliquotaIvaRepository aliquotaIvaRepository;
	
	@Override
	public List<AliquotaIva> getAllAliquoteIva() {
		return (List<AliquotaIva>) aliquotaIvaRepository.findAll();
	}

	@Override
	public AliquotaIva getAliquotaIvaById(Integer idAliquotaIva) {
		return aliquotaIvaRepository.findById(idAliquotaIva).get();
	}

	@Override
	public AliquotaIva saveOrUpdate(AliquotaIva oAliquotaIva) {
		return aliquotaIvaRepository.save(oAliquotaIva);
	}

	@Override
	public void deleteAliquotaIva(Integer idAliquotaIva) {
	}
}