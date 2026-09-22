package br.com.lucasfaria.lista03;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.print("Quantidade de alunos: ");
        int quantidade = entrada.nextInt();
        if (quantidade <= 0) {
            System.out.println("Quantidade de alunos invalida.");
        } else {
            double soma = 0;
            int aprovados = 0;
            int abaixoDeSeis = 0;
            for (int i = 1; i <= quantidade; i++) {
                System.out.print("Nota do aluno " + i + ": ");
                double nota = entrada.nextDouble();
                soma += nota;
                if (nota >= 6) {
                    aprovados++;
                } else {
                    abaixoDeSeis++;
                }
            }
            System.out.printf("Media da turma: %.2f%n", soma / quantidade);
            System.out.println("Notas maiores ou iguais a 6: " + aprovados);
            System.out.println("Notas abaixo de 6: " + abaixoDeSeis);
        }
        entrada.close();
    }
}
