package com.estrategit.taller.modelo;

public class Detalle {
	private Integer IdDetalle;
	private Producto producto;
	private Integer cantidad;
	private Double subtotal;
	
	public Detalle(Integer id, Producto producto, Integer cantidad ) {
		this.IdDetalle = id;
		this.producto = producto;
		this.cantidad = cantidad;
	}
	public Integer getIdDetalle() {
		return IdDetalle;
	}
	public void setIdDetalle(Integer idDetalle) {
		IdDetalle = idDetalle;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public Double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}

}
