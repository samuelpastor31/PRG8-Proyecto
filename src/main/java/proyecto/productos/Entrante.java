package proyecto.productos;

public class Entrante extends Producto {
    private int numeroRaciones;
    private int precioRacion;


    public Entrante(String codigo, String nombre, String descripcion,int numeroRaciones, double precio, int descuento, int iva) {
        super(codigo, nombre, descripcion, precio, descuento, iva);
        this.numeroRaciones = numeroRaciones;
        this.precioRacion = 1;
    }

    public int getNumeroRaciones() {
        return numeroRaciones;
    }

    public int getPrecioRacion() {
        return precioRacion;
    }
}
