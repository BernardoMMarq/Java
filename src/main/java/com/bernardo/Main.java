package com.bernardo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria("Bernardo", 1000.0, "12345");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor que deseja depositar: ");
        double valor = scanner.nextDouble();

        conta.depositar(valor);

        scanner.close();
    }
}