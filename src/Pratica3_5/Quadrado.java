package Pratica3_5;

public class Quadrado implements Forma {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    @Override
    public double calcularArea() {
        return Math.pow(lado,2);
    }

    @Override
    public String toString() {
        return "Quadrado com lado "+ lado;
    }
}
