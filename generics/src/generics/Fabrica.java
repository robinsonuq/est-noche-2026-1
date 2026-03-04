package generics;

public class Fabrica {

	public static void main(String[] args) {
		
		Camion<String> camion1 = new Camion<>();
		
		camion1.cargar("manzana");
		camion1.cargar("pera");
		
		String descargar = camion1.descargar();
		String descargar2 = camion1.descargar();
		String descargar3 = camion1.descargar();
		
		System.out.println(descargar3);
		System.out.println(descargar);
		
		for(String t : camion1 ) {
			
		}
		
		
	}
}
