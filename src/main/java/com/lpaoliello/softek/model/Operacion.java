package com.lpaoliello.softek.model;

import java.math.BigDecimal;

import com.lpaoliello.softek.exception.ContabilidadHostException;
import com.lpaoliello.softek.exception.CreditCardHostException;
import com.lpaoliello.softek.exception.DataBaseException;
import com.lpaoliello.softek.exception.PrinterException;

public class Operacion {
	
	private Tarjeta tarjeta;
	private BigDecimal importe;
	
	private static final BigDecimal IMPORTE_LIMITE = BigDecimal.valueOf(1000);
	
	public Operacion(Tarjeta tarjeta, BigDecimal importe) {
		this.tarjeta = tarjeta;
		this.importe = importe;
	}
	public Tarjeta getTarjeta() {
		return tarjeta;
	}
	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}
	public BigDecimal getImporte() {
		return importe;
	}
	public void setImporte(BigDecimal importe) {
		this.importe = importe;
	}
	
	public boolean validarOperacion() {
		
		if(this.tarjeta.validarTarjeta() && this.importe.compareTo(IMPORTE_LIMITE) <= 0) {
			return true;
		}
		
		return false;
	}
	public BigDecimal getTasaOperacion() {
		
		return tarjeta.getMarca().getTasa(tarjeta.getFechaVencimiento());
	}
	
	//Solucion Parte 2.
	public void cobrarOperacion() {
		try {
			imprimirFactura();
			enviarInfoTC();
			informarPago();
			actualizarSaldo();
		} catch (PrinterException pe) {
			System.out.println(pe.getMessage());
		} catch (CreditCardHostException cche) {
			System.out.println(cche.getMessage());
		} catch (ContabilidadHostException che) {
			System.out.println(che.getMessage());
		} catch (DataBaseException dbe) {
			System.out.println(dbe.getMessage());
		}
	}
	
	private void actualizarSaldo() throws DataBaseException {
		try {
			System.out.println("actualizar saldo.");
		} catch (Exception e) {
			e.printStackTrace();
			throw new DataBaseException("Excepcion al actualizar saldo.");
		}
		
	}
	
	//IDEM ANTERIOR. Tener en cuenta que estaría mal que dichos metodos e implementaciones se encuentren en esta clase.
	private void informarPago() throws ContabilidadHostException {
		// TODO Auto-generated method stub
		
	}
	private void enviarInfoTC() throws CreditCardHostException {
		// TODO Auto-generated method stub
		
	}
	private void imprimirFactura() throws PrinterException {
		// TODO Auto-generated method stub
		
	}
}
