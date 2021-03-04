/**
 * 
 */
package com.ucreativa.Transacciones.cuentas;

import java.util.ArrayList;

import com.ucreativa.Transacciones.Transaccion;

/**
 * @author juangutierrez
 *
 */
public class DepositoAPlazo extends CuentaBancaria{

	private String nombreCertificado;
	private int plazoDias;
	
	/**
	 * @return the nombreCertificado
	 */
	public String getNombreCertificado() {
		return nombreCertificado;
	}

	/**
	 * @param nombreCertificado the nombreCertificado to set
	 */
	public void setNombreCertificado(String nombreCertificado) {
		this.nombreCertificado = nombreCertificado;
	}

	/**
	 * @return the plazoDias
	 */
	public int getPlazoDias() {
		return plazoDias;
	}

	/**
	 * @param plazoDias the plazoDias to set
	 */
	public void setPlazoDias(int plazoDias) {
		this.plazoDias = plazoDias;
	}
	
	//Contructor
	/**
	 * @param balanceInicialCuenta
	 * @param balanceActualCuenta
	 * @param balanceFlotante
	 * @param numeroCuenta
	 * @param arregloTransacciones
	 * @param arregloTransaccionesFlotantes
	 * @param tazaInteres
	 * @param monedaID
	 * @param nombreCertificado
	 * @param plazoDias
	 */
	public DepositoAPlazo(Double balanceInicialCuenta, Double balanceActualCuenta, Double balanceFlotante,
			String numeroCuenta,  Double tazaInteres, String monedaID,
			String nombreCertificado, int plazoDias) {
		super(balanceInicialCuenta, balanceActualCuenta, balanceFlotante, numeroCuenta,  tazaInteres, monedaID);
		this.nombreCertificado = nombreCertificado;
		this.plazoDias = plazoDias;
	}
	//métodos Clase
	
	/**
	 * Este método se encarga de calcular el monto de la multa por retiro temprano del Depósito a plazo
	 * @param diasTranscurridos
	 * @return
	 */
	protected Double calculoMultaretiroAnticipado(int diasTranscurridos) {
		return 256.78;
	}
	
	@Override
	protected Boolean hacerTrasaccion(Transaccion transaccion) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	protected Double calculoIntereses(Double balanceCuenta, Double tasaInteres) {
		// TODO Auto-generated method stub
		//Comment here
		return 248.63;
	}

	@Override
	public String toString() {
		return "DepositoAPlazo [2548963554]";
	}
	
	

}
