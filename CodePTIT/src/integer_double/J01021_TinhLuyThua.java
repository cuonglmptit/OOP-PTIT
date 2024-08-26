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
public class J01021_TinhLuyThua {

    /**
     * @param args the command line arguments
     */
    static long mod = (long) (1e9+7);
    public static long Luythua(long a, long b){
        if(b == 0) return 1;
        long x = Luythua(a, b/2);
        if(b%2 == 0) return x*x%mod;
        else return (x*x)%mod*a%mod;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        while(true){
            long a = sc.nextLong(), b = sc.nextLong();
            if(a == 0 && b==0) break;
            else
                System.out.println(Luythua(a,b));
        }
    }
    
}
