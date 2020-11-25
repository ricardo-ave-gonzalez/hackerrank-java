package JavaStdinAndStdoutII;

import java.util.Scanner;

/**
 *En este desafío, debe leer un entero, un doble y una cadena de stdin, 
 *luego imprimir los valores de acuerdo con las instrucciones en la sección Formato de salida a continuación. 
 *Para facilitar un poco el problema, se le proporciona una parte del código en el editor.
 *Nota: Recomendamos completar Java Stdin y Stdout I antes de intentar este desafío.
 *
 *Formato de entrada
 *
 *Hay tres líneas de entrada:
 *
 *La primera línea contiene un número entero.
 *La segunda línea contiene un doble.
 *La tercera línea contiene una cadena.
 *Formato de salida
 *
 *Hay tres líneas de salida:
 *
 *En la primera línea, imprima Cadena: seguida de la Cadena inalterada leída desde stdin.
 *En la segunda línea, imprima Double: seguido de la lectura doble inalterada de stdin.
 *En la tercera línea, imprima Int: seguido del entero inalterado leído de stdin.
 *Para facilitar el problema, ya se proporciona una parte del código en el editor.
 *
 *Nota: Si usa el método nextLine () inmediatamente después del método nextInt (), 
 *recuerde que nextInt () lee tokens enteros; debido a esto, el último carácter de nueva 
 *línea para esa línea de entrada entera todavía está en cola en el búfer de entrada y la siguiente 
 *línea siguiente () leerá el resto de la línea entera (que está vacía).
 *
 *Entrada de muestra
 *
 *  42
 *  3.1415
 * 
 *Salida de muestra
 *
 *Cadena: ¡Bienvenido a los tutoriales de Java de HackerRank!
 *  Doble: 3.1415
 *  Int: 42
 * @author richie
 */
public class JavaStdinAndStdoutII {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();

        // Write your code here.
        Double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
    
}
