/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author DarkShadowDemon200x
 */
public class J08010_Tim_Tu_Thuan_Nghich_Dai_Nhat {

    public static boolean isThuanNghich(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        int maxLen = 0;
        while (sc.hasNext()) {
            String tmp = sc.next();
            if (tmp.length() >= maxLen) {
                if (isThuanNghich(tmp)) {
                    if (map.containsKey(tmp)) {
                        map.put(tmp, map.get(tmp) + 1);
                    } else {
                        map.put(tmp, 1);
                    }
                    maxLen = tmp.length();
                }
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getKey().length() == maxLen) System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
