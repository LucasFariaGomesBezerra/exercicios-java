package br.com.seunome.lista01;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.print("Base do retangulo: ");
        double base = entrada.nextDouble();
        System.out.print("Altura do retangulo: ");
        double altura = entrada.nextDouble();
        double area = base * altura;
        double perimetro = 2 * (base + altura);
        double diagonal = Math.sqrt(base * base + altura * altura);
        System.out.printf("Area: %.2f%n", area);
        System.out.printf("Perimetro: %.2f%n", perimetro);
        System.out.printf("Diagonal: %.2f%n", diagonal);
        entrada.close();
    }
}
