package main.java;

import java.util.Scanner;

public class ExemploInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // lê um inteiro
        int n = sc.nextInt();

        // lê uma palavra (sem espaços)
        String s = sc.next();

        // consome a quebra de linha pendente
        sc.nextLine();

        // lê uma linha inteira
        String linha = sc.nextLine();

        System.out.println("n = " + n);
        System.out.println("s = " + s);
        System.out.println("linha = " + linha);

        sc.close();
    }
}
