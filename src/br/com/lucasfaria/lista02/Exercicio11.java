package br.com.lucasfaria.lista02;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.print("Frequencia (%): ");
        double frequencia = entrada.nextDouble();
        System.out.print("Media final: ");
        double media = entrada.nextDouble();
        if (frequencia < 75) {
            System.out.println("Reprovado por falta.");
        } else {
            if (media >= 7) {
                System.out.println("Aprovado.");
            } else if (media >= 5) {
                System.out.println("Recuperacao.");
            } else {
                System.out.println("Reprovado por nota.");
            }
        }
        entrada.close();
    }
}
