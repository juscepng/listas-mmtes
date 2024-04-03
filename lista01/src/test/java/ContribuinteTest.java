import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContribuinteTest {

    @Test
    public void elegibleWoman(){
        Contribuinte contribuinte = new Contribuinte(63, "F", 30);

        assertEquals(true, contribuinte.validateEligible());
    }

    @Test
    public void notElegibleWomanAge(){
        Contribuinte contribuinte = new Contribuinte(50, "F", 30);

        assertEquals(false, contribuinte.validateEligible());
    }

    @Test
    public void notElegibleWomanTime(){
        Contribuinte contribuinte = new Contribuinte(65, "F", 10);

        assertEquals(false, contribuinte.validateEligible());
    }

    @Test
    public void elegibleMan(){
        Contribuinte contribuinte = new Contribuinte(65, "M", 30);

        assertEquals(true, contribuinte.validateEligible());
    }

    @Test
    public void notElegibleManAge(){
        Contribuinte contribuinte = new Contribuinte(62, "M", 30);

        assertEquals(false, contribuinte.validateEligible());
    }

    @Test
    public void notElegibleManTime(){
        Contribuinte contribuinte = new Contribuinte(65, "M", 10);

        assertEquals(false, contribuinte.validateEligible());
    }

}