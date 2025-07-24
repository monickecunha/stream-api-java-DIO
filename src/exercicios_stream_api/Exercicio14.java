package exercicios_stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Exercicio14 {
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

        // Com a Stream API, encontre o maior número primo da lista e exiba o resultado
        // no console.
        System.out.println("Desafio 14 - Encontre o maior número primo da lista:");
        Optional<Integer> maiorPrimo = numeros.stream()
                .filter(Exercicio14::isPrimo)
                .sorted(Comparator.reverseOrder())
                .findFirst();
        if(maiorPrimo.isPresent()){
            System.out.println("Maior número primo: " + maiorPrimo.get());
        } else {
            System.out.println("Lista não possui número primo.");
        }
    }
}
