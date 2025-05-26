package br.com.darleimota.exercicios.exercicio5_2;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class EstoqueProdutos {

    private Map<String, ProdutoInfo> estoque;

    public EstoqueProdutos() {
        this.estoque = new HashMap<>();
    }

    public void adicionarProduto(String nome, ProdutoInfo info){
        estoque.put(nome,info);
        System.out.println("Produto '" + nome + "'adicionado.");
    }

    public void atualizarQuantidade(String nome, int novaQuantidade){
        ProdutoInfo produto = estoque.get(nome);
        if(produto != null){
            produto.setQuantidade(novaQuantidade);
            System.out.println("Quantidade do produto '"+ nome + "' atualizada.");
        }else {
            System.out.println("Produto não encontrado");
        }
    }

    public void exibirEstoqueOrdenado(){
        Map<String, ProdutoInfo> ordenado = new TreeMap<>(estoque);
        System.out.println("\nEstoque de Produtos (ordenado):");
        System.out.println("-".repeat(70));
        for (Map.Entry<String, ProdutoInfo> entry : ordenado.entrySet()){
            System.out.println("Produto: "+ entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("-".repeat(70));
        }
    }

    public Map<String, ProdutoInfo> getProdutosOrdenados() {
        return new TreeMap<>(estoque);
    }
}


