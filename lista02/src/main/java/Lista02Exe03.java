public class Lista02Exe03 {
    public static void main(String[] args) {
        metodoRecursivo(0);
    }


    public static void metodoRecursivo(int i) {
        System.out.println("Chamada recursiva: " + i);
        metodoRecursivo(i + 1);
    }
}

// 1 -> Quando temos um estouro de pilha, o java tenta executar uma coisa que chamamaos varias vezes ate um limite. No console temos um estouro de erro, sinalizado que apartir de certo ponto nao foi possivel executar mais aquele codigo. Ele ocorre quando há uma sobrecarga de dados no sistema, e acaba causando um problema de memoria. Nesse caso por executar uma função recursiva varias vezes.
// 2 -> Geralmente utilizando um limitador para o processo. Por ex, se rodarmos um while sem condição, ele provavelmente tera problema de pilha mais cedo ou mais tarde, porem, adicionando a condição de forma correta, evitamos esse problema.