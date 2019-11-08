package com.nerioindriago.model.service;

import java.util.List;

import com.nerioindriago.model.entitys.TasaHistorica;

public interface ITasaHistoricaService {

	public List<TasaHistorica> getTasaHistorica();
	public List<TasaHistorica> getTasa(Integer idDivisa);
	public TasaHistorica addTasaHistorica(TasaHistorica tasaHistorica);
	public TasaHistorica updateTasaHistorica(TasaHistorica tasaHistorica);
	public void removeTasaHistorica(Integer id);
}
