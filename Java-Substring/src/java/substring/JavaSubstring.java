

import java.util.Scanner;

/**
 *Dada una cadena, s, comienzan y terminan dos índices e imprime una subcadena que consta de todos los caracteres en el rango inclusivo desde el principio hasta el final - 1. Encontrará que el método de subcadena de la clase String es útil para completar este desafío.
 *
 *Formato de entrada
 *
 *La primera línea contiene una sola cadena que denota s.
 *La segunda línea contiene dos enteros separados por espacios que denotan los valores respectivos de inicio y fin.
 *
 *Restricciones
 *1 <| s | <100
 *0 <inicio <fin <n
 *La cadena s consta de letras alfabéticas en inglés (es decir, [a - zA - Z]) únicamente.
 *Formato de salida
 *
 *Imprima la subcadena en el rango inclusivo de principio a fin -1.
 *
 *Entrada de muestra
 *
 *      Hola Mundo
 *      3 7
 *
 *Salida de muestra
 *
 *      lowo
 * @author richie
 */
public class JavaSubstring {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        
        System.out.println(S.substring(start,end));
    }
    
}
