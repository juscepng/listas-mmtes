public class Numeros {

    private int num1;
    private int num2;
    private int num3;

    public Numeros(int num1, int num2, int num3){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public int calcMin(){
        return Math.min(Math.min(num1, num2), num3);
    }

    public int calcMax(){
        return Math.max(Math.max(num1, num2), num3);
    }

}
