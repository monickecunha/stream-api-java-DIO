package exercicios_stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercicio16MaisDireta {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("Desafio 16 - Agrupe os números em pares e ímpares (com partitioningBy):");

        Map<Boolean, List<Integer>> grupos = numeros.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0)); // True para pares, False para ímpares

        List<Integer> numerosPares = grupos.get(true);
        List<Integer> numerosImpares = grupos.get(false);

        System.out.println("Lista de números pares: " + numerosPares);
        System.out.println("Lista de números ímpares: " + numerosImpares);
    }
}


