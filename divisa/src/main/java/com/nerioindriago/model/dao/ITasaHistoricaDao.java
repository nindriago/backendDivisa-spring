package com.nerioindriago.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.nerioindriago.model.entitys.TasaHistorica;

@Repository
@CrossOrigin(origins = "*")
public interface ITasaHistoricaDao extends CrudRepository<TasaHistorica, Integer> {

	@Query("Select r from TasaHistorica r where r.idDivisa = :idDivisa")
	public List<TasaHistorica> findByIdDivisa(@Param("idDivisa")Integer idDivisa);
}
