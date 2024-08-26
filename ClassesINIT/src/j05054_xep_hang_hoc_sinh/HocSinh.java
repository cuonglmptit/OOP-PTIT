/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05054_xep_hang_hoc_sinh;

/**
 *
 * @author DarkShadowDemon200x
 */
public class HocSinh implements Comparable<HocSinh>{
    private String ten, maHS, xepLoai;
    private float gpa;
    private int xepHang;
    
    public HocSinh(int i, String ten, float gpa) {
        this.maHS = "HS"+String.format("%02d", i);
        this.ten = ten;
        this.gpa = gpa;
        this.xepLoai = tinhXepLoai(gpa);
    }

    public int getXepHang() {
        return this.xepHang;
    }
    
    public HocSinh(HocSinh a){
        this.maHS = a.maHS;
        this.ten = a.ten;
        this.gpa = a.gpa;
        this.xepLoai = a.xepLoai;
    }
    private String tinhXepLoai(float gpa) {
        if(gpa < 5) return "Yeu";
        else if(gpa < 7) return "Trung Binh";
        else if(gpa < 9) return "Kha";
        return "Gioi";
    }

    public void setXepHang(int xepHang) {
        this.xepHang = xepHang;
    }

    public float getGpa() {
        return this.gpa;
    }
    
    @Override
    public String toString(){
        return this.maHS+" "+this.ten+" "+String.format("%.1f", this.gpa)+" "+this.xepLoai+" "+this.xepHang;
    }

    @Override
    public int compareTo(HocSinh o) {
        if(this.gpa > o.gpa) return -1;
        if(this.gpa < o.gpa) return 1;
        return 0;
    }
}
