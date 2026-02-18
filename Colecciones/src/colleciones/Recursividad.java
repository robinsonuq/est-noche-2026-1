package colleciones;

import java.util.ArrayList;
import java.util.ListIterator;

public class Recursividad {

	public static void main(String[] args) {
		
		ArrayList<Integer> lista = new ArrayList<>(10);
		lista.add(3);
		ListIterator<Integer> listIterator = lista.listIterator();
		
		System.out.println(listIterator.next());
		listIterator.next();
		
		
//		listIterator.previous();
//		listIterator.hasNext();
//		listIterator.hasPrevious();
//		
//		listIterator.remove();
		
		
		
		
	}

	public static int sumarArreglo(int[] arreglo) {
		return sumarArreglo(arreglo,0,arreglo.length-1);
	}

	private static int sumarArreglo(int[] arreglo, int inicio, int fin) {

		if(inicio == fin) {
			return arreglo[inicio];
		}else {
			
			int mitad = (inicio + fin)/2;
			
			int sumIzq = sumarArreglo(arreglo, inicio,mitad);
			int sumDer = sumarArreglo(arreglo, mitad + 1,fin);
			
			return sumIzq + sumDer;
		}
		
	}
}
