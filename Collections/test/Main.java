/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author DarkShadowDemon200x
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String a = sc.nextLine();
            long b = Long.parseLong(sc.nextLine());
            Queue<String> q = new LinkedList<>();
            int cnt = 0;
            q.add(a);
            while(!q.isEmpty()){
                String tmp = q.poll();
                if(tmp.contains("?")){
                    for (int i = 0; i < 10; i++) {
                        String tmp1 = tmp.substring(0, tmp.indexOf("?")) + String.valueOf(i) 
                                + tmp.substring(tmp.indexOf("?")+1);
                        q.add(tmp1);
                    }
                }else{
                    if(Long.parseLong(tmp) > b){
                        cnt++;
                        System.out.println(tmp);
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}
