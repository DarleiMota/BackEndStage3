package br.com.darleimota.exercicios.exercicio5_2;

public class ProdutoInfo {
    private int quantidade;
    private double preco;
    private String categoria;

    public ProdutoInfo(int quantidade, double preco, String categoria) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.categoria = categoria;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return String.format("Categoria: %-10s | Quantidade: %2d | Preço: R$ %.2f",
                getCategoria(),getQuantidade(),getPreco());
    }
}
