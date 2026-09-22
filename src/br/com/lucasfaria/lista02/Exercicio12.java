package br.com.lucasfaria.lista02;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.print("Saldo da conta: ");
        double saldo = entrada.nextDouble();
        System.out.print("Limite diario de saque: ");
        double limite = entrada.nextDouble();
        System.out.print("Valor solicitado: ");
        double valor = entrada.nextDouble();
        if (saldo < valor) {
            System.out.println("Saldo insuficiente.");
        } else {
            if (valor > limite) {
                System.out.println("Valor acima do limite diario.");
            } else {
                saldo -= valor;
                System.out.printf("Novo saldo: %.2f%n", saldo);
            }
        }
        entrada.close();
    }
}
