package Biblioteca;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {

    public static void main(String[] args) {
        BibliotecaOrdem biblioteca = new BibliotecaOrdem();
        biblioteca.adicionarLivro(new Livro("O codigo Limpo", "Robert C. Martin", 10));
        biblioteca.adicionarLivro(new Livro("Rapido e devagar, duas formas de pensar", "Daniel Kahneman", 3));
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite o livro desejado:");
            String livroEscolhido = scanner.nextLine();

            biblioteca.emprestarLivro(livroEscolhido);

            System.out.println("Livro emprestado com sucesso.");

//            int i = 0;
//            while(i < 5){
//                biblioteca.emprestarLivro("O codigo Limpo");
//                System.out.println("Livro emprestado com sucesso.");
//
//                i++;
//            }
//            int j = 0;
//            while(j < 3){
//                biblioteca.emprestarLivro("Rapido e devagar, duas formas de pensar");
//                System.out.println("Livro emprestado com sucesso.");
//                j++;
//            }
//
//            biblioteca.emprestarLivro("Sobre o tempo e a eternidade");

        } catch (LivroNaoEncontradoException | LivroNaoDisponivelException e) {
            System.out.println("Erro ao emprestar livro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static class Livro {
        private String titulo;
        private String autor;
        private int quantidadeDisponivel;

        public Livro(String titulo, String autor, int quantidadeDisponivel) {
            this.titulo = titulo;
            this.autor = autor;
            this.quantidadeDisponivel = quantidadeDisponivel;
        }

        public String getTitulo() {
            return titulo;
        }

        public String getAutor() {
            return autor;
        }

        public int getExemplaresDisponiveis() {
            return quantidadeDisponivel;
        }

        public void emprestarLivro() {
            if (quantidadeDisponivel > 0) {
                quantidadeDisponivel--;
            } else {
                throw new LivroNaoDisponivelException("Livro não disponível para empréstimo.");
            }
        }

        public void devolverLivro() {
            quantidadeDisponivel++;
        }
    }

    public static class BibliotecaOrdem {
        private List<Livro> livros;

        public BibliotecaOrdem() {
            livros = new ArrayList<>();
        }

        public void adicionarLivro(Livro livro) {
            livros.add(livro);
        }

        public void emprestarLivro(String titulo) {
            Livro livro = buscarLivro(titulo);
            if (livro != null) {
                livro.emprestarLivro();
            } else {
                throw new LivroNaoEncontradoException("Livro não encontrado na biblioteca.");
            }
        }

        public void devolverLivro(String titulo) {
            Livro livro = buscarLivro(titulo);
            if (livro != null) {
                livro.devolverLivro();
            } else {
                throw new LivroNaoEncontradoException("Livro não encontrado na biblioteca.");
            }
        }

        private Livro buscarLivro(String titulo) {
            for (Livro livro : livros) {
                if (livro.getTitulo().equals(titulo)) {
                    return livro;
                }
            }
            return null;
        }


    }

    public static class LivroNaoEncontradoException extends RuntimeException {
        public LivroNaoEncontradoException(String mensagem) {
            super(mensagem);
        }
    }

    public static class LivroNaoDisponivelException extends RuntimeException {
        public LivroNaoDisponivelException(String mensagem) {
            super(mensagem);
        }
    }
}
