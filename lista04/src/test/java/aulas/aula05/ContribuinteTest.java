package aulas.aula05;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;


public class ContribuinteTest {

    @Test
    public void homemPodeAposentarSemTrabalharEmCondicoesPrecarias() {
        Contribuinte contribuinte = new Contribuinte('M', 70, 30, 0, true);
        assertTrue(contribuinte.podeAposentar());
    }

    @Test
    public void mulherPodeAposentarSemTrabalharEmCondicoesPrecarias() {
        Contribuinte contribuinte = new Contribuinte('F', 65, 25, 0, true);
        assertTrue(contribuinte.podeAposentar());
    }

    @Test
    public void homemNaoPodeSeAposentarPorIdade() {
        Contribuinte contribuinte = new Contribuinte('M', 60, 30, 0, true);
        assertFalse(contribuinte.podeAposentar());
    }

    @Test
    public void mulherNaoPodeSeAposentarPorIdade() {
        Contribuinte contribuinte = new Contribuinte('F', 59, 25, 0, true);
        assertFalse(contribuinte.podeAposentar());
    }

    @Test
    public void homemNaoPodeSeAposentarPorContribuirPorTempoInsuficiente() {
        Contribuinte contribuinte = new Contribuinte('M', 70, 15, 0, false);
        assertFalse(contribuinte.podeAposentar());
    }

    @Test
    public void mulherNaoPodeSeAposentarPorContribuirPorTempoInsuficiente() {
        Contribuinte contribuinte = new Contribuinte('F', 65, 10, 0, false);
        assertFalse(contribuinte.podeAposentar());
    }

    @Test
    public void homemPodeSeAposentarPorTrabalharPor10AnosEmCondicoesPrecariasMesmoNaoTendoContribuidoTempoSuficiente() {
        Contribuinte contribuinte = new Contribuinte('M', 70, 19, 10, false);
        assertTrue(contribuinte.podeAposentar());
    }

    @Test
    public void mulherPodeSeAposentarPorTrabalharPor10AnosEmCondicoesPrecariasMesmoNaoTendoContribuidoTempoSuficiente() {
        Contribuinte contribuinte = new Contribuinte('F', 65, 14, 10, false);
        assertTrue(contribuinte.podeAposentar());
    }
}