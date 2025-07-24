package exercicios_stream_api;

import java.util.Arrays;
import java.util.List;

public class Exercicio9 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Com a Stream API, verifique se todos os números da lista são distintos (não
        // se repetem) e exiba o resultado no console.
        System.out.println("Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):");
        boolean numerosSemRepetidos = numeros.size() == numeros.stream()
                .distinct().count();
        System.out.println(numerosSemRepetidos);
    }
}
