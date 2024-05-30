package hamburgueria.criadores;

import hamburgueria.produtos.Sanduiche;
import hamburgueria.produtos.raiz.HamburguerRaiz;
import hamburgueria.produtos.raiz.XBaconRaiz;
import hamburgueria.produtos.raiz.XBurguerRaiz;

public class HamburgueriaGourmet extends Hamburgueria {

    @Override
    public Sanduiche criarSanduiche(String tipo) {

        if ("hamburguer".equals(tipo)) {
            return new HamburguerRaiz();
        } else if ("xburguer".equals(tipo)) {
            return new XBurguerRaiz();
        } else if ("xbacon".equals(tipo)) {
            return new XBaconRaiz();
        } else {
            throw new RuntimeException("Tipo de sanduíche \"" + tipo + "\" desconhecido");
        }
    }

}
