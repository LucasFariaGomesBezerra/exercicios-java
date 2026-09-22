package br.com.lucasfaria.lista01;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.print("Valor em reais: ");
        double reais = entrada.nextDouble();
        System.out.print("Cotacao do dolar em reais: ");
        double cotacao = entrada.nextDouble();
        if (cotacao <= 0) {
            System.out.println("Cotacao invalida.");
        } else {
            System.out.printf("Valor em dolares: %.2f%n", reais / cotacao);
        }
        entrada.close();
    }
}
