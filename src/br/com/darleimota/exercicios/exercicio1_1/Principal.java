package br.com.darleimota.exercicios.exercicio1_1;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        ArrayList<Pessoa> listaDePessoa = new ArrayList<>();

        Pessoa pessoa1 = new Pessoa("Darlei", 39);
        Pessoa pessoa2 = new Pessoa("Julia", 14);
        Pessoa pessoa3 = new Pessoa("Mariana", 37);

        listaDePessoa.add(pessoa1);
        listaDePessoa.add(pessoa2);
        listaDePessoa.add(pessoa3);

        System.out.println("Tamanho da lista de pessoa: " + listaDePessoa.size());
        System.out.println("A primeira pessoa da lista: " + listaDePessoa.get(0));
        System.out.println(" ");

        System.out.println("Lista com For tradicional");
        for (int i = 0; i < listaDePessoa.size(); i++) {
            System.out.println(listaDePessoa.get(i));
        }
        System.out.println(" ");

        System.out.println("Nova lista com forech");
        for (Pessoa lista1 : listaDePessoa) {
            System.out.println(lista1);
        }

        System.out.println(" ");
        System.out.println("Lista com maior de idade");
        for (Pessoa lista2 : listaDePessoa) {
            if (lista2.maiorDeIdade()) {
                System.out.println("É maior de idade: " + lista2);
            }
        }

        System.out.println(" ");
        System.out.println("Removendo item da lista, menor de idade");
        for (Pessoa lista3 : listaDePessoa) {
            if (lista3.maiorDeIdade() == false) {
                System.out.println("Menor de idade é :" + lista3);
            }
        }
        listaDePessoa.removeIf(lista3 -> !lista3.maiorDeIdade());
        System.out.println(" ");

        for (Pessoa lista3 : listaDePessoa) {
            System.out.println("Lista atualizada: " + lista3);
        }
    }
}
