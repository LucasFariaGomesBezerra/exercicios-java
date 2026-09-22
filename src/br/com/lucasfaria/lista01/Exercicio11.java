package br.com.lucasfaria.lista01;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.print("Primeiro numero: ");
        int a = entrada.nextInt();
        System.out.print("Segundo numero: ");
        int b = entrada.nextInt();
        System.out.print("Terceiro numero: ");
        int c = entrada.nextInt();
        int maior = a;
        if (b > maior) {
            maior = b;
        }
        if (c > maior) {
            maior = c;
        }
        System.out.println("Maior numero: " + maior);
        entrada.close();
    }
}
