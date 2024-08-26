/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author cle13
 */
public class J02017_ThuGonDaySo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i = 0; i < n; i++) a.add(i, sc.nextInt());
        boolean have_pair = true;
        while (have_pair){
            have_pair = false;
            for (int i = 0; i < a.size() - 1; i++){
                if ((a.get(i) + a.get(i + 1)) % 2 == 0) {
                    a.remove(i); 
                    a.remove(i); 
                    have_pair = true; 
                } 
            } 
        } 
        System.out.print(a.size());        
    }
}
