package proyecto;

import de.vandermeer.asciitable.AsciiTable;
import de.vandermeer.skb.interfaces.transformers.textformat.TextAlignment;
import proyecto.productos.Producto;

import java.util.ArrayList;
import java.util.Objects;


public class ListaPedidos {

    private ArrayList<Pedido> listaPedidos;

    public ListaPedidos() {
        this.listaPedidos = new ArrayList<>();

    }

    public Pedido filtrarPedido(String codigo){
        for (int i = 0; i < listaPedidos.size() ; i++) {
            if (listaPedidos.get(i).getIdentificador().equals(codigo)){
                return listaPedidos.get(i);
            }
        }
        return null;
    }

    public void verPedido() {
        AsciiTable at = new AsciiTable();
        at.addRule();
        at.addRow(null, "Código", null, "Nombre", null, "Fecha", null, "Servido");
        at.addRule();

        for (int i = 0; i < listaPedidos.size(); i++) {
            int cod = i + 1;
            at.addRow(null, "o" + cod, null, listaPedidos.get(i).getNombreCliente(),
                    null, listaPedidos.get(i).getFecha(), null, listaPedidos.get(i).getServidoAMesa());
        }

        at.setTextAlignment(TextAlignment.CENTER);
        at.addRule();
        at.addRow("", "", "", "", "", "", "", "");
        System.out.println(at.render(90));
    }

    public void obtenerPedido() {

        AsciiTable at = new AsciiTable();
        at.addRule();
        at.addRow(null, "Código", null, null, null, null, null, "Nombre", null, "Precio Base");
        at.addRule();

        for (int i = 0; i < listaPedidos.get(0).getProductos().size(); i++) {
            at.addRow(null, listaPedidos.get(0).getProductos().get(i).getCodigo(), null, null, null, null, null, listaPedidos.get(0).getProductos().get(i).getNombre(), null,listaPedidos.get(0).getProductos().get(i).getPrecio());
            at.setTextAlignment(TextAlignment.CENTER);
        }
        at.addRule();
        at.addRow("", "", "", "", "", "", "", "", "", "");
        System.out.println(at.render(90));
    }

    public void anyadirPedido(Pedido pedido) {
        listaPedidos.add(pedido);
    }

    public ArrayList<Pedido> obtenerPedidos() {
        return listaPedidos;
    }

}

