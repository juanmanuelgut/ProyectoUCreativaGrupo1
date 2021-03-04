/**
 * 
 */
package com.ucreativa.Transacciones.cuentas;

import java.util.ArrayList;

import com.ucreativa.Transacciones.Transaccion;
import com.ucreativa.Transacciones.Usuario.Usuario;

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
	
	//Constructores
	
	/**
	 * @param balanceInicialCuenta
	 * @param balanceActualCuenta
	 * @param balanceFlotante
	 * @param numeroCuenta
	 * @param arregloTransacciones
	 * @param arregloTransaccionesFlotantes
	 * @param tazaInteres
	 * @param monedaID
	 * @param siguienteCheque
	 * @param maximoCheque
	 * @param saldo
	 * @param chequesNoCobrados
	 * @param usuariosAutorizados
	 */
	public CuentaCorriente(Double balanceInicialCuenta, Double balanceActualCuenta, Double balanceFlotante,
			String numeroCuenta, Double tazaInteres, String monedaID,
			int siguienteCheque, int maximoCheque) {
		super(balanceInicialCuenta, balanceActualCuenta, balanceFlotante, numeroCuenta, tazaInteres, monedaID);
		this.siguienteCheque = siguienteCheque;
		this.maximoCheque = maximoCheque;
		this.saldo = saldo;
	}
	
	//Metodos Clase
	
	/**
	 * Este método añade un usuario autorizado a utilizar cuenta y firmar Cheques
	 * @param usuario
	 */
	protected void autorizarUsuario(Usuario usuario) {}
	
	
	/**
	 * Este método genera una Transacción tipo cheque a nombre del beneficiario
	 * @param monto
	 * @param beneficiario
	 * @return
	 */
	protected Boolean generarCheque(Double monto, String beneficiario) {
		return true;
	}
	
	
	/**
	 *Override de la Clase Abstracta
	 */
	@Override
	protected Double calculoIntereses(Double balanceCuenta, Double tasaInteres) {
		// TODO Auto-generated method stub
		return 10000.00;
	}

	@Override
	protected Boolean hacerTrasaccion(Transaccion transaccion) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String toString() {
		return "CuentaCorriente [147852369874]";
	}
	
	
	
	

}
