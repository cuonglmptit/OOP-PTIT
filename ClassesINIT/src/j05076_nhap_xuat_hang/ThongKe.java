/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05076_nhap_xuat_hang;

/**
 *
 * @author DarkShadowDemon200x
 */
public class ThongKe {
    private MatHang mh;
    private int soLuongNhap, donGiaNhap, soLuongXuat;

    public ThongKe(String ma, int soLuongNhap, int donGiaNhap, int soLuongXuat) {
        this.mh = MatHang.getMatHang(ma);
        this.soLuongNhap = soLuongNhap;
        this.donGiaNhap = donGiaNhap;
        this.soLuongXuat = soLuongXuat;
    }
    
    private static double tongGiaTriNhap(ThongKe tk){
        return tk.donGiaNhap*tk.soLuongNhap;
    }
    
    private static double tongGiaTriXuat(ThongKe tk){
        return (tk.donGiaNhap*tk.soLuongXuat) + (tk.donGiaNhap*tk.soLuongXuat*tk.mh.laiXuatKyVong());
    }

    @Override
    public String toString() {
        return mh + " "+ String.format("%.0f", tongGiaTriNhap(this))+" "+String.format("%.0f", tongGiaTriXuat(this));
    }
    
    
}
