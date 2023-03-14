package proyecto;

import proyecto.productos.Producto;
import proyecto.productos.TipoProducto;

import javax.print.DocFlavor;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Restaurante {

    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public static final String ANSI_WHITE = "\u001B[37m";

    public static final String ANSI_CYAN = "\u001B[36m";
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Producto> listaPedidos;

        //ListaPedidos listaPedidos = new ListaPedidos();
        new Restaurante().menu();
        // Solicitar opción al usuario
        // Ejecutar la opción seleccionada
        // Crear un pedido vacío
        // Pedir al usuario que te introduzca un código de bebida

    }

    public void menu() {
        ListaProductos listaProductos = new ListaProductos();
        ListaPedidos listaPedidos = new ListaPedidos();
        ArrayList<Producto> productos = new ArrayList<>();

        int opcion;

        do {
            System.out.println(ANSI_CYAN+"Bienvenido al bar de los 20 montaditos."+ANSI_RESET);
            System.out.println("1. Crear nuevo pedido");
            System.out.println("2. Listar todos los pedidos");
            System.out.println("3. Visualizar orden");
            System.out.println("4. Servir pedido");
            System.out.println("5. Salir");
            System.out.println("Selecciona una opción :");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    crearPedido(listaProductos, listaPedidos);
                    break;
                case 2:
                    verPedido(listaPedidos);
                    break;
                case 3:
                     visualizarOrden(productos,listaPedidos);
                    break;
                case 4:
                     servirPedido(listaPedidos);
                    break;
                case 5:
                    System.out.println(ANSI_BLUE+"Gracias por utilizar el sistema de gestión de pedidos."+ANSI_RESET);
                    break;
                default:
                    System.out.println(ANSI_RED+"Opción no válida. Por favor, seleccione otra opción."+ANSI_RESET);
                    break;
            }
        } while (opcion != 5);
    }

    public void visualizarOrden(ArrayList<Producto> productos, ListaPedidos listaPedidos){
        VistaProductos vistaProductos = new VistaProductos(productos);
        listaPedidos.verPedido();
        System.out.println("Que pedido quieres ver con más detalle?");
        // preguntar a listaPedidos que te de el pedido con el código que el usuario haya introducido
        vistaProductos.obtenerPedido(listaPedidos);
    }


    public void crearPedido(ListaProductos listaProductos, ListaPedidos listaPedidos) {
        Pedido pedido = new Pedido();
        System.out.println("Introduzca su nombre");
        pedido.setNombreCliente(scanner.next());
        System.out.println("Introduzca la fecha actual en formato dd/mm/yyyy");
        pedido.setFecha(LocalDateTime.now());
        pedido.setServidoAMesa(false);
        repetirAnyadirProductosApedido(TipoProducto.BEBIDA, "Deseas tomar alguna bebida?", pedido, listaProductos);
        repetirAnyadirProductosApedido(TipoProducto.ENTRANTE, "Deseas tomar algun entrante?", pedido, listaProductos);
        repetirAnyadirProductosApedido(TipoProducto.MONTADITOS, "Deseas tomar algun montadito?", pedido, listaProductos);
        repetirAnyadirProductosApedido(TipoProducto.POSTRE, "Postre quieres?", pedido, listaProductos);

        int i = 1;
        String codigo = "o"+i;
        pedido.setIdentificador(codigo);
        listaPedidos.anyadirPedido(pedido);
    }

    public void verPedido(ListaPedidos listaPedidos) {
        listaPedidos.verPedido();
        // preguntar al usuario qué pedido quiere ver con más detalle
        // mostrar pedido.
    }

    private void repetirAnyadirProductosApedido(TipoProducto tipoProducto, String mensaje, Pedido pedido, ListaProductos listaProductos) {
        System.out.println(mensaje);
        ArrayList<Producto> productos = listaProductos.filtrarPorTipo(tipoProducto);
        VistaProductos vistaProductos = new VistaProductos(productos);
        vistaProductos.mostrarProductos();
        anyadirProductosAPedido(productos, pedido);
    }


    private void anyadirProductosAPedido(ArrayList<Producto> productos, Pedido pedido) {
        int aux = 1;
        String producto = "";
        boolean encontrado = false;
        do {
            System.out.println("Introduzca el código del producto que desea añadir "+ANSI_BLUE+"(0 para finalizar)"+ANSI_RESET);
            String input = scanner.next();
            encontrado = false;
            for (int j = 0; j < productos.size(); j++) {
                if (input.matches(productos.get(j).getCodigo())) {
                    producto = input;
                    for (int i = 0; i < productos.size(); i++) {
                        if (productos.get(i).getCodigo().equals(producto)) {
                            pedido.anyadirProducto(productos.get(i));
                            System.out.println(productos.get(i).getNombre() + " Añadido");
                            encontrado = true;
                        }
                    }
                }
            }
            if (!encontrado && !input.equals("0")) {
                System.out.println(ANSI_RED+"El codigo del producto introducido no existe"+ANSI_RESET);
            }
            if (input.equals("0")) {
                aux = 0;
            }
        } while (aux != 0);
    }

    public void servirPedido(ListaPedidos listadoPedidos){
        listadoPedidos.verPedido();
        System.out.println("Introduzca el código de la orden que desear servir");
        String codigo = scanner.next();
        listadoPedidos.filtrarPedido(codigo).setServidoAMesa(true);
        System.out.println(ANSI_BLUE+"El pedido ha sido marcado como servido"+ANSI_RESET);
    }
}
