package Actividad_Evaluable_RA3_RA4;

public class Producto {

    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio, int cantidad) {

        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }

        if (cantidad < 0) {
            throw new IllegalArgumentException("La cantidad no puede ser negativa");
        }

        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }
}