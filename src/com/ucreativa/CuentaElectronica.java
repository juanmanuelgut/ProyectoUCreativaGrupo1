/**
 * 
 */
package com.ucreativa;

import java.time.LocalDateTime;

/**
 * @author juangutierrez
 *
 */
public class CuentaElectronica extends CuentaBancaria implements Encriptacion{
	
	private String numeroTarjeta;
	private LocalDateTime fechaVencimiento;
	private int pin;
	
	//Getter y setters
	
	/**
	 * @return the numeroTarjeta
	 */
	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}

	/**
	 * @param numeroTarjeta the numeroTarjeta to set
	 */
	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	/**
	 * @return the fechaVencimiento
	 */
	public LocalDateTime getFechaVencimiento() {
		return fechaVencimiento;
	}

	/**
	 * @param fechaVencimiento the fechaVencimiento to set
	 */
	public void setFechaVencimiento(LocalDateTime fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	/**
	 * @return the pin
	 */
	public int getPin() {
		return pin;
	}

	/**
	 * @param pin the pin to set
	 */
	public void setPin(int pin) {
		this.pin = pin;
	}
	
	//Contructores
	
	/**
	 * 
	 */
	public CuentaElectronica() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	/**
	 * @param numeroTarjeta
	 * @param fechaVencimiento
	 * @param pin
	 */
	public CuentaElectronica(String numeroTarjeta, LocalDateTime fechaVencimiento, int pin) {
		super();
		this.numeroTarjeta = numeroTarjeta;
		this.fechaVencimiento = fechaVencimiento;
		this.pin = pin;
	}

	@Override
	protected Boolean hacerTrasaccion(Transaccion transaccion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Double calculoIntereses(Double balanceCuenta, Double tasaInteres) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String generarIdentificador() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void procesarIdentificador(String identificador) {
		// TODO Auto-generated method stub
		
	}
	
	

}
