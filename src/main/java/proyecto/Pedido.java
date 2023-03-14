package proyecto;

import de.vandermeer.asciitable.AsciiTable;
import de.vandermeer.skb.interfaces.transformers.textformat.TextAlignment;
import proyecto.productos.Producto;
import proyecto.productos.TipoProducto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Pedido {
    static final Scanner scanner = new Scanner(System.in);
    private String identificador;
    private ArrayList<Producto> productos;
    private LocalDateTime fecha;
    private String nombreCliente;
    private boolean servidoAMesa;


    public Pedido() {
        this.productos = new ArrayList<>();
    }



    public String getIdentificador() {
        return identificador;
    }
    
    public boolean getServidoAMesa(){
        return servidoAMesa;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public boolean isServidoAMesa() {
        return servidoAMesa;
    }

    public void setServidoAMesa(boolean servidoAMesa) {
        this.servidoAMesa = servidoAMesa;
    }

    public void anyadirProducto(Producto producto){
        productos.add(producto);
    }
    
    
}
