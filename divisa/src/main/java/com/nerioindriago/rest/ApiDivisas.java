package com.nerioindriago.rest;

import java.util.List;

						
							   
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nerioindriago.model.entitys.Divisa;
import com.nerioindriago.model.service.IDivisaService;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*")
public class ApiDivisas {

	@Autowired
	private IDivisaService divisaService;

	@GetMapping(value="divisas")
	public List<Divisa> getDivisas() {
		return divisaService.getDivisa();
	}

	@PostMapping(value="divisas") 
	public Divisa addDivisa(@RequestBody Divisa divisa) {
		return divisaService.addDivisa(divisa); 
	}
  
    @PutMapping(value="divisas") 
    public Divisa updateDivisa(@RequestBody Divisa divisa) { 
	  return divisaService.updateDivisa(divisa); 
	}
  
	@DeleteMapping(value="divisas/{id}")
	public boolean deleteDivisa(@PathVariable(value="id") Integer id) {
		divisaService.removeDivisa(id);
		return true;
	}
}
 
