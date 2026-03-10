package tareas;

import java.util.*;

public class ListaDeTareas<T> {

    private List<Tarea<T>> tareas;

    public ListaDeTareas() {
        tareas = new ArrayList<>();
    }

    // Agregar tarea
    public void agregarTarea(Tarea<T> tarea) {
        tareas.add(tarea);
    }

    // Obtener tareas por prioridad
    public List<Tarea<T>> obtenerPorPrioridad(int prioridad) {
        List<Tarea<T>> resultado = new ArrayList<>();

        for (Tarea<T> t : tareas) {
            if (t.getPrioridad() == prioridad) {
                resultado.add(t);
            }
        }
        return resultado;
    }

   
    public void ordenarPorPrioridad() {
        tareas.sort(Comparator.comparing(Tarea::getPrioridad));
    }
    
}