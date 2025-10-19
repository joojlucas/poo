package main.java;

import java.io.*;
import java.util.*;

// Use esta estrutura quando o HackerRank pedir para implementar funções em 'Result'
class Result {
    // exemplo: retorna "YES" se k estiver na lista
    public static String findNumber(List<Integer> arr, int k) {
        for (int x : arr) if (x == k) return "YES";
        return "NO";
    }
}

public class TemplateHackerRank {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());

        List<Integer> arr = new ArrayList<>(n);
        for (int i = 0; i < n; i++) arr.add(Integer.parseInt(br.readLine().trim()));

        int k = Integer.parseInt(br.readLine().trim());

        String ans = Result.findNumber(arr, k);
        System.out.println(ans);
    }
}
