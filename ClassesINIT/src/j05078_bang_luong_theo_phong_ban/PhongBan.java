/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05078_bang_luong_theo_phong_ban;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author DarkShadowDemon200x
 */
public class PhongBan {
    private static HashMap<String, String> map = new HashMap<>();
    public PhongBan(String s){
        map.put(s.substring(0,2), s.substring(3));
    }
    public static void InDsByPhongBan(String maPB){
        System.out.println("Bang luong phong "+map.get(maPB)+":");
        for (NhanVien nhanVien : NhanVien.getNhanVienByPhongBan(maPB)) {
            System.out.println(nhanVien);
        }
    }
    
}
