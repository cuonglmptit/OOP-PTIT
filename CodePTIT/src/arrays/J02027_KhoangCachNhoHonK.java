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
public class J02027_KhoangCachNhoHonK {
    public static long pairCount(int[] a, int n, int k){
        Arrays.sort(a);
        long cnt = 0;
        int j = 0;
        for (int i = 0; i < n; i++) {
            while(j < n && a[j]-a[i] < k){
                j++;
            }
            cnt += j-i-1;
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt(), k = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            System.out.println(pairCount(a, n, k));
        }
    }
}
