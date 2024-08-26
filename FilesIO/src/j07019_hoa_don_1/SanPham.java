/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j07019_hoa_don_1;

import java.util.HashMap;

/**
 *
 * @author DarkShadowDemon200x
 */
public class SanPham {
    private static HashMap<String, SanPham> map = new HashMap<>();
    private String masp, ten;
    private double donGia1, donGia2;

    public SanPham(String masp, String ten, double donGia1, double donGia2) {
        this.masp = masp;
        this.ten = ten;
        this.donGia1 = donGia1;
        this.donGia2 = donGia2;
        map.put(masp, this);
    }
    public static SanPham getSP_BY_ID(String s){
        return map.get(s);
    }
    public double getDonGia1() {
        return donGia1;
    }
    
    public double getDonGia2() {
        return donGia2;
    }

    public String getTen() {
        return ten;
    }
    
    
}
