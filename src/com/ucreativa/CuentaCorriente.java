/**
 * 
 */
package com.ucreativa;

import java.util.ArrayList;

/**
 * @author juangutierrez
 *
 */
public class CuentaCorriente extends CuentaBancaria{
	
	
	//Atributos
	private int siguienteCheque;
	private int maximoCheque;
	private Double saldo;
	private ArrayList<Transaccion> chequesNoCobrados;
	private ArrayList<Usuario> usuariosAutorizados;
	
	/**
	 * 
	 */
	

	/**
	 * @return the siguienteCheque
	 */
	public int getSiguienteCheque() {
		return siguienteCheque;
	}

	/**
	 * @param siguienteCheque the siguienteCheque to set
	 */
	public void setSiguienteCheque(int siguienteCheque) {
		this.siguienteCheque = siguienteCheque;
	}

	/**
	 * @return the maximoCheque
	 */
	public int getMaximoCheque() {
		return maximoCheque;
	}

	/**
	 * @param maximoCheque the maximoCheque to set
	 */
	public void setMaximoCheque(int maximoCheque) {
		this.maximoCheque = maximoCheque;
	}

	/**
	 * @return the saldo
	 */
	public Double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	/**
	 * @return the chequesNoCobrados
	 */
	public ArrayList<Transaccion> getChequesNoCobrados() {
		return chequesNoCobrados;
	}

	/**
	 * @param chequesNoCobrados the chequesNoCobrados to set
	 */
	public void setChequesNoCobrados(ArrayList<Transaccion> chequesNoCobrados) {
		this.chequesNoCobrados = chequesNoCobrados;
	}

	/**
	 * @return the usuariosAutorizados
	 */
	public ArrayList<Usuario> getUsuariosAutorizados() {
		return usuariosAutorizados;
	}

	/**
	 * @param usuariosAutorizados the usuariosAutorizados to set
	 */
	public void setUsuariosAutorizados(ArrayList<Usuario> usuariosAutorizados) {
		this.usuariosAutorizados = usuariosAutorizados;
	}

	@Override
	protected Boolean hacerTrasaccion(Transaccion transaccion) {
		// TODO Auto-generated method stub
		return true;
	}
	
	//Constructores
	public CuentaCorriente() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param siguienteCheque
	 * @param maximoCheque
	 * @param saldo
	 * @param chequesNoCobrados
	 * @param usuariosAutorizados
	 */
	public CuentaCorriente(int siguienteCheque, int maximoCheque, Double saldo,
			ArrayList<Transaccion> chequesNoCobrados, ArrayList<Usuario> usuariosAutorizados) {
		super();
		this.siguienteCheque = siguienteCheque;
		this.maximoCheque = maximoCheque;
		this.saldo = saldo;
		this.chequesNoCobrados = chequesNoCobrados;
		this.usuariosAutorizados = usuariosAutorizados;
	}

	@Override
	protected Double calculoIntereses(Double balanceCuenta, Double tasaInteres) {
		// TODO Auto-generated method stub
		return 10000.00;
	}
	
	
	
	

}
