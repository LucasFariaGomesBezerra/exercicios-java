package br.com.lucasfaria.lista02;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.print("Usuario: ");
        String usuario = entrada.nextLine();
        System.out.print("Senha: ");
        String senha = entrada.nextLine();
        if (!usuario.equals("admin")) {
            System.out.println("Usuario nao encontrado.");
        } else {
            if (senha.equals("java123")) {
                System.out.println("Acesso liberado.");
            } else {
                System.out.println("Senha incorreta.");
            }
        }
        entrada.close();
    }
}
