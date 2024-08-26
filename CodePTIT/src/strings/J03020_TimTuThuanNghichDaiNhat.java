/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author cle13
 */
public class J03020_TimTuThuanNghichDaiNhat {
    private static boolean isThuanNghich(String s){
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != s.charAt(s.length()-1-i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        while(sc.hasNext()){
            String tmp = sc.next();
            if(isThuanNghich(tmp)){
                if(map.containsKey(tmp)) map.put(tmp, map.get(tmp)+1);
                else map.put(tmp, 1);
            }
        }
        int maxLength = -1;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getKey().length() > maxLength) maxLength = entry.getKey().length();
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getKey().length() == maxLength){
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
        }
    }
}
