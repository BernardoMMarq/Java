package com.bernardo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Bernardo", 1000.0, "12345");
        Scanner scanner = new Scanner(System.in);
        // opção do menu
        int opcao;
        do{
            mostrarMenu();
            opcao = scanner.nextInt();

             switch (opcao) {
                case 1:
                    conta.exibirSaldo();
                    esperarEnter(scanner);
                    limparTela();
                    break;
                case 2:
                    limparTela();
                    System.out.print("Digite o valor para depositar: ");

                    double deposito = scanner.nextDouble();
                    conta.depositar(deposito);
                    esperarEnter(scanner);
                    limparTela();
                    break;

                case 3:
                    System.out.print("Digite o valor para sacar: ");
                    double saque = scanner.nextDouble();
                    conta.sacar(saque);
                    esperarEnter(scanner);
                    limparTela();
                    break;

                case 4:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 4);

        scanner.close();
    }
    //tela mt massa (mekhorar depois)
        public static void mostrarMenu() {
    System.out.println("|==============================================|");
    System.out.println("|               BANCO BERNARDO                 |");
    System.out.println("|==============================================|");
    System.out.println("|  1  - Ver saldo                              |"); 
    System.out.println("|  2  - Depositar                              |");
    System.out.println("|  3  - Sacar                                  |");
    System.out.println("|  4  - Sair                                   |");
    System.out.println("|==============================================|");
    System.out.println("|             Escolha uma opção:               |");
    System.out.println("|==============================================|");
}
  // Método para esperar o usuário pressionar ENTER
    public static void esperarEnter(Scanner scanner) {
    System.out.println("\nPressione ENTER para continuar...");
    scanner.nextLine();
    scanner.nextLine(); // Espera o ENTER
    }
    public static void limparTela() {
    for(int i = 0; i < 50; i++) {
        System.out.println();
    }
}
}