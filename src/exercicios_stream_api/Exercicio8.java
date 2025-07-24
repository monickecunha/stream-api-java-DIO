package exercicios_stream_api;

import java.util.Arrays;
import java.util.List;

public class Exercicio8 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

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
    }
}
