/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05077_tinh_luong;

import java.util.HashMap;

/**
 *
 * @author DarkShadowDemon200x
 */
public class PhongBan {
    private static HashMap<String, String> map = new HashMap<>();
    public PhongBan(String s){
        String[] tmp = s.split("\\s+");
        String tenPB = "";
        for (int i = 1; i < tmp.length; i++) {
            tenPB += tmp[i] + " ";
        }
        tenPB = tenPB.trim();
        map.put(tmp[0], tenPB);
    }
    public static String getTenPB(String maPB){
        return map.get(maPB);
    }
}
