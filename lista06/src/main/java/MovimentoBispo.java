class MovimentoBispo implements Movimento {
    @Override
    public int[] mover(int xAtual, int yAtual) {
        int[] novaPosicao = new int[2];
        novaPosicao[0] = xAtual + 1;
        novaPosicao[1] = yAtual + 1;
        return novaPosicao;
    }
}