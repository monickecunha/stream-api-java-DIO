package exercicios_stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Exercicios6a10 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Utilize a Stream API para verificar se a lista contém algum número
        // maior que 10 e exiba o resultado no console.
        System.out.println("Desafio 6 - Verificar se a lista contém algum número maior que 10:");

        System.out.println(numeros.stream()
                .anyMatch(n -> n > 10));

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

        // Utilizando a Stream API, realize a soma dos dígitos de todos os números
        // da lista e exiba o resultado no console.
        System.out.println("Desafio 8 - Somar os dígitos de todos os números da lista:");
        int somaTotalDosDigitos = numeros.stream()
                .mapToInt(n -> { // Para cada número 'n' no stream:
                    int somaDigitos = 0;
                    String s = String.valueOf(n); // Converte o número para String
                    for(char c : s.toCharArray()) { // Itera sobre cada caractere (dígito)
                        somaDigitos += Character.getNumericValue(c);
                    }
                    return somaDigitos; // Retorna a soma dos dígitos desse número
                })
                .sum(); // Soma todos os resultados das somas de dígitos
        System.out.println("A soma total dos dígitos é: " + somaTotalDosDigitos);

        // Com a Stream API, verifique se todos os números da lista são distintos (não
        // se repetem) e exiba o resultado no console.
        System.out.println("Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):");
        boolean numerosSemRepetidos = numeros.size() == numeros.stream()
                .distinct().count();
        System.out.println(numerosSemRepetidos);

        // Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de
        // 5 e exiba o resultado no console.
        System.out.println("Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:");

        List<Integer>numerosImparesMultiplosDe3ou5 = numeros.stream()
                .filter(n -> n % 2 == 1 && (n % 3 == 0 || n % 5 == 0)).toList();
        System.out.println(numerosImparesMultiplosDe3ou5);
    }
}
