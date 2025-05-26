package br.com.darleimota.exercicios.exercicio5_3;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenadorAluno {

    public static void ordenarPorNotaCrescente(List<Aluno> alunos){
        Collections.sort(alunos);
    }

    public static void ordenarPorNotaDecrescente(List<Aluno> alunos){
        alunos.sort(Comparator.comparing(Aluno::getNota).reversed());
    }

    public static void ordenarPorNome(List<Aluno> alunos){
        alunos.sort(Comparator.comparing(Aluno::getNome));
    }

    private static void imprimirAlunos(List<Aluno> alunos) {
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }
}
