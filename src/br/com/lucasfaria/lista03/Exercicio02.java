package br.com.lucasfaria.lista03;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.print("Numero inteiro: ");
        int numero = entrada.nextInt();
        int multiplicador = 1;
        while (multiplicador <= 10) {
            System.out.println(numero + " x " + multiplicador + " = " + (numero * multiplicador));
            multiplicador++;
        }
        entrada.close();
    }
}
