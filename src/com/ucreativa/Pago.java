/**
 * 
 */
package com.ucreativa;

/**
 * @author Heinz Gamboa Rodriguez
 *
 */
public class Pago {
	
	//Atributos
	private Usuario usuarioActual;
	
	
	//Set & Get
	public Usuario getUsuarioActual() {
		return usuarioActual;
	}
	public void setUsuarioActual(Usuario usuarioActual) {
		this.usuarioActual = usuarioActual;
	}
	/**
	 * 
	 */
	public Pago(Usuario usuarioLogueado) {
		// TODO Auto-generated constructor stub
		usuarioActual = usuarioLogueado;//Se usaria para sacar los datos del usuario y buscar sus cuentas, prestamos, servicios y pagos
	}
	
	@Override
	public String toString() {
		return "Clase Pago, usando clase usuario: " + usuarioActual.getUserName();
	}
	
	private void seleccionaTipoPago(int tipoPagoSeleccionado) {
		switch(tipoPagoSeleccionado) {
		  case 1:
			  pagoServicio();
		    break;
		  case 2:
			  pagoServicio();
		    break;
		  default:
			  pagoTarjeta();
		}
	}
	
	private void pagoServicio() {
		//Solicita que seleccione el servicio y el monto a pagar
		//Solicita y verifica la fuente del dinero para poder pagar
		boolean saldo = verificaSaldoSuficiente("Numero de Cuenta", 1000.5);
	}
	
	private void pagoPrestamo() {
		//Solicita que seleccione el Prestamoy el monto a pagar
		//Solicita y verifica la fuente del dinero para poder pagar
		boolean saldo = verificaSaldoSuficiente("Numero de Cuenta", 1000.5);
	}
	
	private void pagoTarjeta() {
		//Solicita que seleccione la tarjeta y el monto a pagar
		//Solicita y verifica la fuente del dinero para poder pagar
		boolean saldo = verificaSaldoSuficiente("Numero de Cuenta", 1000.5);
	}

	private Boolean verificaSaldoSuficiente(String numeroFuenteDinero, Double monto) {
		return true;
	}
	
}
