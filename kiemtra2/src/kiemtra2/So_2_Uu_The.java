/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiemtra2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author DarkShadowDemon200x
 */
public class So_2_Uu_The {
//    public static long toBase3(int n){
//        long res = 0, factor = 1;
//        int x = n%3;
//        while(n>0){
//            res += n%3*factor;
//            n/=3;
//            factor*=10;
//        }
//        return res;
//    }

    public static boolean is2Dominate(String s) {
        if (s.length() == 0 || s.charAt(0) == '0') {
            return false;
        }
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '2') {
                cnt++;
            }
        }
        return cnt * 2 > s.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Queue<String> q = new LinkedList<>();
            q.add("");
            while (n > 0) {
                String s = q.poll();
                if (is2Dominate(s)) {
                    System.out.print(s + " ");
                    n--;
                }
                q.add(s + "0");
                q.add(s + "1");
                q.add(s + "2");
            }
            System.out.println("");
        }
    }
}
