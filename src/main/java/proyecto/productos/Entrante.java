package proyecto.productos;

import proyecto.Producto;

public class Entrante extends Producto {
    private int numeroRaciones;
    private int precioRacion;


    public Entrante(int codigo, String nombre, String descripcion, double precio, int descuento, int iva) {
        super(codigo, nombre, descripcion, precio, descuento, iva);
        this.numeroRaciones = numeroRaciones;
        this.precioRacion = 1;
    }
}
