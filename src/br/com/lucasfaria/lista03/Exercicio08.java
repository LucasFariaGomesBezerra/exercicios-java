package br.com.lucasfaria.lista03;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        int quantidade = 0;
        long soma = 0;
        int maior = 0;
        int menor = 0;
        System.out.print("Valor inteiro (0 encerra): ");
        int valor = entrada.nextInt();
        while (valor != 0) {
            if (quantidade == 0) {
                maior = valor;
                menor = valor;
            } else {
                if (valor > maior) {
                    maior = valor;
                }
                if (valor < menor) {
                    menor = valor;
                }
            }
            soma += valor;
            quantidade++;
            System.out.print("Valor inteiro (0 encerra): ");
            valor = entrada.nextInt();
        }
        if (quantidade == 0) {
            System.out.println("Nenhum valor foi lido.");
        } else {
            System.out.println("Quantidade: " + quantidade);
            System.out.println("Soma: " + soma);
            System.out.println("Maior: " + maior);
            System.out.println("Menor: " + menor);
        }
        entrada.close();
    }
}
