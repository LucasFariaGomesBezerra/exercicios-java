package br.com.lucasfaria.lista01;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.print("Consumo mensal em kWh: ");
        double consumo = entrada.nextDouble();
        if (consumo < 0) {
            System.out.println("Consumo invalido.");
        } else {
            double preco;
            if (consumo <= 100) {
                preco = 0.50;
            } else if (consumo <= 300) {
                preco = 0.75;
            } else {
                preco = 1.10;
            }
            double conta = consumo * preco;
            System.out.printf("Valor da conta: %.2f%n", conta);
        }
        entrada.close();
    }
}
