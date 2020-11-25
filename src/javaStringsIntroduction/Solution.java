package javaStringsIntroduction;

import java.util.Scanner;

/**
 *Los elementos de una cadena se denominan caracteres. 
 *El número de caracteres en una cadena se denomina longitud y se puede recuperar con el método String.length ().
 *
 *Dadas dos cadenas de letras inglesas minúsculas, A y B, realice las siguientes operaciones:
 *
 * 1 - Suma las longitudes de A y B.
 * 2 - Determine si A es lexicográficamente más grande que B (es decir, ¿viene B antes de A en el diccionario?).
 * 3 - Escriba en mayúscula la primera letra en A y B e imprímala en una sola línea, separada por un espacio.
 *Formato de entrada
 *
 *La primera línea contiene una cadena A. La segunda línea contiene otra cadena. 
 *Las cadenas se componen únicamente de letras minúsculas en inglés.
 *
 *Formato de salida
 *
 *Hay tres líneas de salida:
 *Para la primera línea, sume las longitudes de A y B.
 *Para la segunda línea, escriba Sí si A es lexicográficamente mayor que B; de lo contrario, escriba No en su lugar.
 *Para la tercera línea, escriba en mayúscula la primera letra tanto en A como en B e imprímala en una sola línea, separada por un espacio.
 * 
 *              imput 0
 *              hello
 *              java
 * 
 *              output 0
 *              9
 *              No
 *              Hello Java
 * 
 * La cadena A es "hola" y B es "java".
 *
 *A tiene una longitud de 5 y B tiene una longitud de 4; la suma de sus longitudes es 9.
 *Cuando se ordena alfabéticamente / lexicográficamente, "hola" precede a "java"; por lo tanto, A no es mayor que B y la respuesta es No.
 * 
 * Cuando escribe en mayúscula la primera letra de A y B y luego las imprime separadas por un espacio, obtiene "Hola Java".
 * @author richie
 */
public class Solution {
    
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        int a_length = A.length();
        int b_lenght = B.length();
        
        System.out.println(a_length + b_lenght);
        
        int result = A.compareTo(B);
        
        if(result > 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " " +
                B.substring(0, 1).toUpperCase() + B.substring(1));
    }
}
