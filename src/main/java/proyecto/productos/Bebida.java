package proyecto.productos;

public class Bebida extends Producto {

    private TamañoBebida tamaño;
    private boolean rellenable;


    public Bebida(String codigo, String nombre, String descripcion,TamañoBebida tamaño, boolean rellenable, double precio, int descuento, int iva) {
        super(codigo, nombre, descripcion, precio, descuento, iva);
        this.tamaño = tamaño;
        this.rellenable = rellenable;
    }

    public TamañoBebida getTamaño() {
        return tamaño;
    }

    public boolean isRellenable() {
        return rellenable;
    }
}
