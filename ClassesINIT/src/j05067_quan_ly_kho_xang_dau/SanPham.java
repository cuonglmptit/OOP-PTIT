/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05067_quan_ly_kho_xang_dau;

/**
 *
 * @author DarkShadowDemon200x
 */
public class SanPham {

    private String ma;
    private int soluong;

    public SanPham(String ma, int soluong) {
        this.ma = ma;
        this.soluong = soluong;
    }

    private static double donGia(SanPham sp) {
        switch (sp.ma.charAt(0)) {
            case 'X':
                return 128000;
            case 'D':
                return 11200;
            default:
                return 9700;
        }
    }
    
    private static double noVATprice(SanPham sp){
        return sp.soluong*donGia(sp);
    }
    
    private static double thue(SanPham sp){
        if(sp.ma.substring(sp.ma.length()-2).equals("TN")) return 0;
        else{
            switch (sp.ma.substring(0,1)) {
                case "X":
                    return (double) noVATprice(sp)*0.03;
                case "D":
                    return (double) noVATprice(sp)*0.035;
                default:
                    return (double) noVATprice(sp)*0.02;
            }
        }
    }
    private static double thanhTien(SanPham sp){
        return thue(sp) + noVATprice(sp);
    }
    private static String hangSX(SanPham sp){
        String viettat = sp.ma.substring(sp.ma.length()-2);
        switch (viettat) {
            case "BP":
                return "British Petro";
            case "ES":
                return "Esso";
            case "SH":
                return "Shell";
            case "CA":
                return "Castrol";
            case "MO":
                return "Mobil";
            default:
                return "Trong Nuoc";
        }
    }
    @Override
    public String toString() {
        return ma + " "+ hangSX(this)+" "+String.format("%.0f", donGia(this))+" "+String.format("%.0f", thue(this))+" "+String.format("%.0f", thanhTien(this));
    }
}
