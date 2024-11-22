package SistemaTienda;

public class Producto {
    private int id;
    private String nombre;
    private double precio;

    public Producto(int id, String nombre, double precio) {
        if (id <= 0 || precio < 0) {
            throw new IllegalArgumentException("El ID o el precio del producto son incorrectos");
        }
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio < 0) {
            throw new IllegalArgumentException("Ingrese correctamente el precio");
        }
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto [ID=" + id + ", Nombre=" + nombre + ", Precio=" + precio + "]";
    }
}
