package br.com.darleimota.exercicios.exercicio2_1;

public class ProdutoPerecivel extends Produto {
    private String dataValidade;

    public ProdutoPerecivel (String nome, double preco, int quantidade, String dataValidade){
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() +
                ", Preço: " + getPreco() +
                ", Quantidade: " + getQuantidade() +
                ", Data de Validade: " + dataValidade;
    }
}
