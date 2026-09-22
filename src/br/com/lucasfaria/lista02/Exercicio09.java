package br.com.lucasfaria.lista02;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.print("Salario: ");
        double salario = entrada.nextDouble();
        System.out.print("Tempo de casa em anos: ");
        double anos = entrada.nextDouble();
        double percentual;
        if (anos < 1) {
            percentual = 0;
        } else if (anos <= 3) {
            percentual = 0.05;
        } else if (anos <= 10) {
            percentual = 0.10;
        } else {
            percentual = 0.15;
        }
        System.out.printf("Percentual do bonus: %.0f%%%n", percentual * 100);
        System.out.printf("Valor do bonus: %.2f%n", salario * percentual);
        entrada.close();
    }
}
