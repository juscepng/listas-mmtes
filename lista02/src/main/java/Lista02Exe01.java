import java.util.Scanner;
public class Lista02Exe01 {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite o dividendo:");
            int dividendo = validarValores(scanner);

            System.out.println("Digite o divisor:");
            int divisor = validarValores(scanner);

            double resultado = divisao(dividendo, divisor);

            System.out.println("O resultado da divisao e: " + resultado);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static int validarValores(Scanner scanner){
        int numero = scanner.nextInt();

        if(numero < 0){
            throw new IllegalArgumentException("Algum dos numeros e negativo ou 0. Forneceça um valor valido.");
        }

        return numero;
    }

    public static double divisao(int num1, int num2){
        return num1 / num2;
    }
}
