package com.lpaoliello.softek.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Component
public class MarcaSqua implements Marca {

	private String nombreMarca;
	
	public MarcaSqua(){}
	
	public MarcaSqua(String nombreMarca) {
		this.nombreMarca = nombreMarca;
	}

	@Override
	public BigDecimal getTasa(LocalDate fechaVencimiento) {
		
		return BigDecimal.valueOf(fechaVencimiento.getYear() / fechaVencimiento.getMonthValue());
	}

	public String getNombreMarca() {
		return nombreMarca;
	}

	public void setNombreMarca(String nombreMarca) {
		this.nombreMarca = nombreMarca;
	}

}
