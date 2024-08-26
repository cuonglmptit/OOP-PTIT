/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiemtra2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author DarkShadowDemon200x
 */
public class Chuan_Hoa_Cau {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String vanban = "";
        Queue<Character> q = new LinkedList<>();
        while (sc.hasNextLine()) {
            String line = sc.nextLine().toLowerCase().trim();
            if (line.charAt(line.length() - 1) != '.' && line.charAt(line.length() - 1) != '!' && line.charAt(line.length() - 1) != '?') {
                line += ".";
            }
            q.add(line.charAt(line.length() - 1));
            vanban += line;
        }
        String[] xuly = vanban.split("[.?!]");
        for (String sentence : xuly) {
            StringTokenizer st = new StringTokenizer(sentence);
            String s = "";
            while (st.hasMoreTokens()) {
                String tmp = st.nextToken();
                s += tmp;
                if (st.hasMoreTokens()) {
                    s += " ";
                }
            }
            System.out.println(String.valueOf(s.charAt(0)).toUpperCase() + s.substring(1) + q.poll());
        }
    }
}
