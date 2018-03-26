package com.lpaoliello.softek.controller;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lpaoliello.softek.service.impl.OperacionServiceImpl;

@RestController
public class OperacionController {

	@Autowired
	OperacionServiceImpl operacionService;
	
	@GetMapping("/operacion/tasa")
	public BigDecimal getTasa(@RequestParam String marca, @RequestParam @DateTimeFormat(iso = ISO.DATE) LocalDate fechaVencimiento, 
			@RequestParam BigDecimal importe) {
		
		return operacionService.getTasa(marca, fechaVencimiento, importe).get();
	}
}
