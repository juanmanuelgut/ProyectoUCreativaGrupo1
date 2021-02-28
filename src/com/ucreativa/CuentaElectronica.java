/**
 * 
 */
package com.ucreativa;

/**
 * @author juangutierrez
 *
 */
public class CuentaElectronica extends CuentaBancaria implements Encriptacion{

	/**
	 * 
	 */
	public CuentaElectronica() {
		// TODO Auto-generated constructor stub
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
