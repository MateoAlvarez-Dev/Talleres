package _05_inventario;

public class Producto {
    protected static int id_autoincrement = 1;
    protected int id;
    protected String nombre;
    protected double precio;

    public Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
        this.id = Producto.id_autoincrement;
        Producto.id_autoincrement += 1;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id='" + id + '\'' +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
