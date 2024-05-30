package hamburgueria.produtos.raiz;

import hamburgueria.produtos.XBacon;

public class XBaconDeRaiz extends XBacon {

    @Override
    public void montar() {
        System.out.println("Montando um X-Bacon de raíz");
    }

    @Override
    public void embalar() {
        System.out.println("Embalando um X-Bacon de raíz");

    }

    @Override
    public void despachar() {
        System.out.println("Despachando um X-Bacon de raíz");
    }

}
