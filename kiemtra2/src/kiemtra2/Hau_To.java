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
public class Hau_To {

    public static long giatriHauTo(String bt) {
        String[] s = bt.split(" ");
        Stack<String> st = new Stack<>();
        for (int i = 0; i < s.length; i++) {
            String c = s[i];
            if (c.equals("+")) {
                long v1 = Long.parseLong(st.pop());
                long v2 = Long.parseLong(st.pop());
                st.push(Long.toString(v2 + v1));
            } else if (c.equals("-")) {
                long v1 = Long.parseLong(st.pop());
                long v2 = Long.parseLong(st.pop());
                st.push(Long.toString(v2 - v1));
            } else if (c.equals("*")) {
                long v1 = Long.parseLong(st.pop());
                long v2 = Long.parseLong(st.pop());
                st.push(Long.toString(v2 * v1));
            } else if (c.equals("/")) {
                long v1 = Long.parseLong(st.pop());
                long v2 = Long.parseLong(st.pop());
                st.push(Long.toString(v2 / v1));
            } else {
                st.push(c);
            }
        }
        return Long.parseLong(st.pop());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
//        System.out.println(giatriHauTo("8 7 5 * + 9 –"));
        while (t-- > 0) {
            int n = Integer.parseInt(sc.nextLine());
            String s = sc.nextLine();
            System.out.println(giatriHauTo(s));
        }
    }
}
