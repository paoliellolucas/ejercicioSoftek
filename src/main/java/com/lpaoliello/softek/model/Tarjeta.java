package com.lpaoliello.softek.model;

import java.time.LocalDate;

public class Tarjeta {
	private Marca marca;
	private String numeroTarjeta;
	private String cardHolder;
	private LocalDate fechaVencimiento;
	
	public Tarjeta(){};
	
	public Tarjeta(Marca marca, String numeroTarjeta, String cardHolder, LocalDate fechaVencimiento){
		this.marca = marca;
		this.numeroTarjeta = numeroTarjeta;
		this.cardHolder = cardHolder;
		this.fechaVencimiento = fechaVencimiento;
	}
	
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}
	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}
	public String getCardHolder() {
		return cardHolder;
	}
	public void setCardHolder(String cardHolder) {
		this.cardHolder = cardHolder;
	}
	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(LocalDate fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	
	public boolean validarTarjeta() {
		LocalDate currentDate = LocalDate.now();
		
		if(this.fechaVencimiento.isAfter(currentDate.plusDays(1))) {
			System.out.println("Tarjeta Valida para operar!");
			return true;
		}
		
		System.out.println("Tarjeta Inválida para operar!");
			
		return false;
	}
	
	public String getInformacionTarjeta() {
		return numeroTarjeta + ";" + cardHolder + ";" + fechaVencimiento;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarjeta other = (Tarjeta) obj;
		if (cardHolder == null) {
			if (other.cardHolder != null)
				return false;
		} else if (!cardHolder.equals(other.cardHolder))
			return false;
		if (fechaVencimiento == null) {
			if (other.fechaVencimiento != null)
				return false;
		} else if (!fechaVencimiento.equals(other.fechaVencimiento))
			return false;
		if (numeroTarjeta == null) {
			if (other.numeroTarjeta != null)
				return false;
		} else if (!numeroTarjeta.equals(other.numeroTarjeta))
			return false;
		return true;
	}
}
