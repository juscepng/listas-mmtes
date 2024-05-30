package hamburgueria.produtos.raiz;

import hamburgueria.produtos.Hamburguer;

public class HamburguerRaiz extends Hamburguer {

    @Override
    public void montar() {
        System.out.println("Montando um Hamburguer raíz");
    }

    @Override
    public void embalar() {
        System.out.println("Embalando um Hamburguer raíz");

    }

    @Override
    public void despachar() {
        System.out.println("Despachando um Hamburguer raíz");
    }

}
