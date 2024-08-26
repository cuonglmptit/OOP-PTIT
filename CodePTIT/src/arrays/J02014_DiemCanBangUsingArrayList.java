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
public class J02014_DiemCanBangUsingArrayList {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            ArrayList<Integer> a = new ArrayList<Integer>();
            for(int  i = 0; i < n; i++) a.add(i, sc.nextInt());
            int total = 0, sumleft = 0, sumright = 0;
            boolean ok = false;
            for(int i = 0; i < n; ++i){
                    total += a.get(i);
            }
            for(int i = 0; i < n; ++i){
                    sumright = total - a.get(i) - sumleft;
                    if(sumleft == sumright){
                            System.out.println(i+1);   
                            ok = true;
                            break;
                    }
                    sumleft+=a.get(i);
            }
            if(ok == false) System.out.println(-1); 
        }
    }
}
