/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05051_sap_xep_bang_tinh_tien_dien;

/**
 *
 * @author DarkShadowDemon200x
 */
public class TienDien implements Comparable<TienDien>{
    private String loaiSD, maKH;
    private long csCu, csMoi, heSo;
    private double phuTroi, thanhTien, tongTien;
    public TienDien(int i, String loaiSD, long csCu, long csMoi) {
        this.maKH = "KH"+String.format("%02d", i);
        this.loaiSD = loaiSD;
        this.csCu = csCu;
        this.csMoi = csMoi;
        tinhToan();
    }

    private void tinhToan() {
        if(this.loaiSD.equals("KD")) this.heSo = 3;
        else if(this.loaiSD.equals("NN")) this.heSo = 5;
        else if(this.loaiSD.equals("TT")) this.heSo = 4;
        else this.heSo = 2;
        this.thanhTien = (this.csMoi - this.csCu)*this.heSo*550;
        if(this.csMoi - this.csCu < 50) this.phuTroi = 0;
        else if(this.csMoi - this.csCu <= 100) this.phuTroi = (double) (this.thanhTien*35/100.0);
        else this.phuTroi = this.thanhTien;
        this.tongTien = this.phuTroi + this.thanhTien;
    }
     @Override
     public String toString(){
         return this.maKH+" "+this.heSo+" "+String.format("%.0f", this.thanhTien)+" "
                 +String.format("%.0f", this.phuTroi)+" "+String.format("%.0f", this.tongTien);
     }

    @Override
    public int compareTo(TienDien o) {
        return (int) (o.tongTien - this.tongTien);
    }
}
