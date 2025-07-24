package exercicios_stream_api;

import java.util.Arrays;
import java.util.List;

public class Exercicio12 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Com a ajuda da Stream API, encontre o produto de todos os números da lista
        // e exiba o resultado no console.
        System.out.println("Desafio 12 - Encontre o produto de todos os números da lista:");
        int produtoNumeros = numeros.stream()
                .reduce(1, (a, b) -> a * b);
        System.out.println(produtoNumeros);
    }
}
