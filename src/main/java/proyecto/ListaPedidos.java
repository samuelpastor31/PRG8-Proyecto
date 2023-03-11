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

    public void anyadirPedido(Pedido pedido) {
        listaPedidos.add(pedido);
    }

    public ArrayList<Pedido> obtenerPedidos() {
        return listaPedidos;
    }

    public void obtenerPedido() {

        String input = Restaurante.scanner.next();

        for (int i = 0; i < listaPedidos.size(); i++) {
            if (input.equals(listaPedidos.get(i).getIdentificador())) {
                AsciiTable at = new AsciiTable();
                at.addRule();
                at.addRow(null, "Código", null, "Nombre", null, "Fecha", null, "Servido");
                at.addRule();
                at.addRow(null, listaPedidos.get(i).getIdentificador(), null, listaPedidos.get(i).getNombreCliente(),
                        null, listaPedidos.get(i).getFecha(), null,listaPedidos.get(i).getServidoAMesa());
                at.setTextAlignment(TextAlignment.CENTER);
                at.addRule();
                at.addRow("", "", "", "", "", "", "", "");
                System.out.println(at.render(90));
                break;
            } else {
                System.out.println("El código de pedido ingresado no es válido. Por favor intenta de nuevo.");
            }
        }
    }
}

