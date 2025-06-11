/*
 Exercício 2 — Uso de Set e HashSet  (OK)
Objetivo: Crie um programa que receba uma lista de nomes com possíveis repetições e armazene-os em um HashSet para eliminar duplicatas.
- Depois, imprima a lista ordenada alfabeticamente.
- Use TreeSet para a ordenação automática.

*/


package br.com.darleimota.exercicios.exercicio5_2;

import java.util.Map;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n====== Menu Estoque ======");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Atualizar quantidade");
            System.out.println("3 - Exibir produtos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do produto: ");
                    String nome = scanner.nextLine();

                    System.out.print("Quantidade: ");
                    int qtd = scanner.nextInt();

                    System.out.print("Preço: ");
                    double preco = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Categoria: ");
                    String categoria = scanner.nextLine();

                    ProdutoInfo novoProduto = new ProdutoInfo(qtd, preco, categoria);

                    estoque.adicionarProduto(nome, novoProduto);
                    break;

                case 2:
                    System.out.print("Nome do produto: ");
                    String nomeAtualizar = scanner.nextLine();
                    System.out.print("Nova quantidade: ");
                    int novaQtd = scanner.nextInt();
                    estoque.atualizarQuantidade(nomeAtualizar, novaQtd);
                    break;

                case 3:
//                    System.out.println("\nProdutos em estoque (ordenados):");
//                    for (Map.Entry<String, ProdutoInfo> entry : estoque.getProdutosOrdenados().entrySet()) {
//                        System.out.println("Produto: " + entry.getKey() +
//                                " | Quantidade: " + entry.getValue().getQuantidade() +
//                                " | Preço: "+ entry.getValue().getPreco() +
//                                " | Categoria: "+ entry.getValue().getCategoria());
//                    }
//                    for (Map.Entry<String, ProdutoInfo> entry : estoque.getProdutosOrdenados().entrySet()) {
//                        System.out.println("Produto: " + entry.getKey());
//                        System.out.println(entry.getValue());
//                        System.out.println("-".repeat(50));
//                    }
                    estoque.exibirEstoqueOrdenado();
                    break;

                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}