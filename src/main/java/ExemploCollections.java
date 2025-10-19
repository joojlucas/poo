package main.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ExemploCollections {
    public static void main(String[] args) {
        // List: ordenada, aceita repetição
        List<Integer> lista = Arrays.asList(3, 1, 2, 3, 2, 1);
        System.out.println("List: " + lista);

        // Set: sem repetição
        Set<Integer> conjunto = new HashSet<>(lista);
        System.out.println("Set (sem repetição): " + conjunto);

        // Map: chave -> valor (contar frequências)
        Map<Integer, Integer> freq = new HashMap<>();
        for (int x : lista) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }
        System.out.println("Frequencias: " + freq); // {1=2, 2=2, 3=2}
    }
}
