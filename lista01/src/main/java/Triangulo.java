public class Triangulo {
    int lado1;
    int lado2;
    int lado3;
    int height;
    int base;

    public Triangulo(int lado1, int lado2, int lado3, int height, int base) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.height = height;
        this.base = base;
    }

    public int calcArea() {
        if (base == 1) {
            return lado1 * height / 2;
        } else if (base == 2) {
            return lado2 * height / 2;
        } else {
            return lado3 * height / 2;
        }
    }

    public int calcPerimeter() {
        return lado1 + lado2 + lado3;
    }

    public String trianguleType() {
        if (lado1 == lado2 && lado2 == lado3) {
            return "Equilátero";
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            return "Isóceles";
        } else if (lado1 != lado2 && lado2 != lado3) {
            return "Escaleno";
        } else {
            return null;
        }
    }
}
