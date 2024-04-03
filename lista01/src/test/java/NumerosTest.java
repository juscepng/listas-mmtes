import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumerosTest {
    @Test
    public void isMax(){
        Numeros numeros = new Numeros(10, 15, 20);
        assertEquals(20, numeros.calcMax());
    }

    @Test
    public void isMin(){
        Numeros numeros = new Numeros(10, 15, 20);
        assertEquals(10, numeros.calcMin());
    }
}