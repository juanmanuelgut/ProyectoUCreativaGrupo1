/**
 * 
 */
package com.ucreativa;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * @author juangutierrez
 *
 */
public class Cheque extends Transaccion{

	
	private String beneficiario;
	private int numeroCheque;
	private Boolean isCashed;
	private Boolean canBeCashed;
	private LocalDate fechaHoraCashed;
	private ArrayList<Usuario> usuariosFirmantes;
	
	//Getters y Setter
	
	/**
	 * @return the beneficiario
	 */
	public String getBeneficiario() {
		return beneficiario;
	}

	/**
	 * @param beneficiario the beneficiario to set
	 */
	public void setBeneficiario(String beneficiario) {
		this.beneficiario = beneficiario;
	}

	/**
	 * @return the numeroCheque
	 */
	public int getNumeroCheque() {
		return numeroCheque;
	}

	/**
	 * @param numeroCheque the numeroCheque to set
	 */
	public void setNumeroCheque(int numeroCheque) {
		this.numeroCheque = numeroCheque;
	}

	/**
	 * @return the isCashed
	 */
	public Boolean getIsCashed() {
		return isCashed;
	}

	/**
	 * @param isCashed the isCashed to set
	 */
	public void setIsCashed(Boolean isCashed) {
		this.isCashed = isCashed;
	}

	/**
	 * @return the canBeCashed
	 */
	public Boolean getCanBeCashed() {
		return canBeCashed;
	}

	/**
	 * @param canBeCashed the canBeCashed to set
	 */
	public void setCanBeCashed(Boolean canBeCashed) {
		this.canBeCashed = canBeCashed;
	}

	/**
	 * @return the fechaHoraCashed
	 */
	public LocalDate getFechaHoraCashed() {
		return fechaHoraCashed;
	}

	/**
	 * @param fechaHoraCashed the fechaHoraCashed to set
	 */
	public void setFechaHoraCashed(LocalDate fechaHoraCashed) {
		this.fechaHoraCashed = fechaHoraCashed;
	}

	/**
	 * @return the usuariosFirmantes
	 */
	public ArrayList<Usuario> getUsuariosFirmantes() {
		return usuariosFirmantes;
	}

	/**
	 * @param usuariosFirmantes the usuariosFirmantes to set
	 */
	public void setUsuariosFirmantes(ArrayList<Usuario> usuariosFirmantes) {
		this.usuariosFirmantes = usuariosFirmantes;
	}

	/**
	 * 
	 * Métodos Contructores
	 * 
	 * 
	 */
	public Cheque() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	/**
	 * @param beneficiario
	 * @param numeroCheque
	 * @param isCashed
	 * @param canBeCashed
	 * @param fechaHoraCashed
	 * @param usuariosFirmantes
	 */
	public Cheque(String beneficiario, int numeroCheque, Boolean isCashed, Boolean canBeCashed,
			LocalDate fechaHoraCashed, ArrayList<Usuario> usuariosFirmantes) {
		super();
		this.beneficiario = beneficiario;
		this.numeroCheque = numeroCheque;
		this.isCashed = isCashed;
		this.canBeCashed = canBeCashed;
		this.fechaHoraCashed = fechaHoraCashed;
		this.usuariosFirmantes = usuariosFirmantes;
	}

	/**
	 * Este método se encarga de setear el atributos canBeCashed a false
	 * dejando el parametro isCashed en false
	 */
	protected void anularCheque(){}
	
	/**
	 * Este método se encarga de setear los atributos canBeCasheda e isCashed a false
	 */
	protected void cashCheck() {}
	
	
	/**
	 * Este método crea un String con la lista de Usuarios que firman el cheque
	 * @return String
	 */
	protected String listUsuariosFirmantes() {
		return "-Juan M Gutiérrez/n-Heinz Gamboa";
	}

	/**
	 *Meetodo toString
	 */
	@Override
	public String toString() {
		return "Cheque a Nombre de " + this.beneficiario + " por un monto de ";
	}
	
	

}
