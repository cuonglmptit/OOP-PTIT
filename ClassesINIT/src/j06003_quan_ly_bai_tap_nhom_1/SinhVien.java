/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j06003_quan_ly_bai_tap_nhom_1;

/**
 *
 * @author DarkShadowDemon200x
 */
public class SinhVien {
    private String maSV, tenSV, soDT;

    public SinhVien(String maSV, String tenSV, String soDT) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.soDT = soDT;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }
    
    @Override
    public String toString(){
        return maSV+" "+tenSV+" "+soDT;
    }
}
