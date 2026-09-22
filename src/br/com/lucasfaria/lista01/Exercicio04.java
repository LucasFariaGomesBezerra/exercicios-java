package br.com.lucasfaria.lista01;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        double soma = 0;
        for (int i = 1; i <= 4; i++) {
            System.out.print("Nota " + i + ": ");
            soma += entrada.nextDouble();
        }
        System.out.printf("Media: %.2f%n", soma / 4);
        entrada.close();
    }
}
