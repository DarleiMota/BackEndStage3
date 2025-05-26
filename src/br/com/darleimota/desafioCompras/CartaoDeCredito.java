package br.com.darleimota.desafioCompras;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CartaoDeCredito {
    private double limite;
    private List<Compra> compras;

    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.compras = new ArrayList<>();
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getSaldoDisponivel() {
        double totalGasto = 0;
        for (Compra compra : compras) {
            totalGasto += compra.getValor();
        }
        return limite - totalGasto;
    }

    public boolean realizarCompra(Compra novaCompra){
        if (novaCompra.getValor() <= getSaldoDisponivel()){
            compras.add(novaCompra);
            return true;
        } else {
            return false;
        }
    }

    public void exibirCompras() {
        Collections.sort(compras);
        System.out.println("COMPRAS REALIZADAS:");

        for (Compra compra : compras) {
            System.out.printf("%s - R$ %.2f%n", compra.getDescricao(), compra.getValor());
        }

        System.out.printf("Saldo disponível: R$ %.2f%n", getSaldoDisponivel());
    }
}
