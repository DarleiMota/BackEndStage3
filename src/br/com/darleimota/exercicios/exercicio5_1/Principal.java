/*
Exercício 1 — Uso de Map e HashMap (OK)
Objetivo: Criar um sistema simples que armazena o estoque de produtos usando HashMap<String, Integer>, onde a chave é o nome do produto e o valor a quantidade em estoque.
- Implemente métodos para adicionar produtos, atualizar quantidade e exibir todos os produtos.
- Exiba o estoque em ordem alfabética dos produtos usando TreeMap.

*/


package br.com.darleimota.exercicios.exercicio5_1;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Pessoa> pessoas = criarListaDePessoas();

        OrdenadorDePessoas.ordenarPorIdade(pessoas);
        OrdenadorDePessoas.ordenarPorNome(pessoas);
        OrdenadorDePessoas.ordenarPorNomeDesempateIdade(pessoas);
    }

    public static List<Pessoa> criarListaDePessoas() {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Darlei Mota", 39));
        pessoas.add(new Pessoa("Luciano Teixeira", 22));
        pessoas.add(new Pessoa("Rafael Cabral", 45));
        pessoas.add(new Pessoa("Lucca Moreira", 15));
        pessoas.add(new Pessoa("Lucca Moreira", 21));
        pessoas.add(new Pessoa("Jeffeson Soares", 32));
        pessoas.add(new Pessoa("Fernanda Amorin", 54));
        pessoas.add(new Pessoa("Danielle Oliveira", 17));
        pessoas.add(new Pessoa("Julia Rodrigues", 22));
        return pessoas;
    }
}
