/**
 * 
 */
package com.ucreativa.Transacciones.Usuario;

/**
 * @author Heinz Gamboa
 *
 */
public class ReponerTarjeta {
	//Atributos
	private Usuario usuarioActual;
	//Set & Get
	public Usuario getUsuarioActual() {
		return usuarioActual;
	}
	public void setUsuarioActual(Usuario usuarioActual) {
		this.usuarioActual = usuarioActual;
	}

	public ReponerTarjeta(Usuario usuarioLogueado) {
		// TODO Auto-generated constructor stub
		usuarioActual = usuarioLogueado;//Se usaria para sacar los datos del usuario y buscar sus tarjetas
		solicitarReposicion();
	}
	
	@Override
	public String toString() {
		return "Clase ReponerTarjeta, usando clase usuario: " + usuarioActual.getUserName();
	}
	
	private void solicitarReposicion() {
		//Solicitaria al usuario seleccionar la tarjeta a reponer de la lista de sus
		//tarjetas actuales, solicitaria motivo y procederia a guardar la solicitud
	}

}
