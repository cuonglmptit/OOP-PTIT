/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author DarkShadowDemon200x
 */
public class J02023_Lua_Chon_Tham_Lam {
/**Idea: Kiem tra xem N*9 <= S?, neu co thi ko ton` tai(1)
+Lien tuc them vao` so 9 de tim so lon nhat, neu viec them vao > S thi` se them so nho nhat cuoi cung co the them vao
VD: N=3,S=17 => MAX : 9,(17-9),0=> 980, MIN: la` so reverse of MAX: 089, nhan thay MIN co so 0 o? dau` tien thi` se~ lam` thanh` 179
* */
    public static String findMinMax(int n, int s){
        String resMax = "";
        while(resMax.length() < n && s >= 0){
            if(s >= 9){
                s -= 9;
                resMax += "9";
            }else if(s >= 0){
                resMax += String.valueOf(s);
                s -= s;
            }
            if(resMax.length() == n) break;
        }
        if(s > 0) return "-1 -1";
        StringBuilder sb = new StringBuilder(resMax);
        sb.reverse();
        if(sb.charAt(0) == '0'){
            for (int i = 0; i < sb.length(); i++) {
                if(sb.charAt(i) != '0'){
                    sb.setCharAt(i, (char) (sb.charAt(i) - 1));
                    sb.setCharAt(0, '1');
                    break;
                }
            }
        }
        String resMin = new String(sb);
        if(resMin.charAt(0) == '0') return "-1 -1";
        return resMin + " " + resMax;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), s = sc.nextInt();
        System.out.println(findMinMax(n, s));
    }
}
