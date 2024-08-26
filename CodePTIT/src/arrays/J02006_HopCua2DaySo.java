/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author cle13
 */
public class J02006_HopCua2DaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        SortedSet<Integer> ss = new TreeSet<>();
        for(int i = 0; i < n+m; i++){
            ss.add(sc.nextInt());
        }
        for(int i : ss) System.out.print(i + " ");
    }
}
