import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RetanguloTest {

    @Test
    public void testCalcArea(){
        Retangulo retangulo = new Retangulo(20, 8);
        assertEquals(160, retangulo.calcArea());
    }

    @Test
    public void testCalcPerimeter(){
        Retangulo retangulo = new Retangulo(20, 8);
        assertEquals(56, retangulo.calcPerimeter());
    }

}