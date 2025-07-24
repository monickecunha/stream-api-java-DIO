package exercicios_stream_api;

import java.util.Arrays;
import java.util.List;

public class Exercicio3 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Com a ajuda da Stream API, verifique se todos os números da lista são
        // positivos e exiba o resultado no console.
        System.out.println("Desafio 3 - Verifique se todos os números da lista são positivos:");
        System.out.println(numeros.stream()
                .allMatch(n -> n > 0));
    }
}
