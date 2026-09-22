package br.com.lucasfaria.lista03;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        double nota;
        do {
            System.out.print("Nota de 0 a 10: ");
            nota = entrada.nextDouble();
            if (nota < 0 || nota > 10) {
                System.out.println("Valor invalido. Tente novamente.");
            }
        } while (nota < 0 || nota > 10);
        System.out.printf("Nota aceita: %.2f%n", nota);
        entrada.close();
    }
}
