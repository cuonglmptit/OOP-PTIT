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
public class J01014_UocSoNguyenToLonNhat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            long Maxfactor = 2;
            for(int i=2;i<=Math.sqrt(n);i++){
                boolean isPrime = false;
                while(n%i==0){
                    n/=i;
                    isPrime = true;
                }
                if(isPrime == true) Maxfactor = i;
            }
            if(Maxfactor < n) Maxfactor = n;
            System.out.println(Maxfactor);
        }
    }
    
}
