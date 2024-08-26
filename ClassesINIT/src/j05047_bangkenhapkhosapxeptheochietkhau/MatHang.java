/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05047_bangkenhapkhosapxeptheochietkhau;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author cle13
 */
public class MatHang implements Comparable<MatHang>{
    private String maMH, tenMH;
    private int soLuong;
    private double donGia, chietKhau, thanhTien;
    private static Map<String, Integer> tatCaMH = new HashMap<>();
    public MatHang(String tenMH, int soLuong, double donGia) {
        this.maMH = vietTat(tenMH);
        this.tenMH = tenMH;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chietKhau = tinhChietKhau(donGia, soLuong);
        this.thanhTien = tinhThanhTien(donGia, soLuong, this.chietKhau);
    }
    private String vietTat(String s){
        String[] tmp = s.split(" ");
        String vt = String.valueOf(tmp[0].charAt(0)).toUpperCase()+String.valueOf(tmp[1].charAt(0)).toUpperCase();
        if(tatCaMH.containsKey(vt)){
            tatCaMH.put(vt, tatCaMH.get(vt)+1);
            return vt+String.format("%02d", tatCaMH.get(vt));
        }else{
            tatCaMH.put(vt, 1);
            return vt+String.format("%02d", tatCaMH.get(vt));
        }
    }

    private double tinhChietKhau(double donGia, int soLuong) {
        double pChietKhau = 0;
        if(soLuong > 10) pChietKhau = (double) 5/100;
        else if(soLuong >= 8) pChietKhau = (double) 2/100;
        else if(soLuong >= 5) pChietKhau = (double) 1/100;
        else pChietKhau = 0;
        return donGia*soLuong*pChietKhau;
    }

    private double tinhThanhTien(double donGia, int soLuong, double chietKhau) {
        return donGia*soLuong - chietKhau;
    }
    
    @Override
    public String toString(){
        return this.maMH+" "+this.tenMH+" "+String.format("%.0f", this.chietKhau)+" "
                +String.format("%.0f", this.thanhTien);
    }

    @Override
    public int compareTo(MatHang o) {
        if(this.chietKhau > o.chietKhau) return -1;
        if(this.chietKhau < o.chietKhau) return 1;
        return 0;
    }
}
