package colleciones;

import java.util.ArrayList;

public class Colecciones {

	
	public static void main(String[] args) {
		
		ArrayList<String> lista = new ArrayList<>();
		lista.add("Ruan");
		lista.add("Rico");
		lista.add("Robinson");
		lista.add("Raul");
		
		removerLosR(lista);
		
		System.out.println(lista);
	}

	private static void removerLosR(ArrayList<String> lista) {
		
		for(int i = lista.size()-1; i >= 0; i--) {
			if(lista.get(i).charAt(0)== 'R') {
				lista.remove(i);
			}
		}
//		for(int i = 0; i < lista.size();i++) {
//			if(lista.get(i).charAt(0)== 'R') {
//				lista.remove(i);
//			}
//		}
	}
}
