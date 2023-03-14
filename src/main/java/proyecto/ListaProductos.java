package proyecto;

import proyecto.productos.*;

import java.util.ArrayList;

public class ListaProductos {
    static ArrayList<Producto>productos;

    public ListaProductos() {
        this.productos = new ArrayList<>();
        inicializarLista();
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    private void inicializarLista() {
        productos.add(new Montaditos("m1", "lechuga, tomate y mayonesa", "lechuga, tomate y mayonesa", 1.38, 0, 0));
        productos.add(new Montaditos("m2", "HUEVO DURO, lechuga, tomate y mayonesa", "hola", 1.38, 0, 0));
        productos.add(new Montaditos("m3", "VEGETAL CON QUESO, lechuga, tomate y queso", "VEGETAL CON QUESO, lechuga, tomate y queso", 1.38, 0, 0));
        productos.add(new Montaditos("m4", "Burger, bacon ahumado, cebolla crujiente y alioli", "Burger, bacon ahumado, cebolla crujiente y alioli", 1.38, 0, 0));
        productos.add(new Montaditos("m5", "Pollo, bacon ahumado y salsa brava", "Pollo, bacon ahumado y salsa brava", 1.38, 0, 0));
        productos.add(new Montaditos("m6", "Pollo kebab, cebolla, pimiento verde y mayonesa", "Montadito de pollo kebab, cebolla, pimiento verde y mayonesa", 1.38, 0, 0));
        productos.add(new Montaditos("m7", "Queso ibérico, queso brie, queso de cabra y crema de queso", "", 1.38, 0, 0));
        productos.add(new Montaditos("m8", "Jamón gran reserva, queso mozzarella, tomate y pesto", "", 1.38, 0, 0));
        productos.add(new Montaditos("m9", "Pulled pork y guacamole", "", 1.38, 0, 0));
        productos.add(new Montaditos("m10", "PULLED PORK y queso brie", "", 1.38, 0, 0));
        productos.add(new Montaditos("m11", "FILETE RUSO, cebolla caramelizada y salsa de queso cheddar", "", 1.38, 0, 0));
        productos.add(new Montaditos("m12", "SALMÓN AHUMADO y crema de queso", "", 1.38, 0, 0));
        productos.add(new Montaditos("m13", "CARNE MECHADA DESHILACHADA y cebolla crujiente", "CARNE MECHADA DESHILACHADA y cebolla crujiente", 1.38, 0, 0));
        productos.add(new Montaditos("m14", "JAMÓN GRAN RESERVA, tomate y aceite de oliva virgen extra", "JAMÓN GRAN RESERVA, tomate y aceite de oliva virgen extra", 1.38, 0, 0));
        productos.add(new Montaditos("m15", "CARRILLERA AL VINO TINTO y queso ibérico", "CARRILLERA AL VINO TINTO y queso ibérico", 1.38, 0, 0));
        productos.add(new Montaditos("m16", "QUESO IBÉRICO, tortilla de patatas y mayonesa", "QUESO IBÉRICO, tortilla de patatas y mayonesa", 1.38, 0, 0));
        productos.add(new Montaditos("m17", "ALBÓNDIGAS y salsa BBQ", "ALBÓNDIGAS y salsa BBQ", 1.38, 0, 0));
        productos.add(new Montaditos("m18", "Pollo, cebolla caramelizada y mayonesa trufada", "Pollo, cebolla caramelizada y mayonesa trufada", 1.38, 0, 0));
        productos.add(new Montaditos("m19", "CHISTORRA, bacon ahumado y salsa brava", "CHISTORRA, bacon ahumado y salsa brava", 1.38, 0, 0));
        productos.add(new Montaditos("m20", "Tortilla de patatas", "Tortilla de patatas", 1.38, 0, 0));


        productos.add(new Bebida("b1", "Coca-cola 33cl", "Coca-cola 33cl", TamañoBebida.PEQUEÑA, false, 1.38, 0, 0));
        productos.add(new Bebida("b2", "Coca-Cola 1l", "Coca-Cola 1l", TamañoBebida.GRANDE, false, 2, 25, 0));
        productos.add(new Bebida("b3", "Agua", "Agua", TamañoBebida.PEQUEÑA, false, 1.38, 0, 0));
        productos.add(new Bebida("b4", "Fanta limon", "Fanta limon", TamañoBebida.PEQUEÑA, false, 1.38, 0, 0));
        productos.add(new Bebida("b5", "Fanta naranja", "Fanta naranja", TamañoBebida.PEQUEÑA, false, 1.38, 0, 0));
        productos.add(new Bebida("b6", "Cerveza bote 33cl", "Cerveza bote 33cl", TamañoBebida.PEQUEÑA, false, 1.38, 0, 0));
        productos.add(new Bebida("b7", "Cerveza caña", "Cerveza caña", TamañoBebida.MEDIANA, false, 1.38, 0, 0));
        productos.add(new Bebida("b8", "Cerveza Jarra", "Cerveza Jarra", TamañoBebida.GRANDE, false, 6, 10, 0));
        productos.add(new Bebida("b9", "Cerveza Jarra infinita (Promoción)", "Cerveza Jarra infinita (Promoción)", TamañoBebida.GRANDE, true, 10, 5, 0));


        productos.add(new Entrante("e1", "Patatas 4 quesos", "Patatas 4 quesos", 2, 1.38, 0, 0));
        productos.add(new Entrante("e2", "Bolas de pollo", "Bolas de pollo", 1, 1.38, 0, 0));
        productos.add(new Entrante("e3", "Aceitunas", "Aceitunas", 1, 1.38, 0, 0));
        productos.add(new Entrante("e4", "Nachos", "Nachos", 1, 1.38, 0, 0));
        productos.add(new Entrante("e5", "Ensalada de la casa", "Ensalada de la casa", 1, 1.38, 0, 0));
        productos.add(new Entrante("e6", "Bolas de Queso", "Bolas de Queso", 1, 1.38, 0, 0));
        productos.add(new Entrante("e7", "Alitas de pollo ( mini)", "Alitas de pollo ( mini)", 2, 2, 0, 0));
        productos.add(new Entrante("e8", "Alitas de pollo – (super)", "Alitas de pollo – (super)", 4, 4, 0, 0));
        productos.add(new Entrante("e9", "Patatas Fritas", "Patatas Fritas", 2, 1, 0, 0));
        productos.add(new Entrante("e10", "Patatas Fritas (Tamaño Maxi)", "Patatas Fritas (Tamaño Maxi)", 4, 2, 0, 0));


        productos.add(new Postre("p1", "Pastel de Queso", "Pastel de Queso", 1, TipoPostre.CELIACIOS, 0, 0));
        productos.add(new Postre("p2", "Pastel de Chocolate", "Pastel de Chocolate", 1, TipoPostre.NINGUNO, 0, 0));
        productos.add(new Postre("p3", "Helado de Chocolate", "Helado de Chocolate", 1, TipoPostre.DIABETICOS, 0, 0));
        productos.add(new Postre("p4", "Helado Vainilla", "Helado Vainilla", 1, TipoPostre.DIABETICOS, 0, 0));
        productos.add(new Postre("p5", "Helado Limón", "Helado Limón", 1, TipoPostre.AMBOS, 0, 0));
        productos.add(new Postre("p6", "Helado Fresa", "Helado Fresa", 1, TipoPostre.AMBOS, 0, 0));
    }

    public ArrayList<Producto> filtrarPorTipo(TipoProducto tipo) {
        String codigo="";
        if (tipo==TipoProducto.BEBIDA) {
            codigo = "b";
        }

        if (tipo==TipoProducto.ENTRANTE) {
            codigo = "e";
        }

        if (tipo==TipoProducto.MONTADITOS) {
            codigo = "m";
        }

        if (tipo==TipoProducto.POSTRE) {
            codigo = "p";
        }
        ArrayList<Producto> productosFiltados = new ArrayList<>();

        for (int i = 0; i <productos.size() ; i++) {
            if (productos.get(i).getCodigo().contains(codigo)){
                productosFiltados.add(productos.get(i));
            };
        }
        return productosFiltados;
    }


    public int obtenerNumeroDeProductos() {
        return 0;
    }
}
