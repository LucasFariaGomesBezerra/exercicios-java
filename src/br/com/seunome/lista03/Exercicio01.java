package br.com.seunome.lista03;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.print("Numero inteiro N: ");
        int n = entrada.nextInt();
        if (n < 1) {
            System.out.println("Nao ha valores a exibir.");
        } else {
            int numero = 1;
            while (numero <= n) {
                System.out.println(numero);
                numero++;
            }
        }
        entrada.close();
    }
}
