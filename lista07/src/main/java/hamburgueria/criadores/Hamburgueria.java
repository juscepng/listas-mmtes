package hamburgueria.criadores;

import hamburgueria.produtos.Sanduiche;

public abstract class Hamburgueria {

    public Sanduiche pedir(String tipo) {
        Sanduiche sanduiche = criarSanduiche(tipo);
        sanduiche.montar();
        sanduiche.embalar();
        sanduiche.despachar();
        return sanduiche;
    }

    public abstract Sanduiche criarSanduiche(String tipo);
}
