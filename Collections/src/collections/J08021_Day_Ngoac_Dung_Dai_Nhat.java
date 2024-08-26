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
public class J08021_Day_Ngoac_Dung_Dai_Nhat {
    public static int dayNgoacDungDaiNhat(String s){
        int maxLength = 0;
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') st.push(i);
            if(s.charAt(i) == ')'){
                st.pop();
                if(!st.empty()){
                    maxLength = Math.max(maxLength, i - st.peek());
                }else st.push(i);
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s = sc.nextLine();
            System.out.println(dayNgoacDungDaiNhat(s));
        }
    }
}
