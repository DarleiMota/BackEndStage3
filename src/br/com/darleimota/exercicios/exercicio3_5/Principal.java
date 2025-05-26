package br.com.darleimota.exercicios.exercicio3_5;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        ArrayList<Forma> tipo = new ArrayList<>();
        tipo.add(new Circulo(2));
        tipo.add(new Quadrado(14));

        for (Forma forma : tipo){
            System.out.println(forma);
            System.out.println("Area é: "+ String.format("%.2f", forma.calcularArea()));
        }
    }
}
