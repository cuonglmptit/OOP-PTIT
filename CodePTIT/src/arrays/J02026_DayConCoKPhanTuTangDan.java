/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author cle13
 */
public class J02026_DayConCoKPhanTuTangDan {
    public static void printAndCheck(int n, int k, int[] a, int[] x){
        int[] tmp = new int[16];
        int c = 0;
        for (int i = 1; i <= n; i++) {
            if(x[i] == 0){
                tmp[c] = a[i];
                c++;
            }
        }
        if(c != k) return;
        boolean isASC = true;
        for (int i = 0; i < k-1; i++) {
            if(tmp[i] > tmp[i+1]) isASC = false;
        }
        if(isASC){
            for (int i = 0; i < c; i++) {
                System.out.print(tmp[i]+" ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt(), k = sc.nextInt();
            int[] a = new int[n+1];
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
            }
            int x[] = new int[n+1];
            for (int i = 1; i <= n; i++) {
                for (int j = i+1; j <= n; j++) {
                    if(a[i] >= a[j]){
                        int tmp = a[i];
                        a[i] = a[j];
                        a[j] = tmp;
                    }
                }
            }
            Arrays.fill(x, 0);
            while(true){
                printAndCheck(n, k, a, x);
                int i = n;
                while(x[i] == 1 && i > 0){
                    x[i] = 1-x[i]; i--;
                }
                if(i == 0) break;
                else{
                    x[i] = 1;
                }
            }
        }
    }
}
