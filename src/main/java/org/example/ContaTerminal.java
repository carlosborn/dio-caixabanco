package org.example;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia, nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da sua agência: ");
        agencia = scanner.next();

        System.out.println("Digite o número da conta: ");
        numero = scanner.nextInt();

        System.out.println("Digite seu nome: ");
        nomeCliente = scanner.next();

        System.out.println("Digite seu saldo: ");
        saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque", nomeCliente, agencia, numero, saldo);
    }
}