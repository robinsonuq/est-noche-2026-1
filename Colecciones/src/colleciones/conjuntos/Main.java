package colleciones.conjuntos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
//		
//		List<Persona> lista = new ArrayList<>();
//		lista.add(new Persona("Juan", 20));
//		lista.add(new Persona("Maria", 18));
//		lista.add(new Persona("Andrea", 20));
//		lista.add(new Persona("Raul", 18));
//		
//		ArrayList<Persona> listaPersonas18 = new ArrayList<>();
//		
//		Iterator<Persona> iterator = lista.iterator();
//		while(iterator.hasNext()) {
//			Persona persona = iterator.next();
//			if(persona.getEdad() == 18) {
//				listaPersonas18.add(persona);
//			}
//		}
//		
//		List<Persona> collect = lista.stream().
//				filter(p -> p.getEdad() == 18).
//				collect(Collectors.toList());
		
		
//		lista.sort((p1,p2)-> p1.compareTo(p2));
//		lista.sort((p1,p2)-> p1.compareTo(p2));
//		
//		lista.sort(Comparator.comparing(Persona	getEdad));
//		
//		Collections.sort(lista);
//	
//		Collections.sort(lista,new ComparatorEdad());
//		
//		System.out.println(lista);
	
		
		
		String a = "Aa";
		String b = "BB";
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
		Set<Persona> nombres = new HashSet<>();
		nombres.add(new Persona("Juan", 20));
		nombres.add(new Persona("Juan", 20));
		nombres.add(new Persona("Juan", 20));
		nombres.add(new Persona("Juan", 20));
		
		System.out.println(nombres);
		
		
			
		
		
		
		
		
		
	}
}
