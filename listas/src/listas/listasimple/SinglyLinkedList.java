package listas.listasimple;

import java.util.Iterator;

public class SinglyLinkedList<T> implements Iterable<T>{
	
	private Node<T> first;
	private int size;

	public SinglyLinkedList() {
		first = null;
		size = 0;
	}

	// Insert at the beginning
	public void insertAtBeginning(T data) {
		Node<T> newNode = new Node(data);
		newNode.setNext(first);
		first = newNode;
		size++;
	}

	
	public void invertir() {
		invertir(first, null);
	}
	public void invertir(Node<T> node, Node<T> previous) {
		if(node != null) {
			invertir(node.getNext(), node);
			node.setNext(previous);
		}else {
			first = previous;
		}
	}
	
	
	
	
	// Insert at the end
	public void insertAtEnd(T data) {
		Node<T> newNode = new Node(data);

		if (first == null) {
			first = newNode;
		} else {
			Node<T> current = first;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(newNode);
		}
		size++;
	}

	// Display list
	public void display() {
		Node<T> current = first;
		while (current != null) {
			System.out.print(current.getData() + " -> ");
			current = current.getNext();
		}
		System.out.println("null");
	}

	// Search element
	public boolean search(T data) {
		Node<T> current = first;
		while (current != null) {
			if (current.getData() == data) {
				return true;
			}
			current = current.getNext();
		}
		return false;
	}

	// Get size
	public int size() {
		return size;
	}

	public void removeFirst() {
		if(isEmpty()) {
			throw new RuntimeException("List is empty");
		}
		first = first.getNext();
		size--;
	}
	public void removeLast() {
		if(isEmpty()) {
			throw new RuntimeException("List is empty");
		}
		if(first.getNext() == null) {
			removeFirst();
		}else {
			Node<T> aux = first;

			while(aux.getNext().getNext() != null) {
				aux = aux.getNext();
			}
			aux.setNext(null);
			size--;
		}

	}

	public void remove(int index) {

		if(isEmpty()) {
			throw new RuntimeException("List is empty");
		}
		if(!indiceValido(index)) {
			throw new RuntimeException("Index is not valid");
		}

		if(index == 0) {
			removeFirst();
			return;
		}
		if(index == size-1) {
			removeLast();
			return;
		}

		Node<T> previous = first;

		for (int i = 0; i < index - 1; i++) {
			previous = previous.getNext();
		}
		previous.setNext(previous.getNext().getNext());
		size--;
	}

	public void add(int index, int valor) {

		Node<T> node = new Node(valor);

		if(index >=0 && index < size) {

			Node<T> previous = first;

			for (int i = 0; i < index - 1; i++) {
				previous = previous.getNext();
			}
			node.setNext(previous.getNext());
			previous.setNext(node);
			size++;
		}
	}


	private boolean indiceValido(int index) {	
		return index >=0 && index < size;
	}

	private boolean isEmpty() {
		return first == null;
	}

	public void imprimir1() {

		if(isEmpty()) {
			System.out.println("No hay elementos");
			return;
		}
		Node<T> aux = first;// i = 0
		while(aux != null) {// i < size
			System.out.println(aux.getData());
			aux = aux.getNext();// i++;
		}
	}
	public void imprimir2() {

		if(isEmpty()) {
			System.out.println("No hay elementos");
			return;
		}
		for(Node<T> aux = first; aux != null; aux = aux.getNext()) {
			System.out.println(aux.getData());
		}
	}
	public void imprimir3() {

		if(isEmpty()) {
			System.out.println("No hay elementos");
			return;
		}
		imprimir3(first);
	}

	public void imprimir3(Node<T> aux) {

//		if(aux == null) {
//			return;
//		}else {
//			System.out.println(aux.getData());
//			imprimir3(aux.getNext());
//		}
		if(aux != null) {
			System.out.println(aux.getData());
			imprimir3(aux.getNext());
		}
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new SinglyLinkedListIterator(first);
	}










}