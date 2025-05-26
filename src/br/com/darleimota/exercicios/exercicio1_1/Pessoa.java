package br.com.darleimota.exercicios.exercicio1_1;

public class Pessoa {
    private String nome;
    private int idade;


    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString(){
        return nome + " (Idade: "+ idade + ")";
    }

    public Boolean maiorDeIdade(){
        return idade >=18;
    }
}
