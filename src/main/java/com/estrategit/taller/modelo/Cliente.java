package com.estrategit.taller.modelo;

public class Cliente extends Persona{

	private String direccion;

	public Cliente(String nombre, String cedula, String direccion) {
		this.setNombre(nombre);
		this.setCedula(cedula);
		this.direccion = direccion;
	}
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
}
