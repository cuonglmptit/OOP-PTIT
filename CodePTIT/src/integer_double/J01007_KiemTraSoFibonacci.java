/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package integer_double;

import java.util.Scanner;

/**
 *
 * @author cle13
 */
public class J01007_KiemTraSoFibonacci {

    /**
     * @param args the command line arguments
     */
    public static boolean isFibonacci(long n){
	if (n == 0 || n == 1) return true;
	long fn=1,f1=1,f0=0;
	while(fn<n){
            fn=f0+f1;
            f0=f1;
            f1=fn;
	}
	if(fn==n) return true;
	return false;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-- >0){
            long n = sc.nextLong();
            if(isFibonacci(n)==true) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
}
