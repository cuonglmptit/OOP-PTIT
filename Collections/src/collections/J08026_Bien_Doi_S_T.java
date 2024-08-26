/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author DarkShadowDemon200x
 */
public class J08026_Bien_Doi_S_T {
    public static int Minsteps(int n, int m) {
        int ans = 0;
        // Continue till m is greater than n
        while (m > n) {
            // If m is odd
            if (m % 2 != 0) {
                // add one
                m++;
                ans++;
            }
            // divide m by 2    
            m /= 2;
            ans++;
        }
        // Return the required answer
        return ans + n - m;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            int s = sc.nextInt(), t = sc.nextInt();
            System.out.println(Minsteps(s, t));
        }
    }
}
