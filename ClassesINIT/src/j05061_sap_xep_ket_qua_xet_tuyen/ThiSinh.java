/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05061_sap_xep_ket_qua_xet_tuyen;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author DarkShadowDemon200x
 */
public class ThiSinh implements Comparable<ThiSinh>{
    private String maTS, tenTS, xepLoai;
    private Date ngaySinh;
    private float diemLT, diemTH, diemTB, diemTotal, diemBonus;
    private int tuoiTS;
    public ThiSinh(int n, String tenTS, String ngaySinh, float diemLT, float diemTH) throws ParseException {
        this.maTS = "PH"+String.format("%02d", n);
        this.tenTS = tenTS;
        this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinh);
        this.tuoiTS = 121 - this.ngaySinh.getYear();
        this.diemLT = diemLT;
        this.diemTH = diemTH;
        this.diemTB = (float) ((diemLT+diemTH)/2.0);
        if(diemLT < 8 || diemTH < 8){
            if(diemLT < 7.5 || diemTH < 7.5) diemBonus = 0;
            else diemBonus = (float) 0.5;
        }else diemBonus = 1;
        this.diemTotal = tinhTotal();
        setXepLoai();
    }

    public void setXepLoai() {
        if(this.diemTotal < 5){
            this.xepLoai = "Truot";
        }else if(this.diemTotal <= 6){
            this.xepLoai = "Trung binh";
        }else if(this.diemTotal <= 7){
            this.xepLoai = "Kha";
        }else if(this.diemTotal <= 8){
            this.xepLoai = "Gioi";
        }else{
            this.xepLoai = "Xuat sac";
        }
    }

    public float tinhTotal() {
        float tmp = (float) ((float) this.diemTB + (float) diemBonus);
        if (tmp - (int) tmp >= 0.5) {
            tmp = (int) tmp + 1;
        } else {
            tmp = (int) tmp;
        }
        if(tmp >= 10) tmp = 10;
        return tmp;
    }
    
    @Override
    public String toString(){
        return this.maTS+" "+this.tenTS+" "+this.tuoiTS+" "+String.format("%.0f", this.diemTotal)+" "+this.xepLoai;
    }

    @Override
    public int compareTo(ThiSinh o) {
        if(this.diemTotal > o.diemTotal) return -1;
        if(this.diemTotal < o.diemTotal) return 1;
        return this.maTS.compareTo(o.maTS);
    }
    
}
