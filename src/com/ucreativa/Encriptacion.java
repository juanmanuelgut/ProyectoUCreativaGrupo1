/**
 * 
 */
package com.ucreativa;

/**
 * @author juangutierrez
 *
 */
public interface Encriptacion {
	
	public static Boolean encriptable = true;
	
	/**
	 * @return
	 */
	public String generarIdentificador();
	
	/**
	 * @param identificador
	 */
	public void procesarIdentificador(String identificador);

}
