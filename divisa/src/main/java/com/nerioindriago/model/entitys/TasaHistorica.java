package com.nerioindriago.model.entitys;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * Clase que representa la tabla TASAHISTORICA
 * @author nerio
 *
 */
@Data
@Entity //NOTATION PARA QUE LA CLASE REPRESENTE UNA TABLA
@Table(name = "tasahistorica")
public class TasaHistorica {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idTasa;
	private Integer idDivisa;
	private String divisaSalida;
	private String tipoOperacion;
	private String tasa;
	
	@Column(name="creation_date")
	private Date creationDate;
}
