/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05077_tinh_luong;

/**
 *
 * @author DarkShadowDemon200x
 */
public class NhanVien {
    private String maNV, tenNV, phongBan;
    private double luongCB, luongThang;
    private int ngayCong;

    public NhanVien(String maNV, String tenNV, double luongCB, int ngayCong) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.luongCB = luongCB;
        this.ngayCong = ngayCong;
        this.phongBan = PhongBan.getTenPB(maNV.substring(maNV.length()-2));
        this.luongThang = tinhLuong();
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

    private double tinhLuong() {
        return this.luongCB*this.ngayCong*heSoNhan(this.maNV)*1000;
    }
    @Override
    public String toString(){
        return this.maNV+" "+this.tenNV+" "+this.phongBan+" "+String.format("%.0f", this.luongThang);
    }
}
