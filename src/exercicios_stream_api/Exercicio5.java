package exercicios_stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Exercicio5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

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
