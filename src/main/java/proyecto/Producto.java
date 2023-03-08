package proyecto;

public class Producto {
    private int codigo;
    private String nombre;
    private String descripcion;
    private double precio;
    private int descuento;
    private int iva;

    public Producto(int codigo, String nombre, String descripcion, double precio, int descuento, int iva) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.descuento = descuento;
        this.iva = iva;
    }

    public void calcularPvp(){
        System.out.println(precio*(iva/100*precio)-(precio*(descuento/100)));
    }
}
