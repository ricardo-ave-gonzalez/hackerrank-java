package javaoutputformatting;

import java.util.Scanner;

/**
 *La función ****System.out.printf**** de Java se puede utilizar para imprimir resultados formateados. 
 *El propósito de este ejercicio es probar su comprensión del formato de salida usando printf.
 *
 *Para empezar, se le proporciona una parte de la solución en el editor; debe formatear e imprimir 
 *la entrada para completar la solución.
 *
 *Formato de entrada
 *
 *Cada línea de entrada contendrá una Cadena seguida de un número entero.
 *Cada cadena tendrá un máximo de caracteres alfabéticos y cada número entero 
 *estará en el rango inclusivo de a.
 *
 *Formato de salida
 *
 *En cada línea de salida debe haber dos columnas:
 *La primera columna contiene la Cadena y está justificada a la izquierda usando exactamente caracteres.
 *La segunda columna contiene el número entero, expresado exactamente en dígitos; si la entrada original 
 *tiene menos de tres dígitos, debe rellenar los primeros dígitos de la salida con ceros.
 *
 *Entrada de muestra
 *================================
 *  java          100
 *  cpp           065
 *  python        050
 *================================
 * @author richie
 */
public class JavaOutputFormatting {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                System.out.printf("%-15s%03d\n",s1,x);
            }
        System.out.println("================================");
    }
    
}
