package br.com.seunome.lista01;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.print("Media final: ");
        double media = entrada.nextDouble();
        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 5) {
            System.out.println("Recuperacao");
        } else {
            System.out.println("Reprovado");
        }
        entrada.close();
    }
}
