/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lichgiangdaytheomonhoc;

/**
 *
 * @author cle13
 */
public class LichGiangDay implements Comparable<LichGiangDay>{
    private String maNhom, maMon, hoTenGV, phongHoc; 
    private int ngayGiangDay, kip;

    public LichGiangDay(int n, String maMon, int ngayGiangDay, int kip, String hoTenGV, String phongHoc) {
        this.maNhom = "HP" + String.format("%03d", n);
        this.maMon = maMon;
        this.hoTenGV = hoTenGV;
        this.phongHoc = phongHoc;
        this.ngayGiangDay = ngayGiangDay;
        this.kip = kip;
    }

    @Override
    public int compareTo(LichGiangDay o) {
        if(this.ngayGiangDay > o.ngayGiangDay) return 1;
        if(this.ngayGiangDay < o.ngayGiangDay) return -1;
        if(this.kip > o.kip) return 1;
        if(this.kip < o.kip) return -1;
        return this.hoTenGV.compareTo(o.hoTenGV);
    }
    @Override
    public String toString(){
        return maNhom+" " +ngayGiangDay+" "+kip+" "+hoTenGV+" "+phongHoc;
    }

    public String getMaMon() {
        return maMon;
    }
}
