package proyecto.productos;

import proyecto.Producto;

public class Bebida extends Producto {

    private TamañoBebida tamaño;
    private boolean rellenable;


    public Bebida(int codigo, String nombre, String descripcion, double precio, int descuento, int iva) {
        super(codigo, nombre, descripcion, precio, descuento, iva);
        this.tamaño = tamaño;
        this.rellenable = rellenable;
    }
}
