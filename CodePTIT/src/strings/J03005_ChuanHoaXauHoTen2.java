/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strings;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author cle13
 */
public class J03005_ChuanHoaXauHoTen2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        while(t-- >0){
            StringTokenizer s = new StringTokenizer(sc.nextLine());
            boolean first = true;
            String first_name = "";
            String last_name = "";
            while(s.hasMoreTokens()){
                String tmp = s.nextToken().toLowerCase();
                if(first == true){
                    first_name = tmp;
                    first = false;
                }else{
                    last_name += String.valueOf(tmp.charAt(0)).toUpperCase() + tmp.substring(1) + ' ';
                }
            }
            String last_name1 = last_name.substring(0, last_name.length()-1);
            System.out.println(last_name1 + ", " + first_name.toUpperCase());
        }
    }
}
