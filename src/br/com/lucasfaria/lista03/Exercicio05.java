package br.com.lucasfaria.lista03;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.print("Inicio do intervalo (A): ");
        int a = entrada.nextInt();
        System.out.print("Fim do intervalo (B): ");
        int b = entrada.nextInt();
        if (a > b) {
            System.out.println("Intervalo invalido.");
        } else {
            long soma = 0;
            for (long numero = a; numero <= b; numero++) {
                if (numero % 2 == 0) {
                    soma += numero;
                }
            }
            System.out.println("Soma dos numeros pares: " + soma);
        }
        entrada.close();
    }
}
