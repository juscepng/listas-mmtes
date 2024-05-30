import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovimentoPeaoTest {

    @Test
    public void mover() {
        Movimento movimentoPeao = new MovimentoPeao();
        int[] novaPosicao = movimentoPeao.mover(2, 2);
        assertEquals(3, novaPosicao[0]);
        assertEquals(2, novaPosicao[1]);
    }
}