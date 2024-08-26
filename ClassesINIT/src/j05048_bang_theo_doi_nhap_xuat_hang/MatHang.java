/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05048_bang_theo_doi_nhap_xuat_hang;

/**
 *
 * @author DarkShadowDemon200x
 */
public class MatHang {
    private String maMH;
    private int soLuongNhap, soLuongXuat;
    private double donGia, tien, thue;
    public MatHang(String maMH, int soLuongNhap) {
        this.maMH = maMH;
        this.soLuongNhap = soLuongNhap;
        tinhTatCa(maMH, soLuongNhap);
    }

    private void tinhTatCa(String maMH, int soLuongNhap) {
        if(maMH.charAt(0) == 'A') this.soLuongXuat = (int) Math.round(soLuongNhap*0.6);
        else this.soLuongXuat = (int) Math.round(soLuongNhap*0.7);
        if(maMH.charAt(maMH.length()-1) == 'Y') this.donGia = 110000;
        else this.donGia = 135000;
        this.tien = this.soLuongXuat*this.donGia;
        if(maMH.charAt(0) == 'A' && maMH.charAt(maMH.length()-1) == 'Y'){
            this.thue = 0.08*this.tien;
        }else if(maMH.charAt(0) == 'A' && maMH.charAt(maMH.length()-1) == 'N'){
            this.thue = 0.11*this.tien;
        }else if(maMH.charAt(0) == 'B' && maMH.charAt(maMH.length()-1) == 'Y'){
            this.thue = 0.17*this.tien;
        }else{
            this.thue = 0.22*this.tien;
        }
    }
    @Override
    public String toString(){
        return maMH+" "+soLuongNhap+" "+soLuongXuat+" "+String.format("%.0f", donGia)+" "+String.format("%.0f", tien)
                +" "+String.format("%.0f", thue);
    }
}
