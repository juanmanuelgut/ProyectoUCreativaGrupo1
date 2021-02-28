/**
 * 
 */
package com.ucreativa;

import java.util.ArrayList;

/**
 * @author juangutierrez
 *
 */
public abstract class CuentaBancaria implements Estado{
	

	//Atributos
	private Boolean estado;
	private Double balanceInicialCuenta;
	private Double balanceActualCuenta;
	private Double balanceFlotante;
	private String numeroCuenta;
	private ArrayList<Transaccion> arregloTransacciones;
	private ArrayList<Transaccion> arregloTransaccionesFlotantes;
	private Double tazaInteres;
	private String monedaID;

	//Getters and Setters
	/**
	 * @return the estado
	 */
	public Boolean getEstado() {
		return estado;
	}


	/**
	 * @param estado the estado to set
	 */
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}


	/**
	 * @return the balanceInicialCuenta
	 */
	public Double getBalanceInicialCuenta() {
		return balanceInicialCuenta;
	}

	/**
	 * @param balanceInicialCuenta the balanceInicialCuenta to set
	 */
	public void setBalanceInicialCuenta(Double balanceInicialCuenta) {
		this.balanceInicialCuenta = balanceInicialCuenta;
	}

	/**
	 * @return the balanceActualCuenta
	 */
	public Double getBalanceActualCuenta() {
		return balanceActualCuenta;
	}

	/**
	 * @param balanceActualCuenta the balanceActualCuenta to set
	 */
	public void setBalanceActualCuenta(Double balanceActualCuenta) {
		this.balanceActualCuenta = balanceActualCuenta;
	}

	/**
	 * @return the balanceFlotante
	 */
	public Double getBalanceFlotante() {
		return balanceFlotante;
	}

	/**
	 * @param balanceFlotante the balanceFlotante to set
	 */
	public void setBalanceFlotante(Double balanceFlotante) {
		this.balanceFlotante = balanceFlotante;
	}

	/**
	 * @return the numeroCuenta
	 */
	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	/**
	 * @param numeroCuenta the numeroCuenta to set
	 */
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	/**
	 * @return the arregloTransacciones
	 */
	public ArrayList<Transaccion> getArregloTransacciones() {
		return arregloTransacciones;
	}

	/**
	 * @param arregloTransacciones the arregloTransacciones to set
	 */
	public void setArregloTransacciones(ArrayList<Transaccion> arregloTransacciones) {
		this.arregloTransacciones = arregloTransacciones;
	}

	/**
	 * @return the arregloTransaccionesFlotantes
	 */
	public ArrayList<Transaccion> getArregloTransaccionesFlotantes() {
		return arregloTransaccionesFlotantes;
	}

	/**
	 * @param arregloTransaccionesFlotantes the arregloTransaccionesFlotantes to set
	 */
	public void setArregloTransaccionesFlotantes(ArrayList<Transaccion> arregloTransaccionesFlotantes) {
		this.arregloTransaccionesFlotantes = arregloTransaccionesFlotantes;
	}

	/**
	 * @return the tazaInteres
	 */
	public Double getTazaInteres() {
		return tazaInteres;
	}

	/**
	 * @param tazaInteres the tazaInteres to set
	 */
	public void setTazaInteres(Double tazaInteres) {
		this.tazaInteres = tazaInteres;
	}

	/**
	 * @return the monedaID
	 */
	public String getMonedaID() {
		return monedaID;
	}

	/**
	 * @param monedaID the monedaID to set
	 */
	public void setMonedaID(String monedaID) {
		this.monedaID = monedaID;
	}
	
	//Constructores
	/**
	 * 
	 */
	public CuentaBancaria() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param estaActiva
	 * @param balanceInicialCuenta
	 * @param balanceActualCuenta
	 * @param balanceFlotante
	 * @param numeroCuenta
	 * @param arregloTransacciones
	 * @param arregloTransaccionesFlotantes
	 * @param tazaInteres
	 * @param monedaID
	 */
	public CuentaBancaria(Double balanceInicialCuenta, Double balanceActualCuenta,
			Double balanceFlotante, String numeroCuenta, ArrayList<Transaccion> arregloTransacciones,
			ArrayList<Transaccion> arregloTransaccionesFlotantes, Double tazaInteres, String monedaID) {
		super();
		this.balanceInicialCuenta = balanceInicialCuenta;
		this.balanceActualCuenta = balanceActualCuenta;
		this.balanceFlotante = balanceFlotante;
		this.numeroCuenta = numeroCuenta;
		this.arregloTransacciones = arregloTransacciones;
		this.arregloTransaccionesFlotantes = arregloTransaccionesFlotantes;
		this.tazaInteres = tazaInteres;
		this.monedaID = monedaID;
	}

	
	//Métodos Clase 
	
	/**
	 * @param transaccion
	 * @return
	 */
	protected abstract Boolean hacerTrasaccion(Transaccion transaccion);
	
	protected String listarTransacciones() {
		
		return "ANadir texto aqui";
		
	}
	
	protected void toggleEstaActiva() {}
	
	protected abstract Double calculoIntereses(Double balanceCuenta, Double tasaInteres);
		
	/**
	 *
	 */
	@Override
	public void changeEstado() {
		// Cambia el estado de la clase
		this.estado = !this.estado;
	}

	/**
	 *
	 */
	@Override
	public void desplegarEstado() {
		// imprime en consola el estado de la clase
		System.out.println("El Estado es:" + String.valueOf(this.estado));
		
	}
	
	

}
