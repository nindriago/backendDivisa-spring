package com.nerioindriago.model.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.nerioindriago.model.entitys.Divisa;

@Repository
@CrossOrigin(origins = "*")
public interface IDivisaDao extends CrudRepository<Divisa, Integer> {

}
