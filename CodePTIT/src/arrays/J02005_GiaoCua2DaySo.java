/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

import java.util.Scanner;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author cle13
 */
public class J02005_GiaoCua2DaySo {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        SortedMap<Integer, Integer> sm = new TreeMap<>();
        SortedSet<Integer> set = new TreeSet<>();
        for(int i = 0; i < n; i++){
            sm.put(sc.nextInt(), 1);
        }
        for(int i = 0; i < m; i++) set.add(sc.nextInt());
        for(int i : set){
            if(sm.get(i) != null) System.out.print(i + " ");
        }
    }
}
