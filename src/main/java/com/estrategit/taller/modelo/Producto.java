package com.estrategit.taller.modelo;

public class Producto {
	private Integer id;
	private String descProducto;
	private Double precio;
	
	public Producto(Integer id, String descProducto, Double precio) {
		this.id = id;
		this.descProducto = descProducto;
		this.precio = precio;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescProducto() {
		return descProducto;
	}
	public void setDescProducto(String descProducto) {
		this.descProducto = descProducto;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}

}
