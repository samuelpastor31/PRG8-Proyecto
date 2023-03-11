package proyecto.productos;

public class Postre extends Producto {
    private TipoPostre tipoPostre;


    public Postre(String codigo, String nombre, String descripcion, double precio,TipoPostre tipoPostre, int descuento, int iva) {
        super(codigo, nombre, descripcion, precio, descuento, iva);
        this.tipoPostre = tipoPostre;
    }

    public TipoPostre getTipoPostre() {
        return tipoPostre;
    }
}
