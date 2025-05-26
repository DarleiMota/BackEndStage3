package br.com.darleimota.exercicios.exercicio3_2;

public class Cachorro extends Animal {

    public Cachorro(String nome){
        super(nome);
    }

    @Override
    public void fazerSom() {
        System.out.println("O cachorro faz AU! AU! AU!");
    }
}
