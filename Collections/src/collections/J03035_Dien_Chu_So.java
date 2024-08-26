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
public class J03035_Dien_Chu_So {
    public static long deQuy(String a, String b){
        if(a.length() > b.length()){
            int questionM = 0;
            for (int i = 0; i < a.length(); i++) {
                if(a.charAt(i) == '?') questionM++;
            }
            return (long) Math.pow(10, questionM);
        }else if(a.length() < b.length()) return 0;
        int questionM = 0;
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i) == '?') questionM++;
        }
        if(a.charAt(0) == '?' && a.length() > 1) return (long) ((9 - Integer.parseInt(String.valueOf(b.charAt(0))))*Math.pow(10, questionM-1))
                + deQuy(a.substring(1), b.substring(1));
        if(a.charAt(0) == '?') return (long) ((9 - Integer.parseInt(String.valueOf(b.charAt(0))))*Math.pow(10, questionM-1));
        if(a.charAt(0) < b.charAt(0)) return 0;
        if(a.charAt(0) > b.charAt(0))return (long) Math.pow(10, questionM);
        if(a.length() > 1) return deQuy(a.substring(1), b.substring(1));
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String a = sc.nextLine();
            String b = sc.nextLine();
            System.out.println(deQuy(a, b));
        }
    }
/*
    //Cách dùng Stack||Queue nhưng mà bị TLE do sinh nhiều quá
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String a = sc.nextLine();
            long b = Long.parseLong(sc.nextLine());
//            Stack<String> st = new Stack<>();//Có thể dùng stack cũng đc, code bên dưới thì giống nhau
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
                    if(Long.parseLong(tmp) > b) cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
    */
}
