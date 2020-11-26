package javaStringReverse;

import java.util.Scanner;

/**
 *              palíndromo 
 * @author richie
 */
public class Solution {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        int a_punto = 0;
        int b_punto = A.length()-1;
        
        while(a_punto <= b_punto){
            if (A.charAt(a_punto) != A.charAt(b_punto)) {
                System.out.println("No");
                return;
            }
            a_punto++;
            b_punto--;
        }
        System.out.println("Yes");
    }
}
