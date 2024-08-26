/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strings;

import java.io.ObjectStreamConstants;
import java.util.HashSet;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author cle13
 */
public class LocEmailTrungNhau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();
        SortedSet<String> removed = new TreeSet<>();
        while(sc.hasNextLine()){
            String tmp = sc.nextLine().toLowerCase();
            if(set.add(tmp) == false) removed.add(tmp);
        }
        for(String e : removed){
            System.out.println(e);
        }
    }
}
