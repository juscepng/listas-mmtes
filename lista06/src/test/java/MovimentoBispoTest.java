import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovimentoBispoTest {

    @Test
    public void mover() {
        Movimento movimentoBispo = new MovimentoBispo();
        int[] novaPosicao = movimentoBispo.mover(3, 3);
        assertEquals(4, novaPosicao[0]);
        assertEquals(4, novaPosicao[1]);
    }
}