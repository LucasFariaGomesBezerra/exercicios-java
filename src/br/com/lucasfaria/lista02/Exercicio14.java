package br.com.lucasfaria.lista02;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.print("Numero do mes (1 a 12): ");
        int mes = entrada.nextInt();
        switch (mes) {
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 dias.");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 dias.");
                break;
            case 2:
                System.out.println("28 dias.");
                break;
            default:
                System.out.println("Mes invalido.");
        }
        entrada.close();
    }
}
