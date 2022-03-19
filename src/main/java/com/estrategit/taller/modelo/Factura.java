package com.estrategit.taller.modelo;

import java.util.Date;
import java.util.List;

public class Factura {

	private Integer idfactura;
	private Cliente cliente;
	private Cajera cajera;
	private Date fecha;
	private Double total;
	
	private List<Detalle> detalleFactura;
	
	public Integer getIdfactura() {
		return idfactura;
	}
	public void setIdfactura(Integer idfactura) {
		this.idfactura = idfactura;
	}
	
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public List<Detalle> getDetalleFactura() {
		return detalleFactura;
	}
	public void setDetalleFactura(List<Detalle> detalleFactura) {
		this.detalleFactura = detalleFactura;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Cajera getCajera() {
		return cajera;
	}
	public void setCajera(Cajera cajera) {
		this.cajera = cajera;
	}
	
	
}
