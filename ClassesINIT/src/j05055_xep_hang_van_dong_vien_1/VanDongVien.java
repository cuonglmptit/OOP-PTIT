/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05055_xep_hang_van_dong_vien_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author DarkShadowDemon200x
 */
public class VanDongVien implements Comparable<VanDongVien>{
    private String tenVDV, maVDV;
    private Date ngaySinh, xuatPhat, denDich, thanhTichThucTe, thanhTichXepHang, uuTien;
    private int tuoiVDV, xepHang;
    public VanDongVien(int n, String tenVDV, String ngaySinh, String xuatPhat, String denDich) throws ParseException {
        this.maVDV = "VDV" +String.format("%02d", n);
        this.tenVDV = tenVDV;
        this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinh);
        this.xuatPhat = new SimpleDateFormat("HH:mm:ss").parse(xuatPhat);
        this.denDich = new SimpleDateFormat("HH:mm:ss").parse(denDich);
        this.tuoiVDV = 121-this.ngaySinh.getYear();
        this.uuTien = tinhUuTien();
        this.thanhTichThucTe = tinhTTTT();
        this.thanhTichXepHang = tinhTTXH();
    }

    public void setXepHang(int xepHang) {
        this.xepHang = xepHang;
    }

    public Date getThanhTichXepHang() {
        return thanhTichXepHang;
    }

    private Date tinhTTTT() throws ParseException {
        long time = Math.abs(this.denDich.getTime() - this.xuatPhat.getTime());
        long hh = TimeUnit.MILLISECONDS.toHours(time);
        long mm = TimeUnit.MILLISECONDS.toMinutes(time) -  
            TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(time));
        long ss = TimeUnit.MILLISECONDS.toSeconds(time) - 
            TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(time));
        return new SimpleDateFormat("HH:mm:ss").parse(hh+":"+mm+":"+ss);
    }

    private Date tinhTTXH() throws ParseException {
        long time = Math.abs(this.denDich.getTime() - this.xuatPhat.getTime());
        time = Math.abs(time - TimeUnit.SECONDS.toMillis(this.uuTien.getSeconds()));
        long hh = TimeUnit.MILLISECONDS.toHours(time);
        long mm = TimeUnit.MILLISECONDS.toMinutes(time) -  
            TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(time));
        long ss = TimeUnit.MILLISECONDS.toSeconds(time) - 
            TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(time));
        return new SimpleDateFormat("HH:mm:ss").parse(hh+":"+mm+":"+ss);
    }
    private Date tinhUuTien() throws ParseException {
        if(this.tuoiVDV >= 32){
            return new SimpleDateFormat("HH:mm:ss").parse("00:00:03");
        }else if(this.tuoiVDV >= 25){
            return new SimpleDateFormat("HH:mm:ss").parse("00:00:02");
        }else if(this.tuoiVDV >= 18){
            return new SimpleDateFormat("HH:mm:ss").parse("00:00:01");
        }
        return new SimpleDateFormat("HH:mm:ss").parse("00:00:00");
    }
    @Override
    public int compareTo(VanDongVien o) {
        return this.thanhTichXepHang.compareTo(o.thanhTichXepHang);
    }
    @Override
    public String toString(){
        return this.maVDV+" "+this.tenVDV+" "
                +new SimpleDateFormat("HH:mm:ss").format(this.thanhTichThucTe)+" "
                +new SimpleDateFormat("HH:mm:ss").format(this.uuTien)+" "
                +new SimpleDateFormat("HH:mm:ss").format(this.thanhTichXepHang)+" "
                +this.xepHang;
    }

    
}
