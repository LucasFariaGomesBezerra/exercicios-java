package br.com.lucasfaria.lista03;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        double total = 0;
        int quantidadeItens = 0;
        System.out.print("Codigo do produto (0 encerra): ");
        int codigo = entrada.nextInt();
        while (codigo != 0) {
            System.out.print("Preco unitario: ");
            double preco = entrada.nextDouble();
            System.out.print("Quantidade: ");
            int quantidade = entrada.nextInt();
            total += preco * quantidade;
            quantidadeItens += quantidade;
            System.out.print("Codigo do produto (0 encerra): ");
            codigo = entrada.nextInt();
        }
        System.out.print("Pagamento (1 dinheiro, 2 debito, 3 credito): ");
        int pagamento = entrada.nextInt();
        switch (pagamento) {
            case 1:
                total = total * 0.95;
                break;
            case 2:
                System.out.println("Pagamento no debito.");
                break;
            case 3:
                total = total * 1.03;
                break;
            default:
                System.out.println("Forma de pagamento invalida. Total sem alteracao.");
        }
        if (total > 300) {
            System.out.println("Aviso: compra grande.");
        }
        if (quantidadeItens > 20) {
            System.out.println("Aviso: muitos itens.");
        }
        System.out.println("Quantidade de itens: " + quantidadeItens);
        System.out.printf("Total final: %.2f%n", total);
        entrada.close();
    }
}
