/*
Crie uma lista de números inteiros e utilize o método Collections.sort para ordená-la
em ordem crescente. Em seguida, imprima a lista ordenada.
 */


package Pratica4_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        List<Integer> numerosInteiros = new ArrayList<>();

        numerosInteiros.add(22);
        numerosInteiros.add(10);
        numerosInteiros.add(33);
        numerosInteiros.add(21);
        numerosInteiros.add(56);
        numerosInteiros.add(2);
        numerosInteiros.add(9);
        numerosInteiros.add(190);

        Collections.sort(numerosInteiros);

        System.out.println("Lista Ordenada" + numerosInteiros);

    }
}
