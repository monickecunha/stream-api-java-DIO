package exercicios_stream_api;

import java.util.Arrays;
import java.util.List;

public class Exercicio1 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Crie um programa que utilize a Stream API para ordenar a lista de números em
        // ordem crescente e a exiba no console.
        System.out.println("Desafio 1: Mostre a lista na ordem numerica:");
        numeros.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
