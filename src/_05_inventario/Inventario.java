package _05_inventario;

import javax.swing.*;
import java.util.ArrayList;

public class Inventario {
    private ArrayList<ProductoEspecifico> listaProductos;

    public Inventario() {
        this.listaProductos = new ArrayList<>();
    }

    private int longestWordLength(){
        int result = 0;
        for(ProductoEspecifico producto : this.listaProductos){
            if(producto.getNombre().length() > result) result = producto.getNombre().length();
        }
        return result;
    }

    public void agregarProductos(Producto producto) {
        this.listaProductos.add((ProductoEspecifico) producto);
    }

    public boolean eliminarProducto(int id) {
        return this.listaProductos.removeIf(producto -> producto.id == id);
    }

    public void listarProductos() {
        double sumaPrecios = 0;
        int spaces = longestWordLength();

        for (ProductoEspecifico producto : this.listaProductos) {
            System.out.println(producto.getId()
                    + " - " + producto.getNombre()
                    + " - $" + producto.getPrecio()
                    + " - " + producto.getCategoria()
                    + " - " + producto.getMarca());
            sumaPrecios += producto.getPrecio();
        }

        System.out.println("Total -> " + sumaPrecios);
    }

    public Producto filtrarProductos(String nombre) {
        for (ProductoEspecifico producto : this.listaProductos) {
            if (producto.getNombre().contains(nombre)){
                System.out.println("ID: " + producto.getId()
                        + " Nombre: " + producto.getNombre() + " Precio: " + producto.getPrecio());
            }
        }

        return null;
    }

    public Producto filtrarProductos(String nombre, String categoria) {
        for (ProductoEspecifico producto : this.listaProductos) {
            if (producto.getCategoria().contains(categoria)){
                System.out.println("ID: " + producto.getId()
                        + " Nombre: " + producto.getNombre() + " Precio: " + producto.getPrecio());
            }
        }

        return null;
    }

    public Producto filtrarProductos(double precio){
        for(ProductoEspecifico producto : this.listaProductos){
            if(producto.precio == precio){
                System.out.println("ID: " + producto.getId()
                        + " Nombre: " + producto.getNombre() + " Precio: " + producto.getPrecio());
            };
        }

        return null;
    }
}
