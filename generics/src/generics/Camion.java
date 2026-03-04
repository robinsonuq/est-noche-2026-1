package generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Camion<T> implements Iterable<T>{

	List<T> lista = new ArrayList<>();
	
	
	public void cargar(T t) {
		lista.add(t);
	}
	
	public T descargar()  {
		
		if(lista.isEmpty()) {
			throw new CamionVacioException("No sea asi, no haga eso");
		}
		
		T t = lista.get(lista.size()-1);
		lista.remove(lista.size()-1);
		return t;
	}

	@Override
	public Iterator<T> iterator() {
		return lista.iterator();
	}
}
