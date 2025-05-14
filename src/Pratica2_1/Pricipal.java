package Pratica2_1;

import java.util.ArrayList;

public class Pricipal {
    public static void main(String[] args) {

        ArrayList<Produto> meusProdutos = new ArrayList<>();
        Produto produto1 = new Produto("Maça", 6.60, 8);
        Produto produto2 = new Produto("Laranja", 4.99, 15);
        Produto produto3 = new Produto("Pera", 7.99, 12);

        meusProdutos.add(produto1);
        meusProdutos.add(produto2);
        meusProdutos.add(produto3);

        System.out.println("O tamanho da lista é: " + meusProdutos.size());
        System.out.println("Um dos itens da lista: " + meusProdutos.get(1));
        System.out.println(" ");

        System.out.println("Lista de produtos: ");
        for (Produto iten : meusProdutos) {
            System.out.println(iten);
        }
        System.out.println(" ");

        // Nova lista com vencimento
        Produto produto4 = new ProdutoPerecivel("Abacate", 12.99, 2, "12/2025");
        Produto produto5 = new ProdutoPerecivel("Abobora", 21.50, 1, "09/2025");
        Produto produto6 = new ProdutoPerecivel("Acerola", 2.99, 32, "07/2025");

        // Pode ser feito diretamente tmb
        // meusProdutos.add( new ProdutoPerecivel("Acerola", 2.99,32,"07/2025")
        meusProdutos.add(produto4);
        meusProdutos.add(produto5);
        meusProdutos.add(produto6);

        // Imprimindo tudo atravaes do toString da subclasse
        System.out.println("Lista de produtos completa: ");
        for (Produto lista : meusProdutos) {
            System.out.println(lista);
        }
        System.out.println(" ");
        // Buscando e validando o item como da subclasse para alterar.
        for (Produto item : meusProdutos) {
            if (item instanceof ProdutoPerecivel && ((ProdutoPerecivel) item).getNome().equals("Acerola")) {
            //if (item instanceof ProdutoPerecivel && item.toString().contains("Acerola")) {
                ProdutoPerecivel perecivel = (ProdutoPerecivel) item;
                perecivel.setDataValidade("02/2026");
            }
        }
        System.out.println(produto6);
        System.out.println(" ");

        // Mudando de forma mais direta sem instanceof, quando sabe a posição, evitar usar assim
        ProdutoPerecivel acerola = (ProdutoPerecivel) meusProdutos.get(5);
        acerola.setDataValidade("04/2027");
        System.out.println("Nova data de validade: "+ acerola);

    }
}
