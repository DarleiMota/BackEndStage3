package br.com.darleimota.exercicios.exercicio3_2;

public class Animal {
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void fazerSom(){
        System.out.println("Todo animal tem seu som ");
    }
}
