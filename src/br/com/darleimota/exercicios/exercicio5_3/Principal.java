/*
Exercício 3 — Implementando Comparable (OK)
Objetivo: Crie uma classe Aluno com atributos nome e nota.
- Implemente a interface Comparable<Aluno> para ordenar alunos por nota crescente.
- Teste a ordenação com uma lista de alunos e imprima o resultado.

Exercício 4 — Ordenação com Collections.sort e Streams
Objetivo: Use a classe Aluno do exercício anterior.
- Ordene a lista de alunos por nome usando Collections.sort com um Comparator.
- Ordene a lista por nota usando Streams e imprima a lista.

*/


package br.com.darleimota.exercicios.exercicio5_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();
        OrdenadorAluno ordem = new OrdenadorAluno();

        alunos.add(new Aluno("Darlei", 9.0));
        alunos.add(new Aluno("Julia", 7.0));
        alunos.add(new Aluno("Mariana", 8.0));
        alunos.add(new Aluno("João", 7.5));
        alunos.add(new Aluno("Maria", 9.0));
        alunos.add(new Aluno("Carlos", 6.0));
        alunos.add(new Aluno("Ana", 8.3));

        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\nEscolha a ordenação:");
            System.out.println("1- Nota Crescente");
            System.out.println("2- Nota Decrescente");
            System.out.println("3- Nome (A-Z)");
            System.out.println("4- Nota Crescente com Stream");
            System.out.println("5- Nota Decrescente com Stream");
            System.out.println("0- Sair");
            System.out.print("Opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> {
                    OrdenadorAluno.ordenarPorNotaCrescente(alunos);
                    System.out.println("\n=== Alunos ordenados por Nota Crescente ===");
                }
                case 2 -> {
                    OrdenadorAluno.ordenarPorNotaDecrescente(alunos);
                    System.out.println("\n=== Alunos ordenados por Nota Decrescente ===");
                }
                case 3 -> {
                    OrdenadorAluno.ordenarPorNome(alunos);
                    System.out.println("\n=== Alunos ordenados por Nome ===");
                }
                case 4 ->{
                    OrdenadorAluno.streamOrdemCrescenteNota(alunos);
                    System.out.println("\n=== Alunos ordenados por Nota (Crescente) com Stream ===");
                }
                case 5 ->{
                    OrdenadorAluno.streamOrdemDecrecenteNota(alunos);
                    System.out.println("\n=== Alunos ordenados por Nota (Decrecente) com Stream ===");
                }
                case 0 -> System.out.println("Sistema encerrado!!!");
                default -> System.out.println("Opção invalida, digite um numero valido");
            }
            if (opcao >= 1 && opcao <= 3) {
                OrdenadorAluno.imprimirAlunos(alunos);
            }
        } while (opcao != 0);
        scanner.close();
    }
}
