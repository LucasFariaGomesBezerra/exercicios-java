package br.com.seunome.lista02;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.print("Hora do dia (0 a 23): ");
        int hora = entrada.nextInt();
        if (hora < 0 || hora > 23) {
            System.out.println("Hora invalida.");
        } else if (hora <= 11) {
            System.out.println("Bom dia.");
        } else if (hora <= 17) {
            System.out.println("Boa tarde.");
        } else {
            System.out.println("Boa noite.");
        }
        entrada.close();
    }
}
