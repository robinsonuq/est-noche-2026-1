package tienda.model;

public class Venta {
    private String codigo;
    private String nombre;
    private int cantidad;
    private double total;

    public Venta(String codigo, String nombre, int cantidad, double total) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.total = total;
    }

    public String getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return codigo + " - " + nombre + 
               " | Cantidad: " + cantidad + 
               " | Total: $" + total;
    }
}