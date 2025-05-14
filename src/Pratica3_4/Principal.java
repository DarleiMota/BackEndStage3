/*
Crie uma classe Produto com propriedades como nome e preço. Em seguida, crie uma
lista de produtos e utilize um loop para calcular e imprimir o preço médio dos produtos.
 */

package Pratica3_4;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        Produto produto1 = new Produto("Fone de Ouvido", 15.50);
        Produto produto2 = new Produto("Caixa de som", 21.99);
        Produto produto3 = new Produto("Cabo tipo C ", 15.50);

        ArrayList<Produto> eletronicos = new ArrayList<>();

        eletronicos.add(produto1);
        eletronicos.add(produto2);
        eletronicos.add(produto3);

        double soma = 0;

        for (Produto loja1 : eletronicos) {
            System.out.println(loja1);
            soma += loja1.getPreco();
        }

        double media = soma / eletronicos.size();
        System.out.printf("Preço médio: R$ %.2f\n", media);
    }
}
