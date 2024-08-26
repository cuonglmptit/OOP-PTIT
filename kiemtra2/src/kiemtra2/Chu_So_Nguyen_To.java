/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiemtra2;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author DarkShadowDemon200x
 */
public class Chu_So_Nguyen_To {

    public static boolean check(String s) {
        Set<Character> st = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            st.add(s.charAt(i));
        }
        if (st.size() == 4) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<String> q = new LinkedList<>();
        q.add("");
        while (true) {
            String s = q.poll();
            if(s.length() > n)break;
            if (check(s)&&s.length() <= n) {
                int c = s.charAt(s.length()-1)-'0';
                if(c%2!=0)System.out.println(s);
            }
            q.add(s + "2");
            q.add(s + "3");
            q.add(s + "5");
            q.add(s + "7");
        }
    }
}
