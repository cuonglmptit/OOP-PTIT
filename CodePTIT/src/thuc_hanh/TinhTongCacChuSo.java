/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuc_hanh;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author cle13
 */
public class TinhTongCacChuSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s = sc.nextLine();
            int sum  = 0;
            int[] a = new int[26];
            for(int i = 0 ; i < a.length; i++) a[i] = 0;
            for(int i  = 0; i < s.length(); i++){
                if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' ) a[s.charAt(i) - 'A']++;
                if(s.charAt(i)>='0'&&s.charAt(i)<='9') sum += s.charAt(i)-'0';
            }
            for(int i = 0 ; i < a.length; i++){
                for(int j = 0; j < a[i]; j++){
                    int tmp = 'A'+i;
                    System.out.print(Character.toChars((char)tmp));
                }
            }
            System.out.println(sum);
        }
    }
}
