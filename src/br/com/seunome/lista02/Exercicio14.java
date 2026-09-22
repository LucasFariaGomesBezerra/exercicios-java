package br.com.seunome.lista02;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.print("Numero do mes (1 a 12): ");
        int mes = entrada.nextInt();
        switch (mes) {
            case 4, 6, 9, 11 -> System.out.println("30 dias.");
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("31 dias.");
            case 2 -> System.out.println("28 dias.");
            default -> System.out.println("Mes invalido.");
        }
        entrada.close();
    }
}
