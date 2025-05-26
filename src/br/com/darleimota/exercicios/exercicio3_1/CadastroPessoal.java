package br.com.darleimota.exercicios.exercicio3_1;

public class CadastroPessoal {

    private String nome;
    private String dataNacimento;
    private String localNascimento;

    public CadastroPessoal(String nome, String dataNacimento, String localNascimento) {
        this.nome = nome;
        this.dataNacimento = dataNacimento;
        this.localNascimento = localNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNacimento() {
        return dataNacimento;
    }

    public void setDataNacimento(String dataNacimento) {
        this.dataNacimento = dataNacimento;
    }

    public String getLocalNascimento() {
        return localNascimento;
    }

    public void setLocalNascimento(String localNascimento) {
        this.localNascimento = localNascimento;
    }

    @Override
    public String toString() {
        return "----------------------------\n" +
                "Nome: " + nome + "\n" +
                "Data de Nascimento: " + dataNacimento + "\n" +
                "Local de Nascimento: " + localNascimento + "\n" +
                "----------------------------";
    }
}
