package com.generation;

import com.generation.contenedores.Bolsa;
import com.generation.contenedores.Caja;
import com.generation.productos.*;

import java.time.LocalDate;

public class Supermercado {

    public static void main(String[] args) {
        IPedido miPedido = new Pedido("pedido001");

        IContenedor bolsa1 = new Bolsa("B111", 40, 25, 900, LocalDate.now().plusMonths(20));
        IContenedor caja1 = new Caja("C222", 30, 50, 75);
        miPedido.addContenedor(bolsa1);
        miPedido.addContenedor(caja1);
        System.out.println("Bolsa: " + bolsa1);
        System.out.println("Caja: " + caja1);

        for (int i = 0; i < 2; i ++) {
            IContenedor caja = new Caja("C23" + i, 30, 40, 30);
            miPedido.addContenedor(caja);
        }
        for (int i = 0; i < 2; i ++) {
            IContenedor bolsa = new Bolsa("B12" + i, 3000, 30, 25, LocalDate.now().plusYears(10));
            miPedido.addContenedor(bolsa);
        }

        for (int i = 0; i < 2; i ++) {
            IContenedor bolsa = new Bolsa("B13" + i, 2000, 25, 20, LocalDate.now().plusYears(1));
            miPedido.addContenedor(bolsa);
        }
        miPedido.addContenedor(new Caja("C333", 50, 60, 75)); // caja grande

        System.out.println("Mi pedido con contenedores: " + miPedido);

        IProducto manzanas = new Fresco("MNZ", 1000, 1500, LocalDate.now().plusDays(20));
        IProducto helado = new Congelado("HLD", 800, 1000, LocalDate.now().plusYears(2));
        IProducto papelWC = new Higiene("PWC", 500, 2500);
        IProducto peras = new Fresco("PER", 800, 1200, LocalDate.now().plusDays(10));

        IContenedor contManzanas = miPedido.addProducto(manzanas);
        IContenedor contHelado = miPedido.addProducto(helado);
        IContenedor contPapel = miPedido.addProducto(papelWC);
        IContenedor contPeras = miPedido.addProducto(peras);

        for (int i = 0; i < 12; i ++) {
            IProducto leche = new NoPerecedero("LCH" + i, 6600, 7000, LocalDate.now().minusMonths(i));
            miPedido.addProducto(leche);
        }
        miPedido.addProducto(new Mascotas("GAT", 5000, 10000)); // comida para el gato
        miPedido.addProducto(new Mascotas("PER1", 10000, 20000)); // comida para el perro
        miPedido.addProducto(new Mascotas("PER2", 10000, 20000)); // más comida para el perro
        miPedido.addProducto(new Higiene("GEL", 1500, 1600)); // gel de ducha
        miPedido.addProducto(new Drogueria("DET", 2000, 1600)); // detergente lavadora
        miPedido.addProducto(new Drogueria("LEJ", 1000, 1000)); // lejía
        for (int i = 0; i < 24; i ++) {
            miPedido.addProducto(new Fresco("YOG" + i, 250, 300, LocalDate.now().plusDays(i))); // yogur
        }
        miPedido.addProducto(new NoPerecedero("ARR", 1000, 1000, LocalDate.now().minusYears(4))); // arroz
        for (int i = 0; i < 5; i ++) {
            miPedido.addProducto(new NoPerecedero("PAS" + i, 1000, 1200, LocalDate.now().minusYears(i))); // pasta
        }
        for (int i = 0; i < 6; i ++) {
            miPedido.addProducto(new Higiene("JAB" + i, 125, 100)); // pastillas de jabón
        }
        for (int i = 0; i < 3; i ++) {
            miPedido.addProducto(new Drogueria("EST" + i, 50, 200)); // estropajos
        }
        for (int i = 0; i < 10; i ++) {
            miPedido.addProducto(new NoPerecedero("CAL" + i, 1000, 1200, LocalDate.now().minusYears(3))); // caldo
        }

        System.out.println("Mi pedido con productos: " + miPedido);
    }
}
