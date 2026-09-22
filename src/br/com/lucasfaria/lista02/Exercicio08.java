package br.com.lucasfaria.lista02;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.print("Velocidade maxima da via: ");
        double limite = entrada.nextDouble();
        System.out.print("Velocidade do veiculo: ");
        double velocidade = entrada.nextDouble();
        if (limite <= 0 || velocidade < 0) {
            System.out.println("Velocidade invalida.");
        } else if (velocidade <= limite) {
            System.out.println("Sem multa.");
        } else if (velocidade <= limite * 1.20) {
            System.out.println("Infracao media.");
        } else if (velocidade <= limite * 1.50) {
            System.out.println("Infracao grave.");
        } else {
            System.out.println("Infracao gravissima.");
        }
        entrada.close();
    }
}
