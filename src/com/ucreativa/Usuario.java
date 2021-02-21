/**
 * 
 */
package com.ucreativa;

import java.util.ArrayList;

/**
 * @author juangutierrez
 *
 */
/**
 * @author juangutierrez
 *
 */
public class Usuario {
	
	//Atributos
	private String nombreUsuario;
	private String apellidoUsuario;
	private String cedula;
	private String email;
	private String userName;
	private String password;
	private ArrayList<CuentaBancaria>  arregloCuentas;
	
	
	//Getters y Setters
	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getApellidoUsuario() {
		return apellidoUsuario;
	}

	public void setApellidoUsuario(String apellidoUsuario) {
		this.apellidoUsuario = apellidoUsuario;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ArrayList<CuentaBancaria> getArregloCuentas() {
		return arregloCuentas;
	}

	public void setArregloCuentas(ArrayList<CuentaBancaria> arregloCuentas) {
		this.arregloCuentas = arregloCuentas;
	}
	
	//Constructores
	public Usuario(String nombreUsuario, String apellidoUsuario, String cedula, String email, String userName,String password, ArrayList<CuentaBancaria> arregloCuentas) {
		this.nombreUsuario = nombreUsuario;
		this.apellidoUsuario = apellidoUsuario;
		this.cedula = cedula;
		this.email = email;
		this.userName = userName;
		this.password = password;
		this.arregloCuentas = arregloCuentas;
	}

	/**
	 * 
	 */
	public Usuario() {
		// TODO Auto-generated constructor stub
		
		
		
	}
	//Métodos Clase
	
	/**
	 * @param username
	 * @param password
	 */
	public void login(String username, String password) {
		//
	}
	
	
	public void logout(){
		//
	}
	
	/**
	 * @return
	 */
	protected String listarCuentasUsuario() {
		
		return "Lista todas las cuentas activas y el saldo actual de la misma";
		
	}
	
	/**
	 * @param cuenta
	 */
	protected void aNadirCuenta(CuentaBancaria cuenta) {
		
		
	}

	@Override
	public String toString() {
		return "Usuario [nombreUsuario=" + nombreUsuario + ", apellidoUsuario=" + apellidoUsuario + ", cedula=" + cedula
				+ ", email=" + email + ", userName=" + userName + ", password=" + password + ", arregloCuentas="
				+ arregloCuentas + "]";
	}
	
	
	

}
