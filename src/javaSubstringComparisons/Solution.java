package javaSubstringComparisons;

import java.util.Scanner;

/**
 * Definimos los siguientes términos: El orden lexicográfico, también conocido
 * como orden alfabético o de diccionario, ordena los caracteres de la siguiente
 * manera: A <B <... <Y <Z <a <b ... <y <z Por ejemplo, pelota <gato, perro
 * <dormitorio, feliz <feliz, zoológico <pelota. Una subcadena de una cadena es
 * un bloque contiguo de caracteres en la cadena. Por ejemplo, las subcadenas de
 * abc son a, b, c, ab, bc y abc. Dada una cadena, s, y un número entero, k,
 * complete la función de modo que encuentre las subcadenas lexicográficamente
 * más pequeñas y más grandes de longitud k. Formato de entrada La primera línea
 * contiene una cadena que denota s. La segunda línea contiene un número entero
 * que denota k. Restricciones 1 <| s | <1000 s consta únicamente de letras
 * alfabéticas en inglés (es decir, [a-zA-Z]). Formato de salida Devuelve las
 * respectivas subcadenas lexicográficamente más pequeñas y más grandes como una
 * sola cadena separada por una nueva línea. Entrada de muestra 0 bienvenido a
 * java 3 Salida de muestra 0 ava bien Explicación 0 String s = "welcometojava"
 * tiene las siguientes subcadenas ordenadas lexicográficamente de longitud k =
 * 3: ["ava", "com", "elce", "eto", "jav", "lco", "met", "oja", "ome", "toj",
 * "wel"] Luego, devolvemos la primera subcadena (lexicográficamente más
 * pequeña) y la última subcadena (lexicográficamente más grande) como dos
 * valores separados por líneas nuevas (es decir, ava \ nwel).
 *
 * El código auxiliar en el editor imprime ava como nuestra primera línea de
 * salida y también como nuestra segunda línea de salida. @author richie
 */
public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String current_substring = s.substring(0, k);
        String smallest = current_substring;
        String largest = current_substring;
        
        for (int i = 1; i <= s.length() - k; i++) {
            current_substring = s.substring(i, i+k);
            if (current_substring.compareTo(largest) > 0){
                largest = current_substring;
            }
            
            if(current_substring.compareTo(smallest) < 0){
                smallest = current_substring;
            }
        }
        
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
