package Clases_1;

import java.time.LocalDate;

public class Init {
	public static void main(String[] args) {
		
		System.out.println("PRODUCTOS");
		
		Producto pr1 = new Producto(11, "El bolardo contra el que se dio Michel", 35, 0, 5);
		Producto pr2 = new Producto(12, "El bolardo contra el que no se dio Michel", 289.99f, 4, 5);
		Producto pr3 = new Producto(13, "El bolardo contra el que tampoco se dio Michel", 26, 12, 5);
		Producto pr4 = new Producto(14, "El bolardo que estaba cerca del cual se comio Michel", 90, 15, 5);
		Producto pr5 = new Producto(15, "Este es el de repuesto", 67.89f, 2, 5);
		
		Stock stck = new Stock();
		
		System.out.println("Nuevo producto");
		System.out.println(stck.añadirProducto(pr1));
		System.out.println(stck.añadirProducto(pr2));
		System.out.println(stck.añadirProducto(pr3));
		System.out.println(stck.añadirProducto(pr4));
		System.out.println(stck.añadirProducto(pr5));
		
		
		System.out.println();
		System.out.println("Buscamos producto");
		System.out.println(stck.buscarProducto(14));
		
		System.out.println("Borramos el producto deseado");
		System.out.println(stck.borrarProducto(13));
		
		System.out.println();
		System.out.println("Lista de los productos agotados");
		System.out.println(stck.productosAgotados());
		
		System.out.println();
		System.out.println("Productos bajo mínimos");
		System.out.println(stck.productosBajoMinimos());
		
		System.out.println();
		System.out.println("FACTURAS");
		
		Factura fac1 = new Factura(LocalDate.now(), 123, true);
		Factura fac2 = new Factura(LocalDate.now(), 456, false);
		Factura fac3 = new Factura(LocalDate.now(), 125, true);
		
		CajonFacturas cf = new CajonFacturas();
		
		System.out.println();
		System.out.println("Añadimos facturas");
		System.out.println(cf.añadirFactura(fac1));
		System.out.println(cf.añadirFactura(fac2));
		System.out.println(cf.añadirFactura(fac3));
		
		System.out.println();
		System.out.println("Buscamos factura");
		System.out.println(cf.buscarFactura(125));
		
		System.out.println();
		System.out.println("Buscamos las facturas pendientes de cobro");
		System.out.println(cf.facturasPendientesCobro());
		
	}

}
