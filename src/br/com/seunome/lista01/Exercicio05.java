package br.com.seunome.lista01;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.print("Valor da hora trabalhada: ");
        double valorHora = entrada.nextDouble();
        System.out.print("Horas trabalhadas no mes: ");
        double horas = entrada.nextDouble();
        double bruto = valorHora * horas;
        double inss = bruto * 0.08;
        double liquido = bruto - inss;
        System.out.printf("Salario bruto: %.2f%n", bruto);
        System.out.printf("Desconto de INSS: %.2f%n", inss);
        System.out.printf("Salario liquido: %.2f%n", liquido);
        entrada.close();
    }
}
