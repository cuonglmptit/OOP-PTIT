/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author DarkShadowDemon200x
 */
public class J02028_Day_Con_Lien_Tiep_Tong_Bang_K {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            long[] a = new long[n+1];
            a[0] = 0;
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
                a[i] += a[i-1];
            }
            int l, r, x;
            boolean have = false;
            for (int i = 1; i <= n; i++) {
                l = i;
                r = n;
                while(l <= r){
                    x = (l+r)/2;
                    if(a[x] - a[i-1] == k){
                        have = true;
                        break;
                    }else if(a[x] - a[i-1] > k){
                        r = x-1;
                    }else{
                        l = x+1;
                    }
                }
            }
            if(have) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
