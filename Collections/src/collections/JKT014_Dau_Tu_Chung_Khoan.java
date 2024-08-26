/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collections;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

/**
 *
 * @author DarkShadowDemon200x
 */
public class JKT014_Dau_Tu_Chung_Khoan {
    public static void nhipChungKhoan(int[] a, int n, int[] nhip){
        // Create a stack and push index of first element to it
        Deque<Integer> st = new ArrayDeque<Integer>();
        //Stack<Integer> st = new Stack<>();
        st.push(0);
        // Span value of first element is always 1
        nhip[0] = 1;
        // Calculate span values for rest of the elements
        for (int i = 1; i < n; i++) {
            // Pop elements from stack while stack is not
            // empty and top of stack is smaller than
            // price[i]
            while (!st.isEmpty() && a[st.peek()] <= a[i])
                st.pop(); 
            // If stack becomes empty, then price[i] is
            // greater than all elements on left of it, i.e.,
            // price[0], price[1], ..price[i-1]. Else price[i]
            // is greater than elements after top of stack
            nhip[i] = (st.isEmpty()) ? (i + 1) : (i - st.peek());
            // Push this element to stack
            st.push(i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] nhip = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            nhipChungKhoan(a, n, nhip);
            for (int i = 0; i < n; i++) {
                System.out.print(nhip[i] + " ");
            }
            System.out.println("");
        }
    }
}
