package hamburgueria.criadores;

import hamburgueria.produtos.Sanduiche;
import hamburgueria.produtos.raiz.HamburguerDeRaiz;
import hamburgueria.produtos.raiz.XBaconDeRaiz;
import hamburgueria.produtos.raiz.XBurguerDeRaiz;

public class HamburgueriaVegana extends Hamburgueria {

    @Override
    public Sanduiche criarSanduiche(String tipo) {

        if ("hamburguer".equals(tipo)) {
            return new HamburguerDeRaiz();
        } else if ("xburguer".equals(tipo)) {
            return new XBurguerDeRaiz();
        } else if ("xbacon".equals(tipo)) {
            return new XBaconDeRaiz();
        } else {
            throw new RuntimeException("Tipo de sanduíche \"" + tipo + "\" desconhecido");
        }
    }

}