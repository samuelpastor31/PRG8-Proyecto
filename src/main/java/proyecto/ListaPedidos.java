package proyecto;

import de.vandermeer.asciitable.AsciiTable;
import de.vandermeer.skb.interfaces.transformers.textformat.TextAlignment;
import proyecto.productos.Producto;

import java.util.ArrayList;


public class ListaPedidos {

    private ArrayList<Pedido> listaPedidos;

    public static void verPedido(Pedido pedido){
        AsciiTable at = new AsciiTable();
        at.addRule();
        at.addRow(null, "Código", null, "Nombre", null, "Fecha", null, "Servido");
        at.addRule();

        at.addRow(null, pedido.getIdentificador(), null, pedido.getNombreCliente(), null,pedido.getFecha(),null,pedido.getServidoAMesa());
        at.setTextAlignment(TextAlignment.CENTER);
        at.addRule();
        at.addRow("", "", "", "", "", "", "", "");
        System.out.println(at.render(90));
    }

    public void anyadirPedido(Pedido pedido) {
        listaPedidos.add(pedido);
    }

    public ArrayList<Pedido> obtenerPedidos() {
        return listaPedidos;
    }

    public Pedido obtenerPedido(String cod) {

    }




}
