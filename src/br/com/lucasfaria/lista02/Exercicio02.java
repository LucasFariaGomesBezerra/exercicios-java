package br.com.lucasfaria.lista02;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.print("Numero inteiro: ");
        int numero = entrada.nextInt();
        if (numero > 0) {
            System.out.println("E positivo.");
        }
        if (numero % 2 == 0) {
            System.out.println("E par.");
        }
        if (numero % 5 == 0) {
            System.out.println("E multiplo de 5.");
        }
        long absoluto = Math.abs((long) numero);
        if (absoluto >= 10 && absoluto <= 99) {
            System.out.println("Tem dois digitos.");
        }
        entrada.close();
    }
}
