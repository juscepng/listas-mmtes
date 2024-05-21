package aulas.aula04;

public class MeuContador {
    
    private int contagem;
    
    public MeuContador(int contagem){
        this.contagem = contagem;
    }
    
    public int incrementar() {
        return ++this.contagem;
    }
    
    public int decrementar() {
        return --this.contagem;
    }
}
