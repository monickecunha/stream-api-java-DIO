package exercicios_stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;


public class Exercicios1a5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Crie um programa que utilize a Stream API para ordenar a lista de números em
        // ordem crescente e a exiba no console.
        System.out.println("Desafio 1: Mostre a lista na ordem numerica:");
        numeros.stream()
                .sorted()
                .forEach(System.out::println);

        // Utilizando a Stream API, realize a soma dos números pares da lista e exiba
        // o resultado no console.
        System.out.println("Desafio 2 - Imprima a soma dos números pares da lista:");
        int somaNumerosPares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .reduce(0, Integer::sum);
        System.out.println("A soma dos pares é: " + somaNumerosPares);

        // Com a ajuda da Stream API, verifique se todos os números da lista são
        // positivos e exiba o resultado no console.
        System.out.println("Desafio 3 - Verifique se todos os números da lista são positivos:");
        System.out.println(numeros.stream()
                .allMatch(n -> n > 0));

        // Utilize a Stream API para remover os valores ímpares da lista e imprima
        // a lista resultante no console.
        System.out.println("Desafio 4 - Remova todos os valores ímpares:");
        List<Integer> numerosPares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println("Lista com números pares removidos: " + numerosPares);

        // Com a Stream API, calcule a média dos números maiores que 5 e exiba
        // o resultado no console.
        System.out.println("Calcule a média dos números maiores que 5:");
        OptionalDouble mediaNumerosMaioresQueCinco = numeros.stream()
                .filter(n -> n > 5)
                .mapToInt(Integer::intValue)
                .average();
        if (mediaNumerosMaioresQueCinco.isPresent()){
            System.out.println("A média dos números maiores que 5 é: " + mediaNumerosMaioresQueCinco.getAsDouble());
        } else {
            System.out.println("Não há números maiores que 5 na lista para calcular a média.");
        }

    }

}
