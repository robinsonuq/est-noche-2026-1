package tienda.app;

import tienda.model.Tienda;
import tienda.model.Venta;

public class Aplicacion {

	public static void main(String[] args) {
        Tienda tienda = new Tienda();

        tienda.registrarVenta(new Venta("P003", "Mouse", 2, 50000));
        tienda.registrarVenta(new Venta("P001", "Teclado", 1, 80000));
        tienda.registrarVenta(new Venta("P002", "Monitor", 1, 600000));

        tienda.consultarProducto("P001");

        tienda.mostrarTodas();
        tienda.mostrarOrdenadas();
        tienda.mostrarOrdenInsercion();
	}
}
