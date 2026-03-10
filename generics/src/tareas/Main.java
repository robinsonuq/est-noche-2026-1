package tareas;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        ListaDeTareas<String> lista = new ListaDeTareas<>();

        lista.agregarTarea(new Tarea<>("Hacer informe", 1, new Date(125, 3, 10)));
        lista.agregarTarea(new Tarea<>("Estudiar Java", 2, new Date(125, 3, 5)));
        lista.agregarTarea(new Tarea<>("Enviar correo", 1, new Date(125, 3, 7)));

        System.out.println("Tareas con prioridad 1:");
        for (Tarea<String> t : lista.obtenerPorPrioridad(1)) {
            System.out.println(t);
        }

        System.out.println("\nTareas ordenadas por fecha:");
        lista.mostrarOrdenadasPorFecha();
    }
}