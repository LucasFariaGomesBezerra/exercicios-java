package br.com.seunome.lista01;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.print("Raio do circulo: ");
        double raio = entrada.nextDouble();
        double area = Math.PI * raio * raio;
        double perimetro = 2 * Math.PI * raio;
        System.out.printf("Area: %.2f%n", area);
        System.out.printf("Perimetro: %.2f%n", perimetro);
        entrada.close();
    }
}
