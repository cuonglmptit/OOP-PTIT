/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collections;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author DarkShadowDemon200x
 */
public class J02009_Xep_Hang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            map.put(a, b);
            pq.add(a);
        }
        int time = 0;
        while(!pq.isEmpty()){
            int a = pq.poll();
            time = Math.max(a + map.get(a), time + map.get(a));
        }
        System.out.println(time);
    }
    /*  //Cách 2 dùng mảng thường, còn đầy cách như PriorityQueue, TreeMap, ArrayList...
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            arr[i] = a;
            map.put(a, b);
        }
        Arrays.sort(arr);
        int time = 0;
        for (Integer i : arr) {
            time = Math.max(i + map.get(i), time + map.get(i));
        }
        System.out.println(time);
    }*/
}
