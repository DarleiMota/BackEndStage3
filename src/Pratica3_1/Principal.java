/*
Crie um ArrayList de strings e utilize um loop foreach
para percorrer e imprimir cada elemento da lista.
 */

package Pratica3_1;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        ArrayList<CadastroPessoal> nomePessoa = new ArrayList<>();
        CadastroPessoal cadastro1 = new CadastroPessoal("Darlei", "20.11.2010","Minas Gerais");
        CadastroPessoal cadastro2 = new CadastroPessoal("Julia", "09.07.1992","Sap Paulo");
        CadastroPessoal cadastro3 = new CadastroPessoal("Mariana", "02.11.2001","Brasilia");

        nomePessoa.add(cadastro1);
        nomePessoa.add(cadastro2);
        nomePessoa.add(cadastro3);

        for ( CadastroPessoal pessoa : nomePessoa){
            System.out.println(pessoa);
        }
    }
}
