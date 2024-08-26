/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05052_tra_cuu_don_hang;

/**
 *
 * @author DarkShadowDemon200x
 */
public class MatHang {
    private String tenMH, maMH;
    private float donGia, giamGia, thanhTien;
    private int soLuong;
    public MatHang(String tenMH, String maMH, float donGia, int soLuong) {
        this.tenMH = tenMH;
        this.maMH = maMH;
        this.donGia = donGia;
        this.soLuong = soLuong;
        tinhToan();
    }

    private void tinhToan() {
        if(maMH.charAt(maMH.length()-1) == '1') this.giamGia = (float) (0.5*this.donGia*this.soLuong);
        else this.giamGia = (float) (0.3*this.donGia*this.soLuong);
        this.thanhTien = this.soLuong*this.donGia - this.giamGia;
    }
    
    @Override
    public String toString(){
        return this.tenMH+" "+this.maMH+" "+this.maMH.substring(1, 4)+" "
                +String.format("%.0f", this.giamGia)+" "+String.format("%.0f", this.thanhTien);
    }
}
