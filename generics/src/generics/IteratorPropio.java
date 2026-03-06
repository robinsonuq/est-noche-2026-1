package generics;

import java.util.Iterator;
import java.util.List;

public class IteratorPropio<T> implements Iterator<T> {

	List<T> lista;
	int index = lista.size()-1;
	
	public IteratorPropio(List<T> lista) {
		this.lista = lista;
	}

	@Override
	public boolean hasNext() {
		
		return index >= 0;
	}

	@Override
	public T next() {
		
		if(index < 0 ) {
			throw new IndexOutOfBoundsException();
		}
		
		T t = lista.get(index);
		index--;
		return t;
	}

}
