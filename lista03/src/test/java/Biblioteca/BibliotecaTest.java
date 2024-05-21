package Biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class BibliotecaTest {

    @Test
    public void testEmprestarLivro() {
        // Configuração do ambiente de teste
        Biblioteca.Biblioteca.BibliotecaOrdem biblioteca = new Biblioteca.Biblioteca.BibliotecaOrdem();
        Biblioteca.Biblioteca.Livro livroMock = mock(Biblioteca.Biblioteca.Livro.class);
        when(livroMock.getTitulo()).thenReturn("O codigo Limpo");
        biblioteca.adicionarLivro(livroMock);

        // Chamada do método a ser testado
        biblioteca.emprestarLivro("O codigo Limpo");

        // Verificação
        verify(livroMock, times(1)).emprestarLivro();
    }

}
