/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author DarkShadowDemon200x
 */
public class J02009_Xep_Hang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = sc.nextInt();
        ArrayList<Integer> arl = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            arl.add(a);
            map.put(a, b);
        }
        Collections.sort(arl);
        int time = 0;
        for (Integer i : arl) {
            time = Math.max(i + map.get(i), time + map.get(i));
        }
        System.out.println(time);
    }
}