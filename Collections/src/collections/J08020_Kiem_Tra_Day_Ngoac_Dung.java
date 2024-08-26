/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author DarkShadowDemon200x
 */
public class J08020_Kiem_Tra_Day_Ngoac_Dung {
    //idea: cho chay tu dau den cuoi string, push vao stack neu la mo ngoac, neu la ngoac dong' thi` pop ra
    //neu cai pop ra == cai ngoac dong dang xet thi ok, con khac thi break, NO
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
    public static boolean isNgoacDungUseDequeue(String s){
        Deque<Character> st = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                st.push(s.charAt(i));
            }else{
                if(!st.isEmpty()){
                    Character tmp = st.pop();
                    if(tmp.equals('(') && s.charAt(i) == ')' || tmp.equals('[') && s.charAt(i) == ']'
                            || tmp.equals('{') && s.charAt(i) == '}') continue;
                    else return false;    
                }else return false;
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s = sc.nextLine();
            if(isNgoacDung(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}