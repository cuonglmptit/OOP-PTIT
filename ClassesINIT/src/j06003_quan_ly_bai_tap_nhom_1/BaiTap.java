/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j06003_quan_ly_bai_tap_nhom_1;

import java.util.ArrayList;

/**
 *
 * @author DarkShadowDemon200x
 */
public class BaiTap {
    private String tenBT;
    private int maNhom;
    private ArrayList<SinhVien> ds = new ArrayList<>();

    public BaiTap(int n) {
        this.maNhom = n;
    }
    public void add(SinhVien a){
        ds.add(a);
    }

    public void setTenBT(String tenBT) {
        this.tenBT = tenBT;
    }

    public ArrayList<SinhVien> getDs() {
        return ds;
    }
    
    @Override
    public String toString(){
        String ds = "";
        for (SinhVien d : this.ds) {
            ds += d +"\n";
        }
        ds += "Bai tap dang ky: "+this.tenBT;
        return "DANH SACH NHOM "+this.maNhom+":\n" + ds;
    }
}
