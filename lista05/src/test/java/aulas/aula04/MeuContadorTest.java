package aulas.aula04;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MeuContadorTest {
    
    public MeuContador meuContador;
    
    @BeforeEach
    public void BeforeEach(){
        meuContador = new MeuContador(0);
    }
    
    @Test
    public void testDecrementar() {
        int contagem = meuContador.decrementar();
        assertEquals(-1, contagem);
    }
    
    @Test
    public void testIncrementar() {
        int contagem = meuContador.incrementar();
        assertEquals(1, contagem);
    }
}
