import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    public void strudentApprovedWithoutAI(){
        Aluno aluno = new Aluno(20,20,35,0);

        assertEquals(1, aluno.approval());
    }

    @Test
    public void strudentApprovedWithAI(){
        Aluno aluno = new Aluno(21,19,20,30);

        assertEquals(2, aluno.approval());
    }


    @Test
    public void studentReproved(){
        Aluno aluno = new Aluno(10,10,10,0);

        assertEquals(3, aluno.approval());
    }

    @Test
    public void studentReprovedWithAI(){
        Aluno aluno = new Aluno(21,19,20,25);

        assertEquals(3, aluno.approval());
    }

    @Test
    public void finalNoteValue(){
        Aluno aluno = new Aluno(30,30,40,0);

        assertEquals(100, aluno.finalNote());
    }

    @Test
    public void finalNoteValueWithAi(){
        Aluno aluno = new Aluno(30,0,40,30);

        assertEquals(100, aluno.finalNote());
    }
}