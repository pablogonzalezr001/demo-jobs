package com.demo_jobs.util;

public class FirstChar {
    /*
    Encuentra el primer carácter no repetido en un string.
     */
    public static void main(String[] args) {
        String str = "abaccdeff";
        char result = firstNonRepeatedCharacter(str);
        System.out.println(result); // Output: 'b'
    }

    private static char firstNonRepeatedCharacter(String str) {
        int[] charCount = new int[256]; // Asumiendo ASCII

        // Contar la frecuencia de cada carácter
        for (char c : str.toCharArray()) {
            charCount[c]++;
        }

        // Encontrar el primer carácter no repetido
        for (char c : str.toCharArray()) {
            if (charCount[c] == 1) {
                return c;
            }
        }

        return '\0'; // Retorna null char si no hay caracteres no repetidos
    }
}
