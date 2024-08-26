/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author DarkShadowDemon200x
 */
public class J08024_So_0_Va_So_9 {
    public static void min09ChiaN(int n){
        Queue<String> q = new LinkedList<>();
        q.add("9");
        while(true){
            String s1 = q.poll();
            if(Long.parseLong(s1)%n == 0){
                System.out.println(s1);
                break;
            }
            String s2 = new String(s1);
            q.add(s2 + "0");
            q.add(s2 + "9");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            min09ChiaN(n);
        }
    }
}
