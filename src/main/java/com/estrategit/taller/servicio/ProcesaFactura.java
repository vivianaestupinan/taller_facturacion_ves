package com.estrategit.taller.servicio;

import com.estrategit.taller.modelo.Detalle;
import com.estrategit.taller.modelo.Factura;

public class ProcesaFactura {
	
	public void imprimeFactura(Factura factura) {
		Double subtotal, total = 0.0;
		System.out.println("************************************************************************");
		System.out.println("Supermecado Mi tiendita");
		System.out.println("Nro. factura: "+factura.getIdfactura());
		System.out.println("Cajera: "+factura.getCajera().getIdCajera()+" - "+ factura.getCajera().getNombre());
		System.out.println("Datos Cliente");
		System.out.println("Nombre: "+factura.getCliente().getNombre());
		System.out.println("Cedula: "+factura.getCliente().getCedula());
		System.out.println("Detalle");
		System.out.println("_________________________________________________________________");
		System.out.println("|Id\t|Producto\t|Cantidad\t|Precio\t|Subtotal|");
		for(Detalle det : factura.getDetalleFactura() ) {
			subtotal = det.getCantidad() * det.getProducto().getPrecio();
			total = total + subtotal;
			det.setSubtotal(subtotal);
			System.out.println("|"+det.getProducto().getId()+"\t|"+det.getProducto().getDescProducto()+"\t|"+det.getCantidad()+"\t|"+det.getProducto().getPrecio()+"\t|"+det.getSubtotal()+"|");
		}
		factura.setTotal(total);
		System.out.println("_________________________________________________________________");
		System.out.println("Total: "+factura.getTotal());
		System.out.println("Gracias por su visita");
		System.out.println("************************************************************************");
	}

}
