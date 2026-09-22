package br.com.seunome.lista02;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ano: ");
        int ano = entrada.nextInt();
        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
            System.out.println("Ano bissexto.");
        } else {
            System.out.println("Ano nao bissexto.");
        }
        entrada.close();
    }
}
