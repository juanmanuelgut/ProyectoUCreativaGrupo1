/**
 * 
 */
package com.ucreativa.Transacciones;

import java.time.LocalDateTime;

/**
 * @author juangutierrez
 * @updated by: Heinz Gamboa
 *
 */
public class Transferencia extends Transaccion{
	

	//Atributos
	private int tipoTransferencia = 0;//0 Transferencia no definida, 1 entre cuentas del usuario, 2 entre usuarios del banco, 3 sinpe
	private String cuentaOrigen = "-";
	private String cuentaDestino = "-"; 
	 
	public int getTipoTransferencia() {
		return tipoTransferencia;
	}
	public void setTipoTransferencia(int tipoTransferencia) {
		this.tipoTransferencia = tipoTransferencia;
	}
	public String getCuentaOrigen() {
		return cuentaOrigen;
	}
	public void setCuentaOrigen(String cuentaOrigen) {
		this.cuentaOrigen = cuentaOrigen;
	}
	public String getCuentaDestino() {
		return cuentaDestino;
	}
	public void setCuentaDestino(String cuentaDestino) {
		this.cuentaDestino = cuentaDestino;
	}
	
	/**
	 * @param transaccionID
	 * @param fechaHoraTransaccion
	 * @param detalleTransaccion
	 * @param montoTransaccion
	 * @param tipoTransaccion
	 * @param isActive
	 * @param monedaID
	 * @param tipoTransferencia
	 * @param cuentaOrigen
	 * @param cuentaDestino
	 */
	public Transferencia(String transaccionID, LocalDateTime fechaHoraTransaccion, String detalleTransaccion,
			Double montoTransaccion, String tipoTransaccion, Boolean isActive, String monedaID, int tipoTransferencia,
			String cuentaOrigen, String cuentaDestino) {
		super(transaccionID, fechaHoraTransaccion, detalleTransaccion, montoTransaccion, tipoTransaccion, isActive,
				monedaID);
		this.tipoTransferencia = tipoTransferencia;
		this.cuentaOrigen = cuentaOrigen;
		this.cuentaDestino = cuentaDestino;
	}
	/**
	 * 
	 */
	
	@Override
	public String toString() {
		return "Clase Transferencia: => " +
		"Tipo de Transferencia: " + tipoTransferencia + " Cuenta de Origen: " + cuentaOrigen + " " + 
		"Cuenta Destino: " + cuentaDestino;
	}
	
	public void datos(String cuentaOrigenCliente, String cuentaDestinoCliente, double monto, int tipoTrans) {
		//Solicita las cuentas, el monto y el tipo para hacer la transferencia	
	}

	private boolean verificaFondos(String cuentaOrigenCliente) {
		//Verifica si la cuenta origen tiene fondos para proceder
		return true;
	}
}
