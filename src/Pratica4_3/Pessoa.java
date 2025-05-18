package Pratica4_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return nome + " - " + idade + " anos";
    }

    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Carlos", 32));
        pessoas.add(new Pessoa("Ana", 25));
        pessoas.add(new Pessoa("Bruna", 40));
        pessoas.add(new Pessoa("Daniel", 28));

        //Ordenação por nome
        pessoas.sort(Comparator.comparing(Pessoa::getNome));
        pessoas.forEach(System.out::println);
        System.out.println("\n");

        //Ordenação por nome
        pessoas.sort(Comparator.comparing(Pessoa::getNome).reversed());
        pessoas.forEach(System.out::println);
        System.out.println("\n");

        //Ordenação por idade
        pessoas.sort(Comparator.comparing(Pessoa::getIdade));
        pessoas.forEach(System.out::println);
        System.out.println("\n");

        //Ordenação por idade decrecente
        pessoas.sort(Comparator.comparingInt(Pessoa::getIdade).reversed());
        pessoas.forEach(System.out::println);
        System.out.println("\n");

        //Odernação por nome e idade
        pessoas.sort(Comparator.comparing(Pessoa::getNome).thenComparingInt(Pessoa::getIdade));
        pessoas.forEach(System.out::println);
    }
}