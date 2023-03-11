package proyecto.productos;

public class Producto {
    private String codigo;
    private String nombre;
    private String descripcion;
    private double precio;
    private int descuento;
    private int iva;
    protected TipoProducto tipoProducto;

    public Producto(String codigo, String nombre, String descripcion, double precio, int descuento, int iva) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.descuento = descuento;
        this.iva = iva;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public void calcularPvp(){
        System.out.println(precio*(iva/100*precio)-(precio*(descuento/100)));
    }
}
