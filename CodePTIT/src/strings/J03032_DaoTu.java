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
public class J03032_DaoTu {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        while(t-- >0){
            StringTokenizer s = new StringTokenizer(sc.nextLine());
            while(s.hasMoreTokens()){
                String tmp = s.nextToken();
                StringBuilder s1 = new StringBuilder(tmp);
                System.out.print(s1.reverse()+" ");
            }
            System.out.print('\n');
        }
    }
}
