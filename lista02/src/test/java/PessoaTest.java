package Pessoa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PessoaTest {
    @Test
    public void calcImc(){

        Pessoa pessoa = new Pessoa(94, 1.70);

        assertEquals(33, pessoa.calcImc());
    }

    @Test
    public void invalidWeight(){
        assertThrows(IllegalArgumentException.class, () -> new Pessoa(-94,1.70 ));
        assertThrows(IllegalArgumentException.class, () -> new Pessoa(0, 1.70));
    }

    @Test
    public void invalidHeight(){
            assertThrows(IllegalArgumentException.class, () -> new Pessoa(94,-1.70 ));
            assertThrows(IllegalArgumentException.class, () -> new Pessoa(94, 0));
    }
}
