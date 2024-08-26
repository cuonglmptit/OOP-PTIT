/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package integer_double;

import java.util.Scanner;

/**
 *
 * @author DarkShadowDemon200x
 */
public class J02008_BoiSoNhoNhatCuaNSoNguyenDuongDauTien {

    /**
     * @param args the command line arguments
     */
    public static long GCD(long a, long b){
        if (a == 0) 
            return b;  
        return GCD(b % a, a);  
    }
    public static long LCM(long a, long b){  
	long n = a*b;
	long  m = GCD(a,b);
        return n/ m;    
    }  
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            long lcm = 1;
            for(long i = 1; i <= n; i++){
                lcm = LCM(lcm,i);
            }
            System.out.println(lcm);    
        }
    }
    
}
