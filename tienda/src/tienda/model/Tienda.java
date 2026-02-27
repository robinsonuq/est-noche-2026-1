package tienda.model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Tienda {
	
	    private Map<String, Venta> ventasHash = new HashMap<>();
	    private Map<String, Venta> ventasOrdenadas = new TreeMap<>();
	    private Map<String, Venta> ventasInsercion = new LinkedHashMap<>();

	    public void registrarVenta(Venta v) {
	        ventasHash.put(v.getCodigo(), v);
	        ventasOrdenadas.put(v.getCodigo(), v);
	        ventasInsercion.put(v.getCodigo(), v);
	    }

	    
	    
	    
	    
	    public void consultarProducto(String codigo) {
	        Venta v = ventasHash.get(codigo);
	        if (v != null)
	            System.out.println(v);
	        else
	            System.out.println("Producto no encontrado");
	    }

	    public void mostrarTodas() {
	    	System.out.println("=== Todas (sin orden) ===");
	        
	        Iterator<Entry<String, Venta>> iterator = ventasHash.entrySet().iterator();
	        while (iterator.hasNext()) {
	            Entry<String, Venta> next = iterator.next();
	            String key = next.getKey();
	            Venta value = next.getValue();
	            
	            System.out.println(value);
	        }
	    }
	    public void mostrarTodasClaves() {
	    	System.out.println("=== Todas (sin orden) ===");
	        
	        Iterator<String> iterator = ventasHash.keySet().iterator();
	        while (iterator.hasNext()) {
	            String clave = iterator.next();
	            Venta venta = ventasHash.get(clave);
	            System.out.println(venta);
	        }
	    }
	    public void mostrarTodasValores() {
	    	System.out.println("=== Todas (sin orden) ===");
	        
	        Iterator<Venta> iterator = ventasHash.values().iterator();
	        while (iterator.hasNext()) {
	            Venta valor = iterator.next();
	        }
	    }

	    public void mostrarOrdenadas() {
	        System.out.println("=== Ordenadas por código ===");
	        ventasOrdenadas.values().forEach(System.out::println);
	    }

	    public void mostrarOrdenInsercion() {
	        System.out.println("=== Orden de registro ===");
	        ventasInsercion.values().forEach(System.out::println);
	    }
	    
	    public void mostrarConEntrySet() {
	        Iterator<Map.Entry<String, Venta>> it = ventasHash.entrySet().iterator();
	        
	        while (it.hasNext()) {
	            Map.Entry<String, Venta> entry = it.next();
	            String codigo = entry.getKey();
	            Venta venta = entry.getValue();
	            
	            System.out.println(codigo + " -> " + venta);
	        }
	    }
}
