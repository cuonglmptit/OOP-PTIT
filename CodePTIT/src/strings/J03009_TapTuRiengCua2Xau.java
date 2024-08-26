/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author cle13
 */
public class J03009_TapTuRiengCua2Xau {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        while(t-- >0){
            String[] s1 = sc.nextLine().split(" ");
            HashSet<String> set = new HashSet<String>();
            for(int i = 0; i < s1.length; i++) set.add(s1[i]);
            String[] s2 = sc.nextLine().split(" ");
            for(String element : set){
                boolean only = true;
                for(int j = 0; j < s2.length; j++){
                    if(element.equals(s2[j])) only = false;
                }
                if(only == true) System.out.print(element+" ");
            }
            System.out.print('\n');
        }
    }
}
