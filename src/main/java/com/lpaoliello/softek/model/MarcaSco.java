package com.lpaoliello.softek.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Component
public class MarcaSco implements Marca {

	private String nombreMarca;
	
	public MarcaSco(){}
	
	public MarcaSco(String nombreMarca) {
		this.nombreMarca = nombreMarca;
	}
	
	@Override
	public BigDecimal getTasa(LocalDate fechaVencimiento) {
		
		return BigDecimal.valueOf(fechaVencimiento.getDayOfMonth() * 0.5);
	}

	public String getNombreMarca() {
		return nombreMarca;
	}

	public void setNombreMarca(String nombreMarca) {
		this.nombreMarca = nombreMarca;
	}

}
