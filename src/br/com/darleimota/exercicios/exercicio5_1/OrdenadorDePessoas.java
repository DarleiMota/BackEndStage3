package br.com.darleimota.exercicios.exercicio5_1;

import java.util.Comparator;
import java.util.List;

public class OrdenadorDePessoas {

    public static void ordenarPorNome(List<Pessoa> listaNome){
        listaNome.sort(Comparator.comparing(Pessoa::getNome));
        System.out.println("Ordenação por nome decrescente: ");
        System.out.println("*".repeat(42));
        listaNome.forEach(System.out::println);
        System.out.println("*".repeat(42) + "\n");
    }

    public static void ordenarPorIdade(List<Pessoa> listaIdade){
        listaIdade.sort(Comparator.comparingInt(Pessoa::getIdade).reversed());
        System.out.println("Ordenação por Idade decrescente: ");
        System.out.println("*".repeat(42));
        listaIdade.forEach(System.out::println);
        System.out.println("*".repeat(42) + "\n");
    }

    public static void ordenarPorNomeDesempateIdade(List<Pessoa> listaDesempate){
        listaDesempate.sort(Comparator.comparing(Pessoa::getNome).thenComparingInt(Pessoa::getIdade));
        System.out.println("Ordenação por Nome e Idade para desempate: ");
        System.out.println("*".repeat(42) + "\n");
        listaDesempate.forEach(System.out::println);
        System.out.println("*".repeat(42) + "\n");
    }
}
