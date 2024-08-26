/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author cle13
 */
public class J03031_XauDayDu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s = sc.nextLine();
            int k = Integer.parseInt(sc.nextLine());
            Set<String> set = new HashSet<>();
            for (int i = 0; i < s.length(); i++) {
                set.add(String.valueOf(s.charAt(i)));
            }
            if(set.size()+k >= 26) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
