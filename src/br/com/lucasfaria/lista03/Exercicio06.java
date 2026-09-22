package br.com.lucasfaria.lista03;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.print("Numero inteiro nao negativo: ");
        int numero = entrada.nextInt();
        if (numero < 0) {
            System.out.println("Entrada invalida.");
        } else {
            // BigInteger evita erro em fatoriais grandes.
            java.math.BigInteger fatorial = java.math.BigInteger.ONE;
            for (int i = 1; i <= numero; i++) {
                fatorial = fatorial.multiply(java.math.BigInteger.valueOf(i));
            }
            System.out.println("Fatorial: " + fatorial);
        }
        entrada.close();
    }
}
