import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PecaTest {

    @Test
    public void executarMovimentoComMovimentoCavalo() {
        Peca peca = new Peca(new MovimentoCavalo());
        int[] novaPosicao = peca.executarMovimento(1, 1);
        assertEquals(3, novaPosicao[0]);
        assertEquals(2, novaPosicao[1]);
    }

    @Test
    public void executarMovimentoComMovimentoPeao() {
        Peca peca = new Peca(new MovimentoPeao());
        int[] novaPosicao = peca.executarMovimento(2, 2);
        assertEquals(3, novaPosicao[0]);
        assertEquals(2, novaPosicao[1]);
    }

    @Test
    public void executarMovimentoComMovimentoBispo() {
        Peca peca = new Peca(new MovimentoBispo());
        int[] novaPosicao = peca.executarMovimento(3, 3);
        assertEquals(4, novaPosicao[0]);
        assertEquals(4, novaPosicao[1]);
    }

    @Test
    public void alterarMovimento() {
        Peca peca = new Peca(new MovimentoCavalo());
        peca.setMovimento(new MovimentoBispo());
        int[] novaPosicao = peca.executarMovimento(1, 1);
        assertEquals(2, novaPosicao[0]);
        assertEquals(2, novaPosicao[1]);
    }
}
