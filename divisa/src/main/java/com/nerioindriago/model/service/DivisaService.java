package com.nerioindriago.model.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nerioindriago.model.dao.IDivisaDao;
import com.nerioindriago.model.entitys.Divisa;

@Service
public class DivisaService implements IDivisaService {

	@Autowired
	private IDivisaDao divisaDao;

	@Override
	public List<Divisa> getDivisa() {
		return (List<Divisa>) divisaDao.findAll();
	}

	@Override
	public Divisa addDivisa(Divisa divisa) {
		divisa.setCreationDate(new Date());
		divisa.setStatus(true);
		return divisaDao.save(divisa);
	}

	@Override
	public Divisa updateDivisa(Divisa divisa) {
		return divisaDao.save(divisa);
	}

	@Override
	public void removeDivisa(Integer id) {
		divisaDao.deleteById(id);
	}
}
