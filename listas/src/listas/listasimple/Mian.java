package listas.listasimple;

import java.util.ArrayList;

public class Mian {

	public static void main(String[] args) {
		
		ArrayList<Cliente>listaClientes = new ArrayList<>();
		listaClientes.add(new Cliente("Juan"));
		
		for(Cliente cliente : listaClientes) {
			System.out.println(cliente.getNombre());
		}
		
		
		SinglyLinkedList<Cliente> misClientes = new SinglyLinkedList<>();
		
		misClientes.insertAtBeginning(new Cliente("Luis"));
		misClientes.insertAtEnd(new Cliente("Luis"));
		
		for(Cliente aux : misClientes) {
			
		}
		

	}
}
