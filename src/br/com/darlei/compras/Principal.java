package br.com.darlei.compras;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o limite do cartão:");
        double limite = scanner.nextDouble();
        CartaoDeCredito cartao = new CartaoDeCredito(limite);

        int opcao;
        scanner.nextLine();

        do {
            System.out.println("\nDigite a opção desejada:");
            System.out.println("1 - Realizar compra");
            System.out.println("0 - Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Descrição da compra:");
                    String descricao = scanner.nextLine();

                    System.out.println("Valor da compra:");
                    double valor = scanner.nextDouble();
                    scanner.nextLine();

                    Compra compra = new Compra(descricao, valor);

                    if (cartao.realizarCompra(compra)) {
                        System.out.println("Compra realizada!");
                    } else {
                        System.out.printf("Saldo insuficiente! Saldo disponível: R$ %.2f%n",
                                cartao.getSaldoDisponivel());
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        System.out.println("\n***********************");
        System.out.println("COMPRAS REALIZADAS:");
        cartao.exibirCompras();
        System.out.println("\n***********************");

        scanner.close();
    }
}