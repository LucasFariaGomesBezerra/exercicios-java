package br.com.lucasfaria.lista02;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.print("Temperatura em Celsius: ");
        double temperatura = entrada.nextDouble();
        System.out.print("Umidade relativa (%): ");
        double umidade = entrada.nextDouble();
        if (temperatura >= 38) {
            System.out.println("Alerta de calor extremo.");
        }
        if (umidade < 30) {
            System.out.println("Alerta de umidade baixa.");
        }
        if (temperatura >= 35 && umidade < 20) {
            System.out.println("Alerta de risco de queimada.");
        }
        entrada.close();
    }
}
