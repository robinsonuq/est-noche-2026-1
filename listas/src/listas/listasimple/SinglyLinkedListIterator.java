package listas.listasimple;

import java.util.Iterator;

public class SinglyLinkedListIterator<T> implements Iterator<T> {

	Node<T> aux;
	
	public SinglyLinkedListIterator(Node<T> aux){
		this.aux = aux; 
	}
	@Override
	public boolean hasNext() {
		
		return aux != null;
	}

	@Override
	public T next() {
		// TODO Auto-generated method stub
		return aux.getNext();
	}

}
