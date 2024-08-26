/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author DarkShadowDemon200x
 */
public class J02016_Bo_Ba_So_Pytago {
    public static boolean havePytago(long[] a, int n){
	for(int i = 0; i < n; i++){
		a[i] = a[i]*a[i];
	}
	Arrays.sort(a);
	for(int i = n-1; i >= 2; i--){
		int left = 0, right = i-1;
		while(left < right){
			if(a[left]+a[right] == a[i]) return true;//neu tim thay thi return true luon
			if(a[left]+a[right] < a[i]) left++;//neu ma nho hon a[i[ thi` tang bien left
			else right--;//con` lon hon thi` se giam bien right
		}
	}
	return false;//neu chay het ma ko co thi tra ve 0
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n =sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            if(havePytago(a, n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
