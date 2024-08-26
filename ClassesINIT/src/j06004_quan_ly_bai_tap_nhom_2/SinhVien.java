/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j06004_quan_ly_bai_tap_nhom_2;

/**
 *
 * @author DarkShadowDemon200x
 */
public class SinhVien implements Comparable<SinhVien>{
    private String maSV, tenSV, soDT;
    private BaiTap bt;
    public SinhVien(String maSV, String tenSV, String soDT) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.soDT = soDT;
    }

    public void setBaiTap(BaiTap bt) {
        this.bt = bt;
    }
    
    @Override
    public String toString(){
        return maSV+" "+tenSV+" "+soDT+" "+this.bt;
    }

    public BaiTap getBt() {
        return bt;
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.maSV.compareTo(o.maSV);
    }
}
