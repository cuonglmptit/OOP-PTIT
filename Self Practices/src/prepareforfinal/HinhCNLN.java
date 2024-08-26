/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prepareforfinal;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author DarkShadowDemon200x
 */
public class HinhCNLN {
    public static void Solve(int n, long[] a){
        int b[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = n-1; i >= 0; i--) {
            while(!st.isEmpty() && a[i] <= a[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()) b[i] = n;
            else b[i] = st.peek();
            st.push(i);
        }
        st.clear();
        int c[] = new int[n];
        for (int i = 0; i < n; i++) {
            while(!st.isEmpty() && a[i] <= a[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()) c[i] = -1;
            else c[i] = st.peek();
            st.push(i);
        }
//        System.out.println("B: "+Arrays.toString(b));
//        System.out.println("C: "+Arrays.toString(c));
        long max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max((b[i]-c[i]-1)*a[i], max);
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Solve(n, a);
        }
    }
}
