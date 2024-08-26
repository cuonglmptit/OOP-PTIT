/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j07038_danh_sach_thuc_tap_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 *
 * @author DarkShadowDemon200x
 */
public class DoanhNghiep {
    private String madn, ten;
    private ArrayList<SinhVien> ds = new ArrayList<>();
    private int soluong;
    private static HashMap<String, DoanhNghiep> map = new HashMap<>();
    public DoanhNghiep(String ma, String ten, int soluong) {
        this.madn = madn;
        this.ten = ten;
        this.soluong = soluong;
        map.put(ma, this);
    }
    public static String inDSSVTT(String madn){
        return map.get(madn).toString();
    }
    public static void themSVvaoDN(String madn, SinhVien sv){
        map.get(madn).ds.add(sv);
    }
    @Override
    public String toString(){
        Collections.sort(ds);
        String rs = "";
        int sl = Math.min(this.soluong, ds.size());
        for (int i = 0; i < sl; i++) {
            rs += ds.get(i)+"\n";
        }
        return "DANH SACH THUC TAP TAI "+this.ten+":\n"+rs;
    }
}
