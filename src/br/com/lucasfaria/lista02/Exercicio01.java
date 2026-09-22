package br.com.lucasfaria.lista02;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.print("Idade: ");
        int idade = entrada.nextInt();
        if (idade >= 16) {
            System.out.println("Pode votar.");
        }
        if (idade >= 18) {
            System.out.println("Pode dirigir.");
        }
        if (idade >= 60) {
            System.out.println("E idoso.");
        }
        entrada.close();
    }
}
