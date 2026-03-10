package generics;

import java.util.Iterator;

public class Fabrica {

	public static void main(String[] args) {
		
		Camion<Manzana> camion1 = new Camion<>();
		
		camion1.cargar(new Manzana());
		camion1.cargar(new Manzana());
		
		Manzana descargar = camion1.descargar();
		Manzana descargar2 = camion1.descargar();
		Manzana descargar3 = camion1.descargar();
		
		System.out.println(descargar3);
		System.out.println(descargar);
		
		Iterator<Manzana> iterator = camion1.iterator();
		
		while(iterator.hasNext()) {
			Manzana next = iterator.next();
		}
	}
}
