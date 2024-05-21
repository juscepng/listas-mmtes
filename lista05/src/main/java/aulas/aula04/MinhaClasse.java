package aulas.aula04;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class MinhaClasse {
    
    private final String mensagem;

    public MinhaClasse(String mensagem) {
        this.mensagem = mensagem;
    }

    public String meuMetodo(IGerenciadorMensagem gerenciador) {
        
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            return gerenciador.enviarMensagem(this.mensagem);
        });

        try {
            return future.get(3, TimeUnit.SECONDS); // Espera até 3 segundos para a conclusão da future
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            future.cancel(true); // Cancela a execução da future se exceder o tempo limite
            throw new RuntimeException("Tempo de resposta excedido", e);
        }
    }
}
