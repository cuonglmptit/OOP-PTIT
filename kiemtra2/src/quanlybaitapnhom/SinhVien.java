/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlybaitapnhom;

/**
 *
 * @author DarkShadowDemon200x
 */
public class SinhVien implements Comparable<SinhVien>{

    private String ma, ten, sdt;
    private BaiTap bt;
    public SinhVien(String ma, String ten, String sdt) {
        this.ma = ma;
        this.ten = ten;
        this.sdt = sdt;
    }
    @Override
    public String toString(){
        return ma+" "+ten+" "+sdt+" "+bt;
    }

    public void setBt(BaiTap bt) {
        this.bt = bt;
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.ma.compareTo(o.ma);
    }
}
