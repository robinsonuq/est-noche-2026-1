package listas.listasimple;

import java.util.ArrayList;

public class Mian {

	public static void main(String[] args) {
		
		
		
		SinglyLinkedList<Cliente> misClientes = new SinglyLinkedList<>();
		
		misClientes.insertAtEnd(new Cliente("Luis"));
		misClientes.insertAtEnd(new Cliente("Carlos"));
		misClientes.invertir();
		misClientes.display();

	}
}
