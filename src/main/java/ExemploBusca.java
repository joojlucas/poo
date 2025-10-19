package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExemploBusca {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();             // tamanho
        List<Integer> arr = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        int k = sc.nextInt();             // alvo

        // busca linear
        String resposta = arr.contains(k) ? "YES" : "NO";
        System.out.println(resposta);
        sc.close();
    }
}
