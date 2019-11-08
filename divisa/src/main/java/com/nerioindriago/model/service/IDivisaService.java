package com.nerioindriago.model.service;

import java.util.List;

import com.nerioindriago.model.entitys.Divisa;

public interface IDivisaService {

 
	public List<Divisa> getDivisa();
	public Divisa addDivisa(Divisa divisa);
	public Divisa updateDivisa(Divisa divisa);
	public void removeDivisa(Integer id);
 
 
}
