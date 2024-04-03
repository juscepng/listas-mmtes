import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    public void calcImc(){

        Pessoa pessoa = new Pessoa(94, 1.70);

        assertEquals(33, pessoa.calcImc());
    }
}