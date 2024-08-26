/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strings;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author DarkShadowDemon200x
 */
public class J03022_XuLyVanBan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String vanban = "";
        while(sc.hasNextLine()){
            vanban += sc.nextLine().toLowerCase();
        }
        String[] xuly = vanban.split("[.?!]");
        for (String sentence : xuly) {
            StringTokenizer st = new StringTokenizer(sentence);
            String s = "";
            while(st.hasMoreTokens()){
                String tmp = st.nextToken();
                s += tmp;
                if(st.hasMoreTokens()) s += " ";
            }
            System.out.println(String.valueOf(s.charAt(0)).toUpperCase()+s.substring(1));
        }
    }
}