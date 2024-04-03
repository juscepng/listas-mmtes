public class Pessoa {
    private double weight;
    private double height;

    public Pessoa(double weight, double height){
        this.weight = weight;
        this.height = height;
    }

    public double calcImc(){
        return Math.round(weight / (height * height));
    }
}
