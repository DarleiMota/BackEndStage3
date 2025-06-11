package br.com.darleimota.exercicios.exercicio5_3;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenadorAluno {

    public static void ordenarPorNotaCrescente(List<Aluno> alunos) {
        Collections.sort(alunos);
    }

    public static void ordenarPorNotaDecrescente(List<Aluno> alunos) {
        alunos.sort(Comparator.comparing(Aluno::getNota).reversed());
    }

    public static void ordenarPorNome(List<Aluno> alunos) {
        alunos.sort(Comparator.comparing(Aluno::getNome));
    }

    public static void imprimirAlunos(List<Aluno> alunos) {
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }
    // uso de stream e a forma lambda do comparador e do foreach
    public static void streamOrdemCrescenteNota(List<Aluno> alunos) {
        alunos.stream()
                .sorted(Comparator.comparing(Aluno::getNota))
                .forEach(System.out::println);
    }

    public static void streamOrdemDecrecenteNota(List<Aluno> alunos) {
        alunos.stream()
                .sorted(Comparator.comparing(Aluno::getNota).reversed())
                .forEach(System.out::println);
    }
}
