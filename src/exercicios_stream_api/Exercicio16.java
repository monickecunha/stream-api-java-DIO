package exercicios_stream_api;

import java.util.Arrays;
import java.util.List;

public class Exercicio16 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Utilize a Stream API para agrupar os números em duas listas separadas,
        // uma contendo os números pares e outra contendo os números ímpares da
        // lista original, e exiba os resultados no console.
        System.out.println("Desafio 16 - Agrupe os números em pares e ímpares:");
        List<Integer> numerosPares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        List<Integer> numerosImpares = numeros.stream()
                .filter(n -> n % 2 == 1)
                .toList();
        System.out.println("Lista de números pares: " + numerosPares);
        System.out.println("Lista de números ímpares: " + numerosImpares);
    }
}
