/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j07019_hoa_don_1;

/**
 *
 * @author DarkShadowDemon200x
 */
public class HoaDon {
    private String maHD;
    private int loaiDonGia, soluong;
    private SanPham sp;
    public HoaDon(int i, String maHD, int soluong) {
        this.maHD = maHD+String.format("-%03d", i);
        this.loaiDonGia = Integer.parseInt(maHD.substring(maHD.length()-1));
        this.soluong = soluong;
        this.sp = SanPham.getSP_BY_ID(maHD.substring(0,2));
    }
    private double tinhThanhTien() {
        double donGia = 0;
        if(this.loaiDonGia == 1){
            donGia = this.sp.getDonGia1();
        }
        if(this.loaiDonGia == 2){
            donGia = this.sp.getDonGia2();
        }
        return donGia*this.soluong;
    }
    private double tinhGiamGia() {
        if(this.soluong >= 150) return 0.5*tinhThanhTien();
        if(this.soluong >= 100) return 0.3*tinhThanhTien();
        if(this.soluong >= 50) return 0.15*tinhThanhTien();
        return 0;
    }

    private double tinhPhaiTra() {
        return tinhThanhTien() - tinhGiamGia();
    }
    
    @Override
    public String toString(){
        return maHD+" "+sp.getTen()+" "+String.format("%.0f", tinhGiamGia())+" "+String.format("%.0f", tinhPhaiTra());
    }
}
