import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovimentoCavaloTest {

    @Test
    public void mover() {
        Movimento movimentoCavalo = new MovimentoCavalo();
        int[] novaPosicao = movimentoCavalo.mover(1, 1);
        assertEquals(3, novaPosicao[0]);
        assertEquals(2, novaPosicao[1]);
    }
}