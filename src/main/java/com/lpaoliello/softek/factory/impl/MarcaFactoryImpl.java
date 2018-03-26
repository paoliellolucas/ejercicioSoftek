package com.lpaoliello.softek.factory.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lpaoliello.softek.factory.MarcaFactory;
import com.lpaoliello.softek.model.Marca;
import com.lpaoliello.softek.model.MarcaPere;
import com.lpaoliello.softek.model.MarcaSco;
import com.lpaoliello.softek.model.MarcaSqua;

@Component
public class MarcaFactoryImpl implements MarcaFactory {
	
	private static final String PERE = "PERE";
	private static final String SCO = "SCO";
	private static final String SQUA = "SQUA";
	
	@Autowired
	MarcaPere marcaPere;
	
	@Autowired
	MarcaSco marcaSco;
	
	@Autowired
	MarcaSqua marcaSqua;

	@Override
	public Marca getMarcaInstance(String marca) {

		Marca instancia = null;
		
		switch(marca.toUpperCase()) {
			case PERE: {
				instancia = marcaPere;
				break;
			} case SCO: {
				instancia = marcaSco;
				break;
			} case SQUA: {
				instancia = marcaSqua;
				break;
			} default: {
				throw new RuntimeException("Marca de Tarjeta Inválida.");
			}
		}
		return instancia;
	}

}
