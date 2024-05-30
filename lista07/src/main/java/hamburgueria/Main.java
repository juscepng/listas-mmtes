package hamburgueria;

import hamburgueria.criadores.Hamburgueria;
import hamburgueria.criadores.HamburgueriaGourmet;
import hamburgueria.criadores.HamburgueriaRaiz;
import hamburgueria.criadores.HamburgueriaVegana;
import hamburgueria.produtos.Sanduiche;

public class Main {

    public static void main(String[] args) {
        pedirXBacon(new HamburgueriaRaiz());
        pedirXBacon(new HamburgueriaGourmet());
        pedirXBacon(new HamburgueriaVegana());

        pedirXBurguer(new HamburgueriaRaiz());
        pedirXBurguer(new HamburgueriaGourmet());
        pedirXBurguer(new HamburgueriaVegana());

        pedirMacarraNaChapa(new HamburgueriaVegana());
    }

    public static void pedirXBacon(Hamburgueria hamburgueria) {
        Sanduiche pedido = hamburgueria.pedir("xbacon");
        System.out.println(pedido.getClass() + "\n-----------------------------");
    }

    public static void pedirXBurguer(Hamburgueria hamburgueria) {
        Sanduiche pedido = hamburgueria.pedir("xburguer");
        System.out.println(pedido.getClass() + "\n-----------------------------");
    }

    public static void pedirMacarraNaChapa(Hamburgueria hamburgueria) {
        Sanduiche pedido = hamburgueria.pedir("macarraNaChapa");
        System.out.println(pedido.getClass() + "\n-----------------------------");
    }

}
