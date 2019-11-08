package com.nerioindriago.model.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nerioindriago.model.dao.ITasaHistoricaDao;
import com.nerioindriago.model.entitys.TasaHistorica;

@Service
public class TasaHistoricaService implements ITasaHistoricaService {

	@Autowired
	private ITasaHistoricaDao tasaHistoricaDao;

	@Override
	public List<TasaHistorica> getTasaHistorica() {
		return (List<TasaHistorica>) tasaHistoricaDao.findAll();
	}

	@Override
	public List<TasaHistorica> getTasa(Integer idDivisa) {
		return tasaHistoricaDao.findByIdDivisa(idDivisa);
	}

	@Override
	public TasaHistorica addTasaHistorica(TasaHistorica tasaHistorica) {
		tasaHistorica.setCreationDate(new Date());
		return tasaHistoricaDao.save(tasaHistorica);
	}

	@Override
	public TasaHistorica updateTasaHistorica(TasaHistorica tasaHistorica) {
		return tasaHistoricaDao.save(tasaHistorica);
	}

	@Override
	public void removeTasaHistorica(Integer id) {
		tasaHistoricaDao.deleteById(id);
	}
}
