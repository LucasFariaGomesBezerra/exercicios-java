package br.com.seunome.lista03;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.print("Numero N de 1 a 9: ");
        int n = entrada.nextInt();
        if (n < 1 || n > 9) {
            System.out.println("Entrada invalida.");
        } else {
            for (int tabuada = 1; tabuada <= n; tabuada++) {
                for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
                    System.out.println(tabuada + " x " + multiplicador + " = " + (tabuada * multiplicador));
                }
                if (tabuada < n) {
                    System.out.println();
                }
            }
        }
        entrada.close();
    }
}
