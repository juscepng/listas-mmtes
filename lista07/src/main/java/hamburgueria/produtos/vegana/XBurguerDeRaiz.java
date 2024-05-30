package hamburgueria.produtos.raiz;

import hamburgueria.produtos.XBurguer;

public class XBurguerDeRaiz extends XBurguer {

    @Override
    public void montar() {
        System.out.println("Montando um X-Burguer de raíz");
    }

    @Override
    public void embalar() {
        System.out.println("Embalando um X-Burguer de raíz");

    }

    @Override
    public void despachar() {
        System.out.println("Despachando um X-Burguer de raíz");
    }

}
