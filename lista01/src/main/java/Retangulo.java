public class Retangulo {
    private double base;
    private double height;

    public Retangulo(double base, double height){
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
