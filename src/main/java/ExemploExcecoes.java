package main.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploExcecoes {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a / b); // pode lançar ArithmeticException se b = 0
        } catch (ArithmeticException e) {
            System.out.println("Divisão por zero não é permitida.");
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida (esperado um inteiro).");
        } finally {
            sc.close(); // sempre executa
        }
    }
}
