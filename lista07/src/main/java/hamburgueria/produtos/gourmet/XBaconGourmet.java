package hamburgueria.produtos.gourmet;

import hamburgueria.produtos.XBacon;

public class XBaconGourmet extends XBacon {

    @Override
    public void montar() {
        System.out.println("Montando um X-Bacon gourmet");
    }

    @Override
    public void embalar() {
        System.out.println("Embalando um X-Bacon gourmet");

    }

    @Override
    public void despachar() {
        System.out.println("Despachando um X-Bacon gourmet");
    }

}
