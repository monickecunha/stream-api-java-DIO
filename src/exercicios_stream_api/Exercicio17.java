package exercicios_stream_api;

import java.util.Arrays;
import java.util.List;

public class Exercicio17 {
    // Método auxiliar
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

        // Com a ajuda da Stream API, filtre os números primos da lista e
        // exiba o resultado no console.
        System.out.println("Desafio 17 - Filtrar os números primos da lista:");

        List<Integer> numerosPrimos = numeros.stream()
                .filter(n -> isPrimo(n))
                .toList();
        System.out.println(numerosPrimos);
    }
}
