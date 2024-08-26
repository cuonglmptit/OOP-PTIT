/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05076_nhap_xuat_hang;

import java.util.HashMap;

/**
 *
 * @author DarkShadowDemon200x
 */
public class MatHang {
    private String ma, ten, xeploai;
    private static HashMap<String, MatHang> map = new HashMap<>();
    public MatHang(String ma, String ten, String xeploai) {
        this.ma = ma;
        this.ten = ten;
        this.xeploai = xeploai;
        map.put(ma, this);
    }
    
    public double laiXuatKyVong(){
        switch (this.xeploai) {
            case "A":
                return 0.08;
            case "B":
                return 0.05;
            default:
                return 0.02;
        }
    }
    
    public static MatHang getMatHang(String ma){
        return map.get(ma);
    }

    @Override
    public String toString() {
        return ma+" "+ten;
    }
}
