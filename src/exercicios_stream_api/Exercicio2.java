package exercicios_stream_api;

import java.util.Arrays;
import java.util.List;

public class Exercicio2 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        // Utilizando a Stream API, realize a soma dos números pares da lista e exiba
        // o resultado no console.
        System.out.println("Desafio 2 - Imprima a soma dos números pares da lista:");
        int somaNumerosPares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .reduce(0, Integer::sum);
        System.out.println("A soma dos pares é: " + somaNumerosPares);
    }
}
