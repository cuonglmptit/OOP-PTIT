/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package integer_double;

/**
 *
 * @author cle13
 */
import java.util.*;
public class J01011_BoiSoChungUocSoChung {

    /**
     * @param args the command line arguments
     */
    public static long  GCD(long a, long b){ 
        if (a == 0) 
            return b;  
        return GCD(b % a, a);  
    }   
    public static long LCM(long a, long b){  
        long n = a*b;
        long m = GCD(a,b);
        return n/ m; 
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long a = sc.nextLong(), b = sc.nextLong();
            System.out.printf("%d %d\n",LCM(a, b),GCD(a, b));
        }
    }
    
}
