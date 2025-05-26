/*
2 - Crie uma classe Titulo com um atributo nome do tipo String. Implemente a interface
Comparable na classe para que seja possível ordenar uma lista de objetos Titulo.

3 - No Exercício 2, crie alguns objetos da classe Titulo e adicione-os a uma lista.
Utilize o método Collections.sort para ordenar a lista e, em seguida, imprima os
títulos ordenados.

4 - Crie uma lista utilizando a interface List e instancie-a tanto como ArrayList
quanto como LinkedList. Adicione elementos e imprima a lista, mostrando que é
possível trocar facilmente a implementação.

5 - Modifique o Exercício 4 para declarar a variável de lista como a interface List,
demonstrando o uso de polimorfismo.
 */

package br.com.darleimota.exercicios.exercicio4_2;

import java.util.*;

public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 3 - ArrayList<Titulo> titulos = new ArrayList<>();
        // 4-  LinkedList<Titulo> titulos = new ArrayList<>();

        List<Titulo> titulos = new LinkedList<>();

        for (int i = 0; i < 3 ; i++) {
            System.out.println("Digite o nome do filme " + (i + 1) + ":");
            String tituloDigitado = scanner.nextLine();
            titulos.add(new Titulo(tituloDigitado));
        }

        System.out.println("Antes da Ordenação");
        for(Titulo mostrar : titulos){
            System.out.println(mostrar);
        }

        // Exercicio 3
        Collections.sort(titulos);

        System.out.println("\nDepois da Ordenação");
        for(Titulo mostrar : titulos){
            System.out.println(mostrar);
        }

        scanner.close();
    }
}
