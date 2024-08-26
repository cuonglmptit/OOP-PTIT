/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlybaitapnhom;

/**
 *
 * @author DarkShadowDemon200x
 */
public class BaiTap {
    private String ten;
    private int nhom;

    public BaiTap(String ten, int nhom) {
        this.ten = ten;
        this.nhom = nhom;
    }
    @Override
    public String toString(){
        return this.nhom+" "+this.ten;
    }
}
