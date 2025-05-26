package br.com.darleimota.exercicios.exercicio5_3;

public class Aluno {
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
    public String toString() {
        return  " Nome: " + nome + " |" +
                " Nota: " + nota ;
    }
}

