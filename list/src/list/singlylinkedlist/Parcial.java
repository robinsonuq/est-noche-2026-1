package list.singlylinkedlist;

import java.util.Iterator;

import pilas.Pila;

public class Parcial {
	public static void main(String[] args) {
		
		ListaSimple miLista = new ListaSimple<>();
		
		miLista.agregarfinal(1);
		miLista.agregarfinal(2);
		miLista.agregarfinal(3);
		miLista.agregarfinal(4);
		
		miLista.imprimirLista();
		
		ListaSimple listaInvertida = invertirLista(miLista);		
		listaInvertida.imprimirLista();
	}

	private static <T> ListaSimple  invertirLista(ListaSimple miLista) {
		Pila<T> miPila1 = new Pila();
		
		
		Iterator<T> it = miLista.iterator();
		int cantidad = 0;
		while (it.hasNext()) {
			T t =  it.next();
			System.out.println(t);
			miPila1.push(t);
			cantidad++;
		}
		miLista.vaciarLista();
		
		for (int i = 0; i < cantidad; i++) {
			System.out.println(miPila1.getCima().getValorNodo());
			miLista.agregarfinal(miPila1.pop());
			
		}
		
		
		
		
		return miLista;
	}
}
