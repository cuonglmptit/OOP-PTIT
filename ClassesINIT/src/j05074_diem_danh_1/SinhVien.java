/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05074_diem_danh_1;

import java.util.HashMap;

/**
 *
 * @author DarkShadowDemon200x
 */
public class SinhVien {

    private String ma, hoten, lop;
    private int cc;
    private static HashMap<String, SinhVien> map = new HashMap<>();
    public SinhVien(String ma, String hoten, String lop) {
        this.ma = ma;
        this.hoten = hoten;
        this.lop = lop;
        map.put(ma, this);
    }
    
    public static void tinhDiem(String s){
        String[] tmp = s.split(" ");
        map.get(tmp[0]).tinhCC(tmp[1]);
    }
    
    private void tinhCC(String s){
        int diem = 10;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'm') diem -= 1;
            if(s.charAt(i) == 'v') diem -= 2;
        }
        this.cc = Math.max(diem, 0);
    }

    @Override
    public String toString() {
        if(cc != 0) return ma + " " + hoten + " " + lop + " " + cc;
        else return ma + " " + hoten + " " + lop + " " + cc + " KDDK";
    }
    
}
