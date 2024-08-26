/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prepareforfinal;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author DarkShadowDemon200x
 */
public class DTCK {
    public static int[] Nhip(int n, int a[]){
        int[] rs = new int[n];
        Stack<Integer> st = new Stack();
        for (int i = 0; i < n; i++) {
            while(!st.isEmpty() && a[i] >= a[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()) rs[i] = i+1;
            else rs[i] = i - st.peek();
            st.push(i);
        }
        return rs;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i : Nhip(n, a)) {
                System.out.print(i+" ");
            }
            System.out.println("");
        }
    }
}
