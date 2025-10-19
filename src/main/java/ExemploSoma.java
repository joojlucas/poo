package main.java;

import java.util.Scanner;
    public class ExemploSoma {
            public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();   // quantos números virão
            long soma = 0;          // use long para evitar overflow

            for (int i = 0; i < n; i++) {
                soma += sc.nextLong();
            }
            System.out.println(soma);
            sc.close();
        }
    
}
