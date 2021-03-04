/**
 * 
 */
package com.ucreativa.Transacciones;

/**
 * @author juangutierrez
 *
 */
public interface Encriptacion {
	
	public static Boolean encriptable = true;
	
	/**
	 * Genera un Identificador único que va a ser utilizado en el proceso de Encriptación
	 * @return String
	 */
	public String generarIdentificador();
	
	/**
	 * Procesa el identificador unico del proceso de Encriptacieeon
	 * @param identificador
	 */
	public void procesarIdentificador(String identificador);

}
