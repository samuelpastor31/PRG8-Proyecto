package proyecto;

import proyecto.productos.Producto;
import proyecto.productos.TipoProducto;

import javax.print.DocFlavor;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Restaurante {
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

        Pedido pedido = new Pedido();
        int opcion;

        do {
            System.out.println("Bienvenido al bar de los 20 montaditos.");
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
                    verPedido();
                    break;
                case 3:
                    // visualizarOrden();
                    break;
                case 4:
                    // servirPedido();
                    break;
                case 5:
                    System.out.println("Gracias por utilizar el sistema de gestión de pedidos.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione otra opción.");
                    break;
            }
        } while (opcion != 5);
    }

    public void verPedido() {
        // mostrar todos los pedidos
        // preguntar al usuario qué pedido quiere ver con más detalle
        // preguntar a listaPedidos que te de el pedido con el código que el usuario haya introducido
        // mostrar pedido.
    }

    public void crearPedido(ListaProductos listaProductos, ListaPedidos listaPedidos) {

        Pedido pedido = new Pedido();
        pedido.setIdentificador(0 + 1);
        System.out.println("Introduzca su nombre");
        pedido.setNombreCliente(scanner.next());
        System.out.println("Introduzca la fecha actual en formato dd/mm/yyyy");
        pedido.setFecha(LocalDateTime.now());
        repetirAnyadirProductosApedido(TipoProducto.BEBIDA,"Deseas tomar alguna bebida?",pedido,listaProductos,"b[1-9]");
        repetirAnyadirProductosApedido(TipoProducto.ENTRANTE,"Deseas tomar algun entrante?",pedido,listaProductos,"e[1-10]");
        repetirAnyadirProductosApedido(TipoProducto.MONTADITOS,"Deseas tomar algun montadito?",pedido,listaProductos,"m[1-20]");
        repetirAnyadirProductosApedido(TipoProducto.POSTRE,"Postre quieres?",pedido,listaProductos,"e[1-6]");

        listaPedidos.anyadirPedido(pedido);
    }

    private void repetirAnyadirProductosApedido(TipoProducto tipoProducto, String mensaje,Pedido pedido, ListaProductos listaProductos, String match){
        System.out.println("Deseas tomar algun entrante");
        ArrayList<Producto> productos = listaProductos.filtrarPorTipo(tipoProducto);
        VistaProductos vistaProductos = new VistaProductos(productos);
        vistaProductos.mostrarProductos();
        anyadirProductosAPedido(productos, pedido,match);
    }


    private void anyadirProductosAPedido(ArrayList<Producto> productos, Pedido pedido, String match) {
        int aux = 1;
        String producto = "";
        do {
            System.out.println("Introduzca el código del producto que desea añadir (0 para finalizar)");
            String input = scanner.next();
            if (input.matches(match)) {
                producto = input;
                for (int i = 0; i < productos.size(); i++) {
                    if (productos.get(i).getCodigo().equals(producto)) {
                        pedido.anyadirProducto(productos.get(i));
                        System.out.println(productos.get(i).getNombre() + " Anyadido");
                    }
                }
            } else if (input.equals("0")) {
                aux = 0;
            } else {
                System.out.println("El codigo del producto introducido no existe");
            }
        } while (aux != 0);
    }
}
