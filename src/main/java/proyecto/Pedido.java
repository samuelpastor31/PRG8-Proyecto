package proyecto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Pedido {
    static final Scanner scanner = new Scanner(System.in);
    private int identificador;
    private ArrayList<Producto> productos;
    private LocalDateTime fecha;
    private String nombreCliente;
    private boolean servidoAMesa;

    public Pedido(int identificador, ArrayList<String> productos, LocalDateTime fecha, String nombreCliente, boolean servidoAMesa) {
        this.identificador = identificador;
        this.productos = new ArrayList<>();
        this.fecha = fecha;
        this.nombreCliente = nombreCliente;
        this.servidoAMesa = servidoAMesa;
    }

    public void crearPedido(Pedido pedido){
        do {
            System.out.println("Introduzca su nombre");
            pedido.nombreCliente=scanner.next();
            System.out.println("Introduzca la fecha actual en formato dd/mm/yyyy");
        }while(true);

    }
}
