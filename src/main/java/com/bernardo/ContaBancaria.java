package com.bernardo;

public class ContaBancaria {

    private String titular;
    private double saldo;  
    private String numeroConta;

    public ContaBancaria(String titular, double saldo, String numeroConta) {
        this.titular = titular;
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }
        public void sacar(double valor) {
            if (valor > 0 && valor <= saldo) {
                saldo -= valor;
                System.out.println("Saque de R$" + valor + " realizado com sucesso.");
            } else {
                System.out.println("Valor de saque inválido ou saldo insuficiente.");
            }
        }
    public void exibirSaldo() {
    System.out.println("\n-------------------------------");
    System.out.printf("Saldo atual: R$ %.2f\n", saldo);
    System.out.println("-------------------------------");
    
}

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public String getTitular() {
        return titular;
    }
    
    public String getNumeroConta() {
        return numeroConta;
    }
}
