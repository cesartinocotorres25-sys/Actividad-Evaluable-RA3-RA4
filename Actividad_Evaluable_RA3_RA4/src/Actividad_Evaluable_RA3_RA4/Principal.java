package Actividad_Evaluable_RA3_RA4;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        ArrayList<Producto> productos = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        // Crear uno desde el código
        Producto p1 = new Producto("Remolachas", 31.0, 23);
        productos.add(p1);

        // Crear uno desde el usuario
        System.out.print("Nombre del producto: ");
        String nombre = scan.nextLine();

        System.out.print("Precio: ");
        double precio = scan.nextDouble();

        System.out.print("Cantidad: ");
        int cantidad = scan.nextInt();

        Producto p2 = new Producto(nombre, precio, cantidad);
        productos.add(p2);

        // Limpiar buffer
        scan.nextLine();

        // Buscar por nombre
        System.out.print("Nombre a buscar: ");
        String nombreBuscar = scan.nextLine();

        boolean encontrado = false;
        for (Producto n : productos) {
            if (n.getNombre().equalsIgnoreCase(nombreBuscar)) {
                System.out.println(n.getNombre() + " está en el inventario");
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No está en el inventario");
        }

        // Buscar por precio
        System.out.print("Precio a buscar: ");
        double precioBuscar = scan.nextDouble();

        encontrado = false;
        for (Producto n : productos) {
            if (n.getPrecio() == precioBuscar) {
                System.out.println("Producto con precio " + n.getPrecio() + " encontrado");
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay productos con ese precio");
        }

        // Buscar por cantidad
        System.out.print("Cantidad a buscar: ");
        int cantidadBuscar = scan.nextInt();

        encontrado = false;
        for (Producto n : productos) {
            if (n.getCantidad() == cantidadBuscar) {
                System.out.println("Producto con cantidad " + n.getCantidad() + " encontrado");
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No hay productos con esa cantidad");
        }

        // Precio total por producto
        for (Producto n : productos) {
            double total = n.getPrecio() * n.getCantidad();
            System.out.println("Precio de " + n.getNombre() + ": " + total);
        }

        // Precio total inventario
        double totalInventario = 0;
        for (Producto n : productos) {
            totalInventario += n.getPrecio() * n.getCantidad();
        }

        System.out.println("Precio total del inventario: " + totalInventario);

        scan.close();
    }
}