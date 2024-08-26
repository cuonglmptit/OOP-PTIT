/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thutapcoso;

/**
 *
 * @author DarkShadowDemon200x
 */
public class SinhVien implements Comparable<SinhVien>{
    private String maSV, tenSV, soDT, email, tenGV, deTai;

    public SinhVien(String maSV, String tenSV, String soDT, String email) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.soDT = soDT;
        this.email = email;
    }

    public void setDeTai(String tenGV, String deTai) {
        this.tenGV = tenGV;
        this.deTai = deTai;
    }

    public String getMaSV() {
        return maSV;
    }
    
    @Override
    public String toString(){
        return maSV+" "+tenSV+" "+soDT+" "+email+" "+tenGV+" "+deTai;
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.deTai.compareTo(o.deTai);
    }
}
