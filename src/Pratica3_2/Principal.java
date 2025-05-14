/*
2 Crie uma classe Animal e uma classe Cachorro que herda de Animal. Em seguida, crie
um objeto da classe Cachorro e faça o casting para a classe Animal.
Modifique o Exercício 2 para incluir uma verificação usando instanceof para garantir
que o objeto seja do tipo correto antes de fazer o casting.
 */

package Pratica3_2;

public class Principal {

    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Toto");

        if (cachorro instanceof Animal) {
            Animal urso = (Animal) cachorro;
            System.out.println("Casting feito com sucesso");
            urso.fazerSom();
        } else {
            System.out.println("Não é possivel fazer o casting");
        }
    }
}
