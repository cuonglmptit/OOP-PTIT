/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05082_danh_sach_khach_hang;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

/**
 *
 * @author DarkShadowDemon200x
 */
public class KhachHang implements Comparable<KhachHang>{
    private String makh, ten, gioitinh, diachi;
    private Date ngaysinh;

    public KhachHang(int makh, String ten, String gioitinh, String ngaysinh, String diachi) throws ParseException {
        this.makh = "KH"+String.format("%03d", makh);
        this.ten = chuanHoa(ten);
        this.gioitinh = gioitinh;
        this.diachi = diachi;
        this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
    }
    private String chuanHoa(String s){
        StringTokenizer st = new StringTokenizer(s);
        String ten = "";
        while(st.hasMoreTokens()){
            String tmp = st.nextToken().toLowerCase();
            ten += String.valueOf(tmp.charAt(0)).toUpperCase();
            ten += tmp.substring(1);
            if(st.hasMoreTokens()) ten += " ";
        }
        return ten;
    }
    @Override
    public String toString() {
        return makh + " " + ten + " " + gioitinh + " " + diachi + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngaysinh);
    }

    @Override
    public int compareTo(KhachHang o) {
        long tuoi = System.currentTimeMillis() - this.ngaysinh.getTime();
        long tuoio = System.currentTimeMillis() - o.ngaysinh.getTime();
        if(tuoi > tuoio) return -1;
        if(tuoi < tuoio) return 1;
        return 0;
    }
    
    
}
