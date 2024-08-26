/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collections;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author DarkShadowDemon200x
 */
public class JKT015_Go_Ban_Phim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '<'){
                if(!st1.isEmpty()){
                    st2.push(st1.pop());
                }
            }else if(s.charAt(i) == '>'){
                if(!st2.isEmpty()){
                    st1.push(st2.pop());
                }
            }else if(s.charAt(i) == '-'){
                if(!st1.isEmpty()) st1.pop();
            }else{
                st1.push(s.charAt(i));
            }
        }
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }
        while(!st2.isEmpty()) System.out.print(st2.pop());
    }
}
