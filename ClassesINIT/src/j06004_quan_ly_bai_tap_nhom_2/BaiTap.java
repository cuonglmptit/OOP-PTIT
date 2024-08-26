/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j06004_quan_ly_bai_tap_nhom_2;

import java.util.ArrayList;

/**
 *
 * @author DarkShadowDemon200x
 */
public class BaiTap {
    private String tenBT;
    private int maNhom;

    public BaiTap(int n) {
        this.maNhom = n;
    }

    public void setTenBT(String tenBT) {
        this.tenBT = tenBT;
    }
    
    @Override
    public String toString(){
        return this.maNhom+" "+this.tenBT;
    }
}
