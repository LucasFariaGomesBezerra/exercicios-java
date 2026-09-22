package br.com.lucasfaria.lista02;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.print("Primeiro numero inteiro: ");
        int primeiro = entrada.nextInt();
        System.out.print("Segundo numero inteiro: ");
        int segundo = entrada.nextInt();
        if (segundo == 0) {
            System.out.println("Nao e possivel verificar com divisor zero.");
        } else {
            if (primeiro % segundo == 0) {
                System.out.println("O primeiro e multiplo do segundo.");
            } else {
                System.out.println("O primeiro nao e multiplo do segundo.");
            }
        }
        entrada.close();
    }
}
