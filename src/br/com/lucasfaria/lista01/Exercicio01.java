package br.com.lucasfaria.lista01;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = entrada.nextLine();
        System.out.print("Idade: ");
        int idade = entrada.nextInt();
        System.out.print("Altura em metros: ");
        double altura = entrada.nextDouble();
        System.out.printf("Nome: %s, idade: %d anos, altura: %.2f m.%n", nome, idade, altura);
        entrada.close();
    }
}
