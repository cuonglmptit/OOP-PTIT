/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiemtra2;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author DarkShadowDemon200x
 */
public class Kiem_Tra_Cau_Viet_Dung_Quy_Tac {
    public static boolean isNgoacDung(String vb){
        Stack<Character> st = new Stack<>();
        String s = "";
        for (int i = 0; i < vb.length(); i++) {
            if(vb.charAt(i) == '(' || vb.charAt(i) == '[' || vb.charAt(i) == '{'){
                s+=vb.charAt(i);
            }
            if(vb.charAt(i) == ')' || vb.charAt(i) == ']' || vb.charAt(i) == '}'){
                s+=vb.charAt(i);
            }
        }
//        System.out.println(s);
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                st.push(s.charAt(i));
            }else{
                if(!st.empty()){
                    Character tmp = st.pop();
                    if(tmp.equals('(') && s.charAt(i) == ')' || tmp.equals('[') && s.charAt(i) == ']'
                            || tmp.equals('{') && s.charAt(i) == '}') continue;
                    else return false;    
                }else return false;
            }
        }
        return st.empty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String tmp = sc.nextLine();
            if(isNgoacDung(tmp)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
