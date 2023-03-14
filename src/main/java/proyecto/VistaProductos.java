package proyecto;

import de.vandermeer.asciitable.AsciiTable;
import de.vandermeer.skb.interfaces.transformers.textformat.TextAlignment;
import proyecto.productos.Montaditos;
import proyecto.productos.Producto;

import java.util.ArrayList;

public class VistaProductos {

    private ArrayList<Producto> productos;

    public VistaProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void mostrarProductos() {
        AsciiTable at = new AsciiTable();
        at.addRule();
        at.addRow(null, "Código", null, null, null, null, null, "Nombre", null, "Precio Base");
        at.addRule();

        for (int i = 0; i < productos.size(); i++) {
                at.addRow(null, productos.get(i).getCodigo(), null, null, null, null, null, productos.get(i).getNombre(), null,productos.get(i).getPrecio());
                at.setTextAlignment(TextAlignment.CENTER);
        }
        at.addRule();
        at.addRow("", "", "", "", "", "", "", "", "", "");
        System.out.println(at.render(90));
    }

    public void obtenerPedido(ListaPedidos listaPedidos) {

        String input = Restaurante.scanner.next();

        for (int i = 0; i < productos.size(); i++) {
            if (input.equals(productos.get(i).getCodigo())) {
               mostrarProductos();
            } else {
                System.out.println("El código de pedido ingresado no es válido. Por favor intenta de nuevo");
            }
        }
    }
}
