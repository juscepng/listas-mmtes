package Pessoa;

public class Pessoa {
    private double weight;
    private double height;

    public Pessoa(double weight, double height){
        if(weight <= 0 || height <= 0){
            throw new IllegalArgumentException("Ou o peso ou a altura foram lançados como 0 ou um numero negativo.");
        }

        this.weight = weight;
        this.height = height;
    }

    public double calcImc(){
        return Math.round(weight / (height * height));
    }
}
