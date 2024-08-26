/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prepareforfinal;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author DarkShadowDemon200x
 */
public class So09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Queue<String> q = new LinkedList<>();
            q.add("9");
            while(true){
                String s1 = q.poll();
                String s2 = s1+"0";
                String s3 = s1+"9";
                if(Long.parseLong(s1)%n == 0){
                    System.out.println(s1);
                    break;
                }else if(Long.parseLong(s2)%n == 0){
                    System.out.println(s2);
                    break;
                }else if(Long.parseLong(s3)%n == 0){
                    System.out.println(s3);
                    break;
                }
                q.add(s2);
                q.add(s3);
            }
        }
    }
}
