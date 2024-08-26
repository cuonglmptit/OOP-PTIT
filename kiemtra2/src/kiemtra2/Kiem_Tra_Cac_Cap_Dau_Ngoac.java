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
public class Kiem_Tra_Cac_Cap_Dau_Ngoac {
    public static boolean isNgoacDung(String s){
        Stack<Character> st = new Stack<>();
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
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s = sc.nextLine();
            if(isNgoacDung(s)) System.out.println("true");
            else System.out.println("false");
        }
    }
}
