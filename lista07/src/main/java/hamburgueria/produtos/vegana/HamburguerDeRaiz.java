package hamburgueria.produtos.raiz;

import hamburgueria.produtos.Hamburguer;

public class HamburguerDeRaiz extends Hamburguer {

    @Override
    public void montar() {
        System.out.println("Montando um Hamburguer de raíz");
    }

    @Override
    public void embalar() {
        System.out.println("Embalando um Hamburguer de raíz");

    }

    @Override
    public void despachar() {
        System.out.println("Despachando um Hamburguer de raíz");
    }

}
