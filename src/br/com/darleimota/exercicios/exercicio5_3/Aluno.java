package br.com.darleimota.exercicios.exercicio5_3;
import java.lang.Comparable;

public class Aluno implements Comparable<Aluno> {
    private String nome;
    private double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    // Comparação com nota de Aluno
    @Override
    public int compareTo(Aluno outro) {
        return Double.compare(this.nota, outro.nota); // ordena por nota crescente
    }

    @Override
    public String toString() {
        return String.format("Nome: %-10s | Nota: %.1f", nome, nota);
    }
}

