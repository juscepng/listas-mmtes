import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NomeTest {

    @Test
    public void haveAllNames(){
        Nome nome = new Nome("Sr.", "Juscelino", "Cássio", "de Sousa");

        assertEquals("Sr. Juscelino Cássio de Sousa", nome.mountName());
    }

    @Test
    public void haveFirstAndLastName(){
        Nome nome = new Nome("", "Juscelino", "", "de Sousa");

        assertEquals("Juscelino de Sousa", nome.mountName());
    }

    @Test
    public void haveAllNameNoTitle(){
        Nome nome = new Nome("", "Juscelino", "Azevedo", "de Sousa");

        assertEquals("Juscelino Azevedo de Sousa", nome.mountName());
    }

    @Test
    public void haveAllNameNoMiddleName(){
        Nome nome = new Nome("Sr.", "Juscelino", "", "de Sousa");

        assertEquals("Sr. Juscelino de Sousa", nome.mountName());
    }
}