package Pratica3_6;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        ArrayList<ContaBancaria> cliente = new ArrayList<>();

        cliente.add(new ContaBancaria("0001", 2000.00));
        cliente.add(new ContaBancaria("0002", 9000.00));
        cliente.add(new ContaBancaria("0003", 22000.00));

        ContaBancaria contaMaiorSaldo = cliente.get(0);

        for (ContaBancaria conta : cliente){
            System.out.println(conta);
            if (conta.getSaldo() > contaMaiorSaldo.getSaldo()){
                contaMaiorSaldo = conta;
            }
        }
        System.out.println("Conta com maior saldo : " + contaMaiorSaldo);

    }
}
