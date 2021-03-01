/**
 * 
 */
package com.ucreativa;

import java.time.LocalDateTime;

/**
 * @author juangutierrez
 * @updated by Heinz Gamboa
 */
public class Transaccion {
	//Atributos
	private String transaccionID;
	private LocalDateTime fechaHoraTransaccion;
	private String detalleTransaccion;
	private Double montoTransaccion;
	private String tipoTransaccion;
	private Boolean isActive; 
	private String monedaID;

	//Get Set
	/**
	 * @return the transaccionID
	 */
	public String getTransaccionID() {
		return transaccionID;
	}

	/**
	 * @param transaccionID the transaccionID to set
	 */
	public void setTransaccionID(String transaccionID) {
		this.transaccionID = transaccionID;
	}

	/**
	 * @return the fechaHoraTransaccion
	 */
	public LocalDateTime getFechaHoraTransaccion() {
		return fechaHoraTransaccion;
	}

	/**
	 * @param fechaHoraTransaccion the fechaHoraTransaccion to set
	 */
	public void setFechaHoraTransaccion(LocalDateTime fechaHoraTransaccion) {
		this.fechaHoraTransaccion = fechaHoraTransaccion;
	}

	/**
	 * @return the detalleTransaccion
	 */
	public String getDetalleTransaccion() {
		return detalleTransaccion;
	}

	/**
	 * @param detalleTransaccion the detalleTransaccion to set
	 */
	public void setDetalleTransaccion(String detalleTransaccion) {
		this.detalleTransaccion = detalleTransaccion;
	}

	/**
	 * @return the montoTransaccion
	 */
	public Double getMontoTransaccion() {
		return montoTransaccion;
	}

	/**
	 * @param montoTransaccion the montoTransaccion to set
	 */
	public void setMontoTransaccion(Double montoTransaccion) {
		this.montoTransaccion = montoTransaccion;
	}

	/**
	 * @return the tipoTransaccion
	 */
	public String getTipoTransaccion() {
		return tipoTransaccion;
	}

	/**
	 * @param tipoTransaccion the tipoTransaccion to set
	 */
	public void setTipoTransaccion(String tipoTransaccion) {
		this.tipoTransaccion = tipoTransaccion;
	}

	/**
	 * @return the isActive
	 */
	public Boolean getIsActive() {
		return isActive;
	}

	/**
	 * @param isActive the isActive to set
	 */
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	/**
	 * @return the monedaID
	 */
	public String getMonedaID() {
		return monedaID;
	}

	/**
	 * @param monedaID the monedaID to set
	 */
	public void setMonedaID(String monedaID) {
		this.monedaID = monedaID;
	}

	//Constructor
	/**
	 * @param transaccionID
	 * @param fechaHoraTransaccion
	 * @param detalleTransaccion
	 * @param montoTransaccion
	 * @param tipoTransaccion
	 * @param isActive
	 * @param monedaID
	 */
	public Transaccion(String transaccionID, LocalDateTime fechaHoraTransaccion, String detalleTransaccion,
			Double montoTransaccion, String tipoTransaccion, Boolean isActive, String monedaID) {
		super();
		this.transaccionID = transaccionID;
		this.fechaHoraTransaccion = fechaHoraTransaccion;
		this.detalleTransaccion = detalleTransaccion;
		this.montoTransaccion = montoTransaccion;
		this.tipoTransaccion = tipoTransaccion;
		this.isActive = isActive;
		this.monedaID = monedaID;
	}
	
	/**
	 * Le enviara una notificacion al cliente con la informacion de la transaccion
	 */
	private void alertarCliente() {
		
	}
	
	/**
	 * Notificara al banco sobre alertas sospechosas, como muchas micro transaccion en poco segundos o movimientos de largas sumas de dinero
	 */
	private void alertarBancoTransaccionSospechosa() {
		//
	}

	@Override
	public String toString() {
		return "Transaccion [transaccionID=" + transaccionID + ", fechaHoraTransaccion=" + fechaHoraTransaccion
				+ ", detalleTransaccion=" + detalleTransaccion + ", montoTransaccion=" + montoTransaccion
				+ ", monedaID=" + monedaID + "]";
	}
	
	
}
