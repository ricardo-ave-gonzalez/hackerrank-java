package javaloopsii;

import java.util.Scanner;

/**
 *
 *  Sample Input
 * ===============================================
 *
 *          2
 *          0 2 10
 *          5 3 5
 *          
 *  Sample Output
 * ===============================================
 *          2 6 14 30 62 126 254 510 1022 2046
 *          8 14 26 50 98
 * 
 * 
 * 
 * @author richie
 */
public class JavaLoopsII {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            for (int j = 0; j < n; j++) {
                a += b;
                
                if (j > 0) {
                    System.out.print(" "); // El espacio correspondiente
                }
                System.out.print(a);
                b = b * 2;
            }
            System.out.print("\n"); 
        }
        in.close();
    }
    
}
