package strings;


import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cle13
 */
public class J03004_ChuanHoaXauHoTen1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String s = sc.nextLine();
            StringTokenizer st = new StringTokenizer(s);
            String name_corrected = "";
            while(st.hasMoreTokens()){
                String tmp = st.nextToken().toLowerCase();
                name_corrected += String.valueOf(tmp.charAt(0)).toUpperCase();
                for(int i = 1; i < tmp.length(); i++) name_corrected+=tmp.charAt(i);
                name_corrected += ' ';
            }
            System.out.println(name_corrected);
        }
    }
}
