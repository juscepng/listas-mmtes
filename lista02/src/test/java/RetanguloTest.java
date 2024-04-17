package Retangulo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RetanguloTest {
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

    @Test
    public void testZero(){
        assertThrows(IllegalArgumentException.class, () -> new Retangulo(0, 0));
    }

    @Test
    public void testNegative(){
        assertThrows(IllegalArgumentException.class, () -> new Retangulo(-20, 8));

        assertThrows(IllegalArgumentException.class, () -> new Retangulo(20, -8));
    }
}
