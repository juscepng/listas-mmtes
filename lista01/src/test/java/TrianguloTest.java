import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrianguloTest {

    @Test
    public void calcArea(){
        Triangulo triangulo = new Triangulo(20, 20,20, 10, 1);

        assertEquals(100, triangulo.calcArea());
    }

    @Test
    public void calcPerimeter(){
        Triangulo triangulo = new Triangulo(20, 20,20, 10, 1);

        assertEquals(60, triangulo.calcPerimeter());
    }

    @Test
    public void isEquilateral(){
        Triangulo triangulo = new Triangulo(20, 20,20, 10, 1);

        assertEquals("Equilátero", triangulo.trianguleType());
    }

    @Test
    public void isIsosceles(){
        Triangulo triangulo = new Triangulo(20, 20,50, 10, 1);

        assertEquals("Isóceles", triangulo.trianguleType());
    }

    @Test
    public void isScalene(){
        Triangulo triangulo = new Triangulo(10, 20,30, 10, 1);

        assertEquals("Escaleno", triangulo.trianguleType());
    }
}