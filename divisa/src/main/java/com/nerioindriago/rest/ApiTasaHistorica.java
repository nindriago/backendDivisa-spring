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

import com.nerioindriago.model.entitys.TasaHistorica;
import com.nerioindriago.model.service.ITasaHistoricaService;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*")
public class ApiTasaHistorica {

	@Autowired
	private ITasaHistoricaService tasaHistoricaService;

	@GetMapping(value="tasas")
	public List<TasaHistorica> getTasaHistoricas() {
		return tasaHistoricaService.getTasaHistorica();
	}

	@GetMapping(value="tasas/{idDivisa}")
	public List<TasaHistorica> getTasa(@PathVariable(value="idDivisa") Integer idDivisa) {
		return tasaHistoricaService.getTasa(idDivisa);
	}

	@PostMapping(value="tasas") 
	public TasaHistorica addTasaHistorica(@RequestBody TasaHistorica TasaHistorica) {
		return tasaHistoricaService.addTasaHistorica(TasaHistorica); 
	}
  
    @PutMapping(value="tasas") 
    public TasaHistorica updateTasaHistorica(@RequestBody TasaHistorica TasaHistorica) { 
	  return tasaHistoricaService.updateTasaHistorica(TasaHistorica); 
	}
  
	@DeleteMapping(value="tasas/{id}")
	public boolean deleteTasaHistorica(@PathVariable(value="id") Integer id) {
		tasaHistoricaService.removeTasaHistorica(id);
		return true;
	}
}
 
