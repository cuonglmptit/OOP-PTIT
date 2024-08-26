/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiemtra2;

import java.util.Scanner;

public class Dien_Thoai_Cuc_Gach {
        private static int toNumber(char c){
        if(c >= 'a' && c <= 'c') return 2;
        if(c >= 'd' && c <= 'f') return 3;
        if(c >= 'g' && c <= 'i') return 4;
        if(c >= 'j' && c <= 'l') return 5;
        if(c >= 'm' && c <= 'o') return 6;
        if(c >= 'p' && c <= 's') return 7;
        if(c >= 't' && c <= 'v') return 8;
        return 9;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        while(t-->0){
            String tmp = sc.nextLine();
            String s = tmp.toLowerCase();
            boolean is_thuan_nghich = true;
            for(int i = 0; i < s.length(); i++) 
                if(toNumber(s.charAt(i)) != toNumber(s.charAt(s.length()-1-i))) is_thuan_nghich = false;
            if(is_thuan_nghich) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
