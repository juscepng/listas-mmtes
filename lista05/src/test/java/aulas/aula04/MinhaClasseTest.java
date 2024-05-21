package aulas.aula04;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Supplier;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.MockedStatic;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class MinhaClasseTest {
    
    @Mock
    IGerenciadorMensagem gerenciadorMock;
    
    @Mock
    CompletableFuture<String> futureMock;

    @BeforeEach
    public void beforeEach() {
        MockitoAnnotations.openMocks(this);
    }
    
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS)
    public void testMeuMetodo() {
        // Configuração do mock para retornar uma resposta
        when(gerenciadorMock.enviarMensagem(anyString())).thenReturn("Resposta do envio");

        // Criação da instância de MinhaClasse
        MinhaClasse minhaClasse = new MinhaClasse("Teste de mensagem");

        // Chamada do método a ser testado
        String resposta = minhaClasse.meuMetodo(gerenciadorMock);

        // Verificação se a resposta foi definida corretamente
        assertEquals("Resposta do envio", resposta);
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS)
    public void testMeuMetodoTimeout() throws ExecutionException, InterruptedException, TimeoutException {

        // Configuração do mock para simular demora na resposta
        when(gerenciadorMock.enviarMensagem(anyString())).thenAnswer(invocation -> {
            // Simula uma resposta que demora mais de 3 segundos
            TimeUnit.SECONDS.sleep(4);
            return "Resposta do envio";
        });

        // Criação da instância de MinhaClasse
        MinhaClasse minhaClasse = new MinhaClasse("Teste de mensagem");

        // Chamada do método a ser testado, que deverá lançar uma exceção de Timeout
        Exception exception = assertThrows(Exception.class, () -> {
            minhaClasse.meuMetodo(gerenciadorMock);
        });
        assertEquals("Tempo de resposta excedido", exception.getMessage());
    }
    
    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS)
    public void testMeuMetodoTimeout2() throws ExecutionException, InterruptedException, TimeoutException {

        // Configuração do mock para retornar o CompletableFuture mockado
        try (MockedStatic<CompletableFuture> utilities = mockStatic(CompletableFuture.class)) {
            when(futureMock.get(3, TimeUnit.SECONDS)).thenThrow(new InterruptedException());
            when(CompletableFuture.supplyAsync(any(Supplier.class))).thenReturn(futureMock);
        
            // Criação da instância de MinhaClasse
            MinhaClasse minhaClasse = new MinhaClasse("Teste de mensagem");

            // Chamada do método a ser testado, que deverá lançar uma exceção de Timeout
            Exception exception = assertThrows(Exception.class, () -> {
                minhaClasse.meuMetodo(gerenciadorMock);
            });
            assertEquals("Tempo de resposta excedido", exception.getMessage());
        }
    }
}
