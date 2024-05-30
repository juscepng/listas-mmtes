package hamburgueria.produtos.gourmet;

import hamburgueria.produtos.Hamburguer;

public class HamburguerGourmet extends Hamburguer {

    @Override
    public void montar() {
        System.out.println("Montando um Hamburguer gourmet");
    }

    @Override
    public void embalar() {
        System.out.println("Embalando um Hamburguer gourmet");

    }

    @Override
    public void despachar() {
        System.out.println("Despachando um Hamburguer gourmet");
    }

}
