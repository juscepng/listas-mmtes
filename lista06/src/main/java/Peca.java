public class Peca {

    private Movimento movimento;

    public Peca(Movimento movimento) {
        this.movimento = movimento;
    }

    public int[] executarMovimento(int xAtual, int yAtual) {
        return movimento.mover(xAtual, yAtual);
    }

    public void setMovimento(Movimento movimento) {
        this.movimento = movimento;
    }
}