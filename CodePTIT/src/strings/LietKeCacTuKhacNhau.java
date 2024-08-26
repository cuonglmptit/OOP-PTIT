/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strings;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.StringTokenizer;
import java.util.TreeSet;

/**
 *
 * @author cle13
 */
public class LietKeCacTuKhacNhau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n_line1 = Integer.parseInt(sc.nextLine());
        SortedSet<String> set1 = new TreeSet<String>();
        SortedSet<String> set2 = new TreeSet<String>();
        for(int i = 0; i < n_line1; i++){
            String tmp = sc.nextLine().toLowerCase();
            StringTokenizer st = new StringTokenizer(tmp);
            while(st.hasMoreTokens()){
               set1.add(st.nextToken());
            }
        }
        int n_line2 = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n_line2; i++){
            String tmp = sc.nextLine().toLowerCase();
            StringTokenizer st = new StringTokenizer(tmp);
            while(st.hasMoreTokens()){
               set2.add(st.nextToken());
            }
        }
        for(String ele1 : set1){
            boolean only = true;
            for(String ele2 : set2){
                if(ele1.equals(ele2)) only = false;
            }
            if(only == true) System.out.print(ele1.toLowerCase()+" ");
        }
        System.out.println("");
        for(String ele2 : set2){
            boolean only = true;
            for(String ele1 : set1){
                if(ele2.equals(ele1)) only = false;
            }
            if(only == true) System.out.print(ele2.toLowerCase()+" ");
        }
    }
}
