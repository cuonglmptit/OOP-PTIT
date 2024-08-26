/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05064_bang_thu_nhap_giao_vien;

/**
 *
 * @author DarkShadowDemon200x
 */
public class GiaoVien {

    private String maNgach, ten;
    private double coban;

    public GiaoVien(String maNgach, String ten, float coban) {
        this.maNgach = maNgach;
        this.ten = ten;
        this.coban = coban;
    }

    private double tinhPhuCap() {
        String chucvu = this.maNgach.substring(0, 2);
        switch (chucvu) {
            case "HT":
                return 2000000;
            case "HP":
                return 900000;
            default:
                return 500000;
        }
    }

    private double tinhThuNhap() {
        int bacluong = Integer.parseInt(this.maNgach.substring(2));
        return this.coban * bacluong + tinhPhuCap();
    }

    @Override
    public String toString() {
        return maNgach + " " + ten + " " + Integer.parseInt(this.maNgach.substring(2))
                + " " + String.format("%.0f", tinhPhuCap()) + " " + String.format("%.0f", tinhThuNhap());
    }

}
