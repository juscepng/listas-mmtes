package hamburgueria.criadores;

import hamburgueria.produtos.Sanduiche;
import hamburgueria.produtos.gourmet.HamburguerGourmet;
import hamburgueria.produtos.gourmet.XBaconGourmet;
import hamburgueria.produtos.gourmet.XBurguerGourmet;

public class HamburgueriaRaiz extends Hamburgueria {

    @Override
    public Sanduiche criarSanduiche(String tipo) {

        if ("hamburguer".equals(tipo)) {
            return new HamburguerGourmet();
        } else if ("xburguer".equals(tipo)) {
            return new XBurguerGourmet();
        } else if ("xbacon".equals(tipo)) {
            return new XBaconGourmet();
        } else {
            throw new RuntimeException("Tipo de sanduíche \"" + tipo + "\" desconhecido");
        }
    }

}
