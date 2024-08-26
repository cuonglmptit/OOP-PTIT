/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strings;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author cle13
 */
public class J02035_QuayPhai {
    //giải thích đề: ban đầu có 1 dãy tăng dần, sau đó quay K lần, tìm số lần quay đó
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            ArrayList<Integer> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                a.add(sc.nextInt());
            }
            boolean souted = false;
            for (int i = n-2; i >= 0; i--) {
                if(a.get(i) <= a.get(i+1)) continue;
                else{
                    System.out.println((i+1));
                    souted = true;
                    break;
                }
            }
            if(!souted) System.out.println(0);;
        }
    }
}
