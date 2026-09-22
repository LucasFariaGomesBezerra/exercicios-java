package br.com.seunome.lista03;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("1 - Dobro");
            System.out.println("2 - Metade");
            System.out.println("3 - Quadrado");
            System.out.println("0 - Sair");
            System.out.print("Opcao: ");
            opcao = entrada.nextInt();
            double numero = 0;
            if (opcao >= 1 && opcao <= 3) {
                System.out.print("Numero: ");
                numero = entrada.nextDouble();
            }
            switch (opcao) {
                case 1 -> System.out.println("Dobro: " + (numero * 2));
                case 2 -> System.out.println("Metade: " + (numero / 2));
                case 3 -> System.out.println("Quadrado: " + (numero * numero));
                case 0 -> System.out.println("Encerrando.");
                default -> System.out.println("Opcao invalida.");
            }
        } while (opcao != 0);
        entrada.close();
    }
}
