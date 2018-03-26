package com.lpaoliello.softek;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lpaoliello.softek.model.Marca;
import com.lpaoliello.softek.model.MarcaSco;
import com.lpaoliello.softek.model.Operacion;
import com.lpaoliello.softek.model.Tarjeta;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		Marca sco = new MarcaSco("VisaSCO");
		
		Tarjeta tarjeta = new Tarjeta(sco, "123456487", "Jorge Sanchez", LocalDate.of(2018, Month.MARCH, 30));
		String informacionTarjeta = tarjeta.getInformacionTarjeta();
		System.out.println("Informacion de la tarjeta delimitada por (;): " + informacionTarjeta);
		tarjeta.validarTarjeta();
		
		Tarjeta tarjeta2 = new Tarjeta(sco, "123456487", "Jorge Sanchaz", LocalDate.of(2018, Month.MARCH, 30));
		System.out.println(tarjeta.equals(tarjeta2) ? "Tarjetas Iguales" : "Tarjetas Distintas");
		
		BigDecimal importeOperacion1 = BigDecimal.valueOf(999);
		Operacion operacion1 = new Operacion(tarjeta, importeOperacion1);
		System.out.println(operacion1.validarOperacion() ? "Operacion Valida!" : "Operacion Invalida!");
		
		System.out.println("Tasa de la operacion: " + operacion1.getTasaOperacion());
		
	}
}
