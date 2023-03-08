package proyecto.productos;

import proyecto.Producto;

public class Postre extends Producto {
    private TipoPostre tipoPostre;


    public Postre(int codigo, String nombre, String descripcion, double precio, int descuento, int iva) {
        super(codigo, nombre, descripcion, precio, descuento, iva);
        this.tipoPostre = tipoPostre;
    }
}
