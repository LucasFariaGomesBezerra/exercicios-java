package br.com.lucasfaria.lista02;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.print("Primeiro numero: ");
        double primeiro = entrada.nextDouble();
        System.out.print("Segundo numero: ");
        double segundo = entrada.nextDouble();
        System.out.print("Operacao (1 soma, 2 subtracao, 3 multiplicacao, 4 divisao): ");
        int opcao = entrada.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Resultado: " + (primeiro + segundo));
                break;
            case 2:
                System.out.println("Resultado: " + (primeiro - segundo));
                break;
            case 3:
                System.out.println("Resultado: " + (primeiro * segundo));
                break;
            case 4:
                if (segundo == 0) {
                    System.out.println("Nao e possivel dividir por zero.");
                } else {
                    System.out.println("Resultado: " + (primeiro / segundo));
                }
                break;
            default:
                System.out.println("Opcao invalida.");
        }
        entrada.close();
    }
}
