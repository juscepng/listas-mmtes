package aulas.aula05;

//public class Contribuinte {
//
//    // Classe que representa um contribuinte, responsável por verificar se ele pode se aposentar.
//    // Os atributos são inicializados no construtor e podem ser acessados diretamente pelos métodos.
//
//    private char sexo;        // Masculino ou feminino. Deve ser 'M' para masculino ou 'F' para feminino.
//    private double anos;      // Idade do contribuinte. Deve ser um valor positivo.
//    private double trabalhou; // Tempo total de trabalho do contribuinte. Deve ser um valor positivo.
//    private double prec;      // Tempo total de trabalho em condições precárias do contribuinte. Deve ser um valor positivo.
//    private boolean naoPrec;  // Indica se o contribuinte trabalhou em condições precárias. Deve ser verdadeiro se o contribuinte não trabalhou em condições precárias, falso caso contrário.
//
//    // Construtor da classe Contribuinte. Recebe todos os atributos necessários para instanciar um objeto Contribuinte.
//    public Contribuinte(char sexo, double anos, double trabalhou, double prec, boolean naoPrec) {
//        // Inicializa os atributos com os valores fornecidos.
//        this.sexo = sexo; // Define o sexo do contribuinte.
//        this.anos = anos; // Define a idade do contribuinte.
//        this.trabalhou = trabalhou; // Define o tempo total de trabalho do contribuinte.
//        this.prec = prec; // Define o tempo total de trabalho em condições precárias do contribuinte.
//        this.naoPrec = naoPrec; // Define se o contribuinte trabalhou em condições precárias.
//    }
//
//    // Método para verificar se o contribuinte pode se aposentar.
//    public boolean podeAposentar() {
//        // Verifica se o contribuinte não trabalhou em condições precárias.
//        if (!naoPrec) {
//            // Verifica o sexo do contribuinte.
//            if (sexo == 'M') {
//                // Verifica se o contribuinte é do sexo masculino e se tem idade suficiente para se aposentar.
//                if (anos >= 65) {
//                    // Verifica se o contribuinte trabalhou tempo suficiente para se aposentar.
//                    if (trabalhou + (prec * 0.1) >= 20) {
//                        // Se todas as condições forem atendidas, retorna verdadeiro, indicando que o contribuinte pode se aposentar.
//                        return true; // O contribuinte pode se aposentar.
//                    } else {
//                        // Se o contribuinte não trabalhou tempo suficiente para se aposentar, retorna falso.
//                        return false; // O contribuinte não pode se aposentar.
//                    }
//                } else {
//                    // Se o contribuinte não tem idade suficiente para se aposentar, retorna falso.
//                    return false; // O contribuinte não pode se aposentar.
//                }
//            } else if (sexo == 'F') {
//                // Verifica se o contribuinte é do sexo feminino e se tem idade suficiente para se aposentar.
//                if (anos >= 62) {
//                    // Verifica se o contribuinte trabalhou tempo suficiente para se aposentar.
//                    if (trabalhou + (prec * 0.1) >= 15) {
//                        // Se todas as condições forem atendidas, retorna verdadeiro, indicando que o contribuinte pode se aposentar.
//                        return true; // O contribuinte pode se aposentar.
//                    } else {
//                        // Se o contribuinte não trabalhou tempo suficiente para se aposentar, retorna falso.
//                        return false; // O contribuinte não pode se aposentar.
//                    }
//                } else {
//                    // Se o contribuinte não tem idade suficiente para se aposentar, retorna falso.
//                    return false; // O contribuinte não pode se aposentar.
//                }
//            } else {
//                // Se o sexo do contribuinte não foi definido corretamente, retorna falso.
//                return false; // O contribuinte não pode se aposentar.
//            }
//        } else {
//            // Se o contribuinte não trabalhou em condições precárias, verifica se ele pode se aposentar sem considerar esse fator.
//            if (sexo == 'M') {
//                // Verifica se o contribuinte é do sexo masculino e se tem idade e tempo de trabalho suficientes para se aposentar.
//                if (anos >= 65 && trabalhou >= 20) {
//                    // Se todas as condições forem atendidas, retorna verdadeiro, indicando que o contribuinte pode se aposentar.
//                    return true; // O contribuinte pode se aposentar.
//                } else {
//                    // Se o contribuinte não atende aos requisitos de idade e tempo de trabalho para se aposentar, retorna falso.
//                    return false; // O contribuinte não pode se aposentar.
//                }
//            } else if (sexo == 'F') {
//                // Verifica se o contribuinte é do sexo feminino e se tem idade e tempo de trabalho suficientes para se aposentar.
//                if (anos >= 62 && trabalhou >= 15) {
//                    // Se todas as condições forem atendidas, retorna verdadeiro, indicando que o contribuinte pode se aposentar.
//                    return true; // O contribuinte pode se aposentar.
//                } else {
//                    // Se o contribuinte não atende aos requisitos de idade e tempo de trabalho para se aposentar, retorna falso.
//                    return false; // O contribuinte não pode se aposentar.
//                }
//            } else {
//                // Se o sexo do contribuinte não foi definido corretamente, retorna falso.
//                return false; // O contribuinte não pode se aposentar.
//            }
//        }
//    }
//}

public class Contribuinte {

    private char sexo;
    private double anos;
    private double trabalhou;
    private double prec;
    private boolean naoPrec;

    public Contribuinte(char sexo, double anos, double trabalhou, double prec, boolean naoPrec) {
        this.sexo = sexo;
        this.anos = anos;
        this.trabalhou = trabalhou;
        this.prec = prec;
        this.naoPrec = naoPrec;
    }

    public boolean podeAposentar() {
        if( sexo == 'M'){
            return podeAposentarHomem();
        } else if( sexo == 'F'){
            return podeAposentarMulher();
        } else {
            return false;
        }
    }

    public boolean podeAposentarHomem(){
        double trabalhouTotal = calcularTrabalhouTotal(trabalhou);

        if( anos >= 65 && trabalhouTotal >= 20 ){
            return true;
        } else {
            return false;
        }
    }

    public boolean podeAposentarMulher(){
        double trabalhouTotal = calcularTrabalhouTotal(trabalhou);

        if( anos >= 62 && trabalhouTotal >= 15 ){
            return true;
        } else {
            return false;
        }
    }

    private double calcularTrabalhouTotal(double trabalouValor){
        if( !naoPrec ){
            return trabalouValor + (prec * 0.1);
        } else {
            return trabalouValor;
        }
    }

}
