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

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }
}