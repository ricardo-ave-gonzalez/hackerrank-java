package javaend.of.file;

import java.util.Scanner;

/**
 *In computing, End Of File (commonly abbreviated EOF) is a condition in a computer 
 *operating system where no more data can be read from a data source." — (Wikipedia: End-of-file)
 *
 *The challenge here is to read n lines of input until you reach EOF, then number and print all n lines of content.
 *
 *Hint: Java's Scanner.hasNext() method is helpful for this problem.
 *
 *Input Format
 *
 *Read some unknown  lines of input from stdin(System.in) until you reach EOF; 
 *each line of input contains a non-empty String.
 *
 *Output Format
 *
 *For each line, print the line number, followed by a single space, and then the line content received as input.
 *
 *En informática, End Of File (comúnmente abreviado EOF) es una condición en una computadora
 *sistema operativo donde no se pueden leer más datos de una fuente de datos ". - (Wikipedia: Fin de archivo)
 *
 *El desafío aquí es leer n líneas de entrada hasta llegar a EOF, luego numerar e imprimir las n líneas de contenido.
 *
 *Sugerencia: el método Scanner.hasNext () de Java es útil para este problema.
 *
 *Formato de entrada
 *
 *Leer algunas líneas desconocidas de entrada de stdin (System.in) hasta llegar a EOF;
 *cada línea de entrada contiene una cadena no vacía.
 *
 *Formato de salida
 *
 *Para cada línea, imprima el número de línea, seguido de un solo espacio, 
 *y luego el contenido de línea recibido como entrada.
 *
 *Sample Input
 *
 *  Hello world
 *  I am a file
 *  Read me until end-of-file.
 *Sample Output
 *
 *  1 Hello world
 *  2 I am a file
 *  3 Read me until end-of-file.
 * 
 * 
 * @author richie
 */
public class JavaEndOfFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int line_number = 1;
        while(scanner.hasNext()){
            System.out.println(line_number + " " + scanner.nextLine());
            line_number++;
        }
        scanner.close();
    }
    
}
