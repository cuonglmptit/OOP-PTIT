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
public class NhanVien {
    private String maNV, tenNV, phongBan;
    private double luongCB;
    private int ngayCong;
    private static HashMap<String, ArrayList<NhanVien>> map = new HashMap<>();
    public NhanVien(String maNV, String tenNV, double luongCB, int ngayCong) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.luongCB = luongCB;
        this.ngayCong = ngayCong;
        String phong = maNV.substring(maNV.length()-2);
        if(map.containsKey(phong)){
            map.get(phong).add(this);
        }else{
            map.put(phong, new ArrayList<>());
            map.get(phong).add(this);
        }
    }
    
    public static ArrayList<NhanVien> getNhanVienByPhongBan(String phongban){
        return map.get(phongban);
    }
    
    private int heSoNhan(String maNV){
        String loaiNV = maNV.substring(0, 1);
        int soNam = Integer.parseInt(maNV.substring(1, 3));
        if(loaiNV.equals("A")){
            if(soNam <= 3) return 10;
            else if(soNam <= 8) return 12;
            else if(soNam <= 15) return 14;
            else return 20;
        }else if(loaiNV.equals("B")){
            if(soNam <= 3) return 10;
            else if(soNam <= 8) return 11;
            else if(soNam <= 15) return 13;
            else return 16;
        }else if(loaiNV.equals("C")){
            if(soNam <= 3) return 9;
            else if(soNam <= 8) return 10;
            else if(soNam <= 15) return 12;
            else return 14;
        }else{
            if(soNam <= 3) return 8;
            else if(soNam <= 8) return 9;
            else if(soNam <= 15) return 11;
            else return 13;
        }
    }

    private double tinhLuongThang() {
        return this.luongCB*this.ngayCong*heSoNhan(this.maNV)*1000;
    }
    @Override
    public String toString(){
        return this.maNV+" "+this.tenNV+" "+String.format("%.0f", tinhLuongThang());
    }
}
