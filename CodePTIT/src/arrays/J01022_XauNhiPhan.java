/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author cle13
 */
public class J01022_XauNhiPhan {

    /**
     * @param args the command line arguments
     */
    static long f[] = new long[100];
    public static char fiboWord(int n, long k){
        if(n == 1) return '0';
        if(n == 2) return '1';
        if(k <= f[n-2]) return fiboWord(n-2, k);
        return fiboWord(n-1, k - f[n-2]);
//        return 0;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        f[0] = 0; f[1] = 1;
        for(int i = 2; i <= 92; i++) f[i] = f[i-1]+f[i-2];
        while(t-- >0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(fiboWord(n, k));
        }
    }
    
}
