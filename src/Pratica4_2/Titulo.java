package Pratica4_2;

public class Titulo implements Comparable <Titulo> {
    private String nome;


    public Titulo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return " Nome: " +  nome  ;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareToIgnoreCase(outroTitulo.getNome());
    }
}
