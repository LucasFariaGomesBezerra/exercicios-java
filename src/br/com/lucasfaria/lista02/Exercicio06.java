package br.com.lucasfaria.lista02;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.print("Valor da compra: ");
        double compra = entrada.nextDouble();
        double frete;
        if (compra >= 199) {
            frete = 0;
        } else {
            frete = 24.90;
        }
        System.out.printf("Frete: %.2f%n", frete);
        System.out.printf("Total a pagar: %.2f%n", compra + frete);
        entrada.close();
    }
}
