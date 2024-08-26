/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiemtra2;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author DarkShadowDemon200x
 */
public class DemCap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] ds = new long[n];
        for (int i = 0; i < n; i++) {
            ds[i] = sc.nextLong();
        }
        long[] firstMinRight = new long[n];
        long[] firstMinLeft = new long[n];
        Stack<Integer> st = new Stack<>();
        //tìm phần tử đầu tiên bên phải nhỏ hơn
        for (int i = n - 1; i >= 0; i--) {
            while (!st.empty() && ds[i] <= ds[st.peek()]) {
                st.pop();
            }
            if (st.empty()) {
                firstMinRight[i] = n;//nếu ko có thì sẽ cho là n, chính là độ dài của array
            } else {
                firstMinRight[i] = st.peek();
            }
            st.push(i);
        }
        //tìm phần tử đầu tiên bên trái nhỏ hơn
        st.clear();
        for (int i = 0; i < n; i++) {
            while (!st.empty() && ds[i] <= ds[st.peek()]) {
                st.pop();
            }
            if (st.empty()) {
                firstMinLeft[i] = -1;//nếu ko có thì sẽ cho là -1
            } else {
                firstMinLeft[i] = st.peek();
            }
            st.push(i);
        }
        long cnt = 0;
        for (int i = 0; i < firstMinLeft.length; i++) {
            if(firstMinRight[i] - firstMinLeft[i]>0) cnt++;
        }
        System.out.println(cnt);
    }
}
