package br.com.seunome.lista02;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.print("Tipo de veiculo (1 carro, 2 moto): ");
        int tipo = entrada.nextInt();
        double tarifa;
        switch (tipo) {
            case 1 -> tarifa = 8.00;
            case 2 -> tarifa = 5.00;
            default -> {
                System.out.println("Opcao invalida.");
                entrada.close();
                return;
            }
        }
        System.out.print("Quantidade de horas: ");
        int horas = entrada.nextInt();
        double valor = tarifa * horas;
        System.out.print("Tem cupom? (sim/nao): ");
        String cupom = entrada.next();
        if (cupom.equalsIgnoreCase("sim")) {
            if (valor >= 50) {
                valor *= 0.80;
                System.out.println("Desconto de 20% aplicado.");
            } else {
                System.out.println("O cupom vale apenas para valores de 50,00 ou mais.");
            }
        }
        if (horas > 12) {
            System.out.println("Aviso: permanencia longa.");
        }
        if (horas > 24) {
            System.out.println("Aviso: cobranca de diaria.");
        }
        if (horas <= 2) {
            System.out.println("Permanencia curta.");
        } else if (horas <= 6) {
            System.out.println("Permanencia media.");
        } else {
            System.out.println("Permanencia longa.");
        }
        System.out.printf("Valor final: %.2f%n", valor);
        entrada.close();
    }
}
