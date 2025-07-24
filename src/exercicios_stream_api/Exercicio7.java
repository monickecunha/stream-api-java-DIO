package exercicios_stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Exercicio7 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Com a ajuda da Stream API, encontre o segundo número maior da lista e
        // exiba o resultado no console.
        System.out.println("Desafio 7 - Encontrar o segundo número maior da lista:");
        Optional<Integer> segundoMaior = numeros.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        if (segundoMaior.isPresent()) {
            System.out.println("O segundo maior número na lista é: " + segundoMaior.get());
        } else {
            System.out.println("Não foi possível encontrar o segundo maior número (lista pequena ou vazia).");
        }
    }
}
