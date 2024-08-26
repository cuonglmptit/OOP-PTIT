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
public class JKT013_So_Loc_Phat {
    public static void locPhat(int n){
        Vector<String> v = new Vector<>();
        Queue<String> q = new LinkedList<>();
        q.add("6");
        q.add("8");
        while(true){
            String s1 = q.poll();
            if(s1.length() == n+1) break;
            v.add(s1);
            String s2 = new String(s1);
            q.add(s2 + "6");
            q.add(s2 + "8");
        }
        System.out.println(v.size());
        for (int i = v.size()-1; i >= 0; i--) {
            System.out.print(v.get(i)+" ");
        }
        System.out.println("");
//        while(!q.isEmpty()){
//            System.out.println(q.poll());
//        }
        
    }
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            locPhat(n);
        }
    }
}
