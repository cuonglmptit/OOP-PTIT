/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strings;

import java.util.Scanner;

/**
 *
 * @author cle13
 */
public class J03008_SoDep3 {

    /**
     * @param args the command line arguments
     */
    public static boolean isPrime(int n){
        for(int i = 2; i<=Math.sqrt(n); i++){
            if(n%i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
         String s="";
        while(t-->0){
            s = sc.next();
            boolean ok = true;
            int n = s.length();
            for(int i = 0; i < n/2; i++){
                if(s.charAt(i) != s.charAt(n-i-1)) ok = false;
            }   
            for(int i = 0; i < n; i++){
                if(isPrime(s.charAt(i)-'0') != true) ok = false;
            }
            if(ok == true) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
}
