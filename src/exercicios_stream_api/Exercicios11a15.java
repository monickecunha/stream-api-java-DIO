package exercicios_stream_api;

import java.util.Comparator;
import java.util.List;
import java.util.Arrays;
import java.util.Optional;

public class Exercicios11a15 {
    // Método auxiliar para exercício 14
    private static boolean isPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        if (numero == 2) {
            return true;
        }
        if (numero % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= numero; i += 2) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Utilizando a Stream API, encontre a soma dos quadrados de todos os números da
        // lista e exiba o resultado no console.
        System.out.println("Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:");

        int somaDosQuadrados = numeros.stream()
                .mapToInt(n -> n * n)
                .sum();
        System.out.println("A soma dos quadrados dos números é: " + somaDosQuadrados);

        // Com a ajuda da Stream API, encontre o produto de todos os números da lista
        // e exiba o resultado no console.
        System.out.println("Desafio 12 - Encontre o produto de todos os números da lista:");
        int produtoNumeros = numeros.stream()
                .reduce(1, (a, b) -> a * b);
        System.out.println(produtoNumeros);

        // Utilize a Stream API para filtrar os números que estão dentro de um intervalo
        // específico (por exemplo, entre 5 e 10) e exiba o resultado no console.
        System.out.println("Desafio 13 - Filtrar os números que estão dentro de um intervalo:");
        System.out.println(numeros.stream()
                .filter(n -> n > 5 && n < 10)
                .toList());

        // Com a Stream API, encontre o maior número primo da lista e exiba o resultado
        // no console.
        System.out.println("Desafio 14 - Encontre o maior número primo da lista:");
        Optional<Integer> maiorPrimo = numeros.stream()
                .filter(Exercicios11a15::isPrimo)
                .sorted(Comparator.reverseOrder())
                .findFirst();
        if(maiorPrimo.isPresent()){
            System.out.println("Maior número primo: " + maiorPrimo.get());
        } else {
            System.out.println("Lista não possui número primo.");
        }

        // Utilizando a Stream API, verifique se a lista contém pelo menos um número
        // negativo e exiba o resultado no console.
        System.out.println("Desafio 15 - Verifique se a lista contém pelo menos um número negativo:");
        boolean possuiNegativo = numeros.stream()
                .anyMatch(n -> n < 0);
        System.out.println(possuiNegativo);
    }
}
