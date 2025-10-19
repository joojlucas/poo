package main.java;

public class ExemploFuncoes {
    // soma dois números e devolve o resultado
    static int soma(int a, int b) {
        return a + b;
    }

    // checa se é primo (simples)
    static boolean ehPrimo(int x) {
        if (x < 2) return false;
        for (int d = 2; d * d <= x; d++) {
            if (x % d == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(soma(5, 15));        // 5
        System.out.println(ehPrimo(19));       // true
        System.out.println(ehPrimo(13));      // false
    }
}
