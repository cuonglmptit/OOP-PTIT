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
public class J02024_DayConCoTongLe {
    public static void printAndCheck(int n, int[] a, int[] x){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if(x[i] == 1) sum += a[i];
        }
        if(sum%2 != 0){
            for (int i = 1; i <= n; i++) if(x[i] == 1)System.out.print(a[i]+" ");
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n+1];
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
            }
            int x[] = new int[n+1];
            for (int i = 1; i <= n; i++) {
                for (int j = i+1; j <= n; j++) {
                    if(a[i] <= a[j]){
                        int tmp = a[i];
                        a[i] = a[j];
                        a[j] = tmp;
                    }
                }
            }
            Arrays.fill(x, 0);
            while(true){
                printAndCheck(n, a, x);
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
