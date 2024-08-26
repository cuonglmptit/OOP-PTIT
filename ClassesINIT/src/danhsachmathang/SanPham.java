/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachmathang;

import java.text.*;
/**
 *
 * @author cle13
 */
public class SanPham implements Comparable<SanPham>{
    private String mh = "", name, donvi;
    private int mua, ban, loi_nhuan;
    public SanPham(int i, String name, String donvi, int mua, int ban) throws ParseException{
        this.mh = "MH" + String.format("%03d", i);
        this.name = name;
        this.donvi = donvi;
        this.mua = mua;
        this.ban = ban;
        this.loi_nhuan = ban - mua;
    }
    @Override
    public String toString(){
        return mh + " " + name + " " + donvi + " " + mua + " " + ban + " " + loi_nhuan;
    }
    @Override
    public int compareTo(SanPham o){
        if(this.loi_nhuan > o.loi_nhuan) return -1;
        if(this.loi_nhuan < o.loi_nhuan) return 1;
        return 0;
    }
}