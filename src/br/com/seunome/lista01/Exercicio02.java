package br.com.seunome.lista01;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.print("Primeiro numero inteiro: ");
        int primeiro = entrada.nextInt();
        System.out.print("Segundo numero inteiro: ");
        int segundo = entrada.nextInt();
        System.out.println("Soma: " + (primeiro + segundo));
        System.out.println("Subtracao: " + (primeiro - segundo));
        System.out.println("Produto: " + (primeiro * segundo));
        if (segundo == 0) {
            System.out.println("Divisao inteira e resto nao existem com divisor zero.");
        } else {
            System.out.println("Divisao inteira: " + (primeiro / segundo));
            System.out.println("Resto: " + (primeiro % segundo));
        }
        entrada.close();
    }
}
