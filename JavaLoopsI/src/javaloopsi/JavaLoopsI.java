/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaloopsi;
import java.io.*;
import static java.lang.System.in;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
/**
 *Objetivo
 *En este desafío, usaremos bucles para ayudarnos a hacer algunas matemáticas simples.
 *
 *Tarea
 *Dado un número entero, N, imprime sus primeros 10 múltiplos. 
 *Cada múltiplo N x i (donde 1 <i <10) 
 *  debe imprimirse en una nueva línea en la forma: 
 * N x i = resultado.
 *
 *Formato de entrada
 *
 *Un solo entero, N.
 *
 *Restricciones
 *      2 <n <20
 *Formato de salida
 *
 *Imprime 10 líneas de salida; cada línea (donde1 <i <10) contiene el resultado de N x i en la forma:
 *      N x i = resultado.
 *
 *Entrada de muestra
 *
 *      2
 *
 *Salida de muestra
 *
 *      2 x 1 = 2
 *      2 x 2 = 4
 *      2 x 3 = 6
 *      2 x 4 = 8
 *      2 x 5 = 10
 *      2 x 6 = 12
 *      2 x 7 = 14
 *      2 x 8 = 16
 *      2 x 9 = 18
 *      2 x 10 = 20
 * @author richie
 */
public class JavaLoopsI {
    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        for (int i = 1; i <=10; i++) {
            int resultado = N*i;
            //System.out.printf("%d  x  %d = %d",N,i,resultado);
            System.out.print(N);
            System.out.print(" x ");
            System.out.print(i);
            System.out.print(" = ");
            System.out.println(resultado);
        }
        scanner.close();
    }
}
