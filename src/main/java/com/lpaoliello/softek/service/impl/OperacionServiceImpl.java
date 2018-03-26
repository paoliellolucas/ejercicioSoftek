package com.lpaoliello.softek.service.impl;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lpaoliello.softek.factory.MarcaFactory;
import com.lpaoliello.softek.model.Marca;
import com.lpaoliello.softek.service.OperacionService;

@Service
public class OperacionServiceImpl implements OperacionService {

	@Autowired
	MarcaFactory marcaFactory;
	
	@Override
	public Optional<BigDecimal> getTasa(String marca, LocalDate fechaVencimiento, BigDecimal importe) {
		
		Marca marcaInstance = marcaFactory.getMarcaInstance(marca);
		
		return Optional.of(marcaInstance.getTasa(fechaVencimiento));
	}

}
