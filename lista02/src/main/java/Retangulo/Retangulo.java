package Retangulo;

public class Retangulo {
    private double base;
    private double height;

    public Retangulo(double base, double height){
        if(base <= 0 || height <= 0){
            throw new IllegalArgumentException("Ou a base ou a altura foram lançados como 0 ou um numero negativo.");
        }

        this.base = base;
        this.height = height;
    }

    public double calcArea(){
        return base * height;
    }

    public double calcPerimeter(){
        return 2 * (base + height);
    }
}
