package com.lpaoliello.softek.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Component
public class MarcaPere implements Marca {
	
	private String nombreMarca;
	
	public MarcaPere() {}
	
	public MarcaPere(String nombreMarca) {
		this.nombreMarca = nombreMarca;
	}

	@Override
	public BigDecimal getTasa(LocalDate fechaVencimiento) {

		return BigDecimal.valueOf(fechaVencimiento.getMonthValue() * 0.1);
	}

	public String getNombreMarca() {
		return nombreMarca;
	}

	public void setNombreMarca(String nombreMarca) {
		this.nombreMarca = nombreMarca;
	}

}
