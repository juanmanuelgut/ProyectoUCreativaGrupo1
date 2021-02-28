/**
 * 
 */
package com.ucreativa;

import java.time.LocalDateTime;
import java.util.ArrayList;

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
	 * @param balanceInicialCuenta
	 * @param balanceActualCuenta
	 * @param balanceFlotante
	 * @param numeroCuenta
	 * @param arregloTransacciones
	 * @param arregloTransaccionesFlotantes
	 * @param tazaInteres
	 * @param monedaID
	 * @param numeroTarjeta
	 * @param fechaVencimiento
	 * @param pin
	 */
	public CuentaElectronica(Double balanceInicialCuenta, Double balanceActualCuenta, Double balanceFlotante,
			String numeroCuenta, ArrayList<Transaccion> arregloTransacciones,
			ArrayList<Transaccion> arregloTransaccionesFlotantes, Double tazaInteres, String monedaID,
			String numeroTarjeta, LocalDateTime fechaVencimiento, int pin) {
		super(balanceInicialCuenta, balanceActualCuenta, balanceFlotante, numeroCuenta, arregloTransacciones,
				arregloTransaccionesFlotantes, tazaInteres, monedaID);
		this.numeroTarjeta = numeroTarjeta;
		this.fechaVencimiento = fechaVencimiento;
		this.pin = pin;
	}
	
	/**
	 * Este meetodo se encarga de validar el numero de tarjeta y pin para transacciones en el Cajero Automático
	 * @param numeroTarjeta
	 * @param pin
	 * @return
	 */
	protected Boolean autorizarUsoCajeroAutomatico(String numeroTarjeta, int pin) {
		
		return false;
		
	}
	
	@Override
	protected Boolean hacerTrasaccion(Transaccion transaccion) {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	protected Double calculoIntereses(Double balanceCuenta, Double tasaInteres) {
		// TODO Auto-generated method stub
		return 256.44;
	}

	@Override
	public String generarIdentificador() {
		// TODO Auto-generated method stub
		return "37587d9a273cd5a27d2d8fa7acacca51";
	}

	@Override
	public void procesarIdentificador(String identificador) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "CuentaElectronica [12587496333369]";
	}
	
	
	

}
