package com.estrategit.taller.servicio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.estrategit.taller.modelo.Cajera;
import com.estrategit.taller.modelo.Cliente;
import com.estrategit.taller.modelo.Detalle;
import com.estrategit.taller.modelo.Factura;
import com.estrategit.taller.modelo.Producto;

public class AtiendeCajera {
	
	public static void main(String[] args) {
		
		Thread cajera1 = new Thread(
				new Runnable() {
					public void run() {
						Cajera caja = new Cajera();
						caja.setIdCajera(1);
						caja.setNombre("Luisa");
						caja.setCedula("99991");
						
						ProcesaFactura genera = new ProcesaFactura();
						List<Cliente> listaCliente = new ArrayList<Cliente>();
						Integer IdFactura = 12546;
						
						listaCliente.add(new Cliente("Juan Perez","0912457836", "Calle J y la 26"));
						listaCliente.add(new Cliente("Luisa Naranjo","0960142587", "alborada"));
						listaCliente.add(new Cliente("Maria Torres","098757836", "Portete y la 15"));
						listaCliente.add(new Cliente("Piedad Lemus","0925987836", "Sauces 4"));
						listaCliente.add(new Cliente("Marcos LLerena","092547834", "Vaca Galindo y la 24"));
						
						for (Cliente cli : listaCliente) {
							List<Detalle> detalle = new ArrayList<Detalle>();
							//se llama la generacion de factura
							detalle.add(new Detalle(1, new Producto(2536, "Peinilla", 1.25),2));
							detalle.add(new Detalle(2, new Producto(148, "Gel fijado", 4.14),1));
							detalle.add(new Detalle(3, new Producto(2573, "Moños", 0.24),5));
							
							IdFactura++;
							
							Factura factura = new Factura();
							factura.setIdfactura(IdFactura);
							factura.setCajera(caja);
							factura.setCliente(cli);
							factura.setFecha(new Date());
							factura.setDetalleFactura(detalle);
							
							genera.imprimeFactura(factura);
							
						}
					}
				}
				);
		Thread cajera2 = new Thread(
				new Runnable() {
					public void run() {
						Cajera caja = new Cajera();
						caja.setIdCajera(2);
						caja.setNombre("Carlos");
						caja.setCedula("99992");
						
						ProcesaFactura genera = new ProcesaFactura();
						List<Cliente> listaCliente = new ArrayList<Cliente>();
						Integer IdFactura = 22546;
						
						listaCliente.add(new Cliente("Dario Suarez","0912365478", "Calle J y la 26"));
						listaCliente.add(new Cliente("Pedro Vera","09607090", "alborada"));
						listaCliente.add(new Cliente("Maria Torres","098757836", "Portete y la 15"));
						listaCliente.add(new Cliente("Piedad Lemus","0925987836", "Sauces 4"));
						listaCliente.add(new Cliente("Celia Tanner","1425367858", "Vaca Galindo y la 24"));
						
						for (Cliente cli : listaCliente) {
							List<Detalle> detalle = new ArrayList<Detalle>();
							//se llama la generacion de factura
							detalle.add(new Detalle(1, new Producto(125, "Zapatilla", 3.15),3));
							detalle.add(new Detalle(2, new Producto(3645, "Medias", 2.36),2));
							
							IdFactura++;
							
							Factura factura = new Factura();
							factura.setIdfactura(IdFactura);
							factura.setCajera(caja);
							factura.setCliente(cli);
							factura.setFecha(new Date());
							factura.setDetalleFactura(detalle);
							
							genera.imprimeFactura(factura);
							
						}
					}
				}
				);
		Thread cajera3 = new Thread(
				new Runnable() {
					public void run() {
						Cajera caja = new Cajera();
						caja.setIdCajera(3);
						caja.setNombre("Josefa");
						caja.setCedula("99993");
						
						ProcesaFactura genera = new ProcesaFactura();
						List<Cliente> listaCliente = new ArrayList<Cliente>();
						Integer IdFactura = 32546;
						
						listaCliente.add(new Cliente("Maria Lopez","091244475", "Calle J y la 26"));
						listaCliente.add(new Cliente("Bueno Salas","0960142587", "alborada"));
						listaCliente.add(new Cliente("Rocio Realpe","098757836", "Portete y la 15"));
						listaCliente.add(new Cliente("Salma Tapia","3625143333", "Sauces 4"));
						listaCliente.add(new Cliente("Sol Carpio","092547834", "Vaca Galindo y la 24"));
						
						for (Cliente cli : listaCliente) {
							List<Detalle> detalle = new ArrayList<Detalle>();
							//se llama la generacion de factura
							detalle.add(new Detalle(1, new Producto(336, "Tomate", 0.25),10));
							
							
							IdFactura++;
							Factura factura = new Factura();
							factura.setIdfactura(IdFactura);
							factura.setCajera(caja);
							factura.setCliente(cli);
							factura.setFecha(new Date());
							factura.setDetalleFactura(detalle);
							
							genera.imprimeFactura(factura);
							
						}
					}
				}
				);
		Thread cajera4 = new Thread(
				new Runnable() {
					public void run() {
						Cajera caja = new Cajera();
						caja.setIdCajera(4);
						caja.setNombre("Mario");
						caja.setCedula("99994");
						
						ProcesaFactura genera = new ProcesaFactura();
						List<Cliente> listaCliente = new ArrayList<Cliente>();
						Integer IdFactura = 42546;
						
						listaCliente.add(new Cliente("Mario Carpio","0912457836", "Calle J y la 26"));
						listaCliente.add(new Cliente("Luiggi Mero","0960142587", "alborada"));
						listaCliente.add(new Cliente("Patricio Estrella","098757836", "Portete y la 15"));
						listaCliente.add(new Cliente("Bob Esponja","0925987836", "Sauces 4"));
						listaCliente.add(new Cliente("Luis Salmon","092547834", "Vaca Galindo y la 24"));
						
						for (Cliente cli : listaCliente) {
							List<Detalle> detalle = new ArrayList<Detalle>();
							//se llama la generacion de factura
							detalle.add(new Detalle(1, new Producto(78, "Cebolla", 0.15),20));
							detalle.add(new Detalle(2, new Producto(336, "Tomate", 0.25),15));
							detalle.add(new Detalle(3, new Producto(256, "Pimiento", 0.10),15));
							detalle.add(new Detalle(4, new Producto(256, "Papa", 0.24),10));
							
							IdFactura++;
							Factura factura = new Factura();
							factura.setIdfactura(IdFactura);
							factura.setCajera(caja);
							factura.setCliente(cli);
							factura.setFecha(new Date());
							factura.setDetalleFactura(detalle);
							
							genera.imprimeFactura(factura);
							
						}
					}
				}
				);
		Thread cajera5 = new Thread(
				new Runnable() {
					public void run() {
						Cajera caja = new Cajera();
						caja.setIdCajera(5);
						caja.setNombre("Jorge");
						caja.setCedula("99995");
						
						ProcesaFactura genera = new ProcesaFactura();
						List<Cliente> listaCliente = new ArrayList<Cliente>();
						Integer IdFactura = 52546;
						
						listaCliente.add(new Cliente("Luis Pasto","0912457836", "Calle J y la 26"));
						listaCliente.add(new Cliente("Calamardo","0960142587", "alborada"));
						listaCliente.add(new Cliente("Don Cangrejo","098757836", "Portete y la 15"));
						listaCliente.add(new Cliente("Piero Sanchez","0925987836", "Sauces 4"));
						listaCliente.add(new Cliente("Arenita","092547834", "Vaca Galindo y la 24"));
						
						for (Cliente cli : listaCliente) {
							List<Detalle> detalle = new ArrayList<Detalle>();
							//se llama la generacion de factura
							detalle.add(new Detalle(1, new Producto(2536, "Peinilla", 1.25),2));
							detalle.add(new Detalle(2, new Producto(4555, "Escoba", 2.36),1));
							detalle.add(new Detalle(3, new Producto(4, "Recogedor", 1.36),2));
							detalle.add(new Detalle(4, new Producto(25824, "Mantel", 5.34),1));
							detalle.add(new Detalle(5, new Producto(697, "Individual", 1.48),20));
							
							IdFactura++;
							Factura factura = new Factura();
							factura.setIdfactura(IdFactura);
							factura.setCajera(caja);
							factura.setCliente(cli);
							factura.setFecha(new Date());
							factura.setDetalleFactura(detalle);
							
							genera.imprimeFactura(factura);
							
						}
					}
				}
				);
		cajera1.start();
		cajera2.start();
		cajera3.start();
		cajera4.start();
		cajera5.start();
		
		
		
		
	}
	

}
