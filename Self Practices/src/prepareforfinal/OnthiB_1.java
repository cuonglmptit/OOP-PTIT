/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package onthib;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
class SanPham{
    String mSP,tenSP;
    int gia,han;

    public SanPham(String mSP, String tenSP, int gia, int han) {
        this.mSP = mSP;
        this.tenSP = tenSP;
        this.gia = gia;
        this.han = han;
    }
    
}
class KhachHang implements Comparable<KhachHang>{
    String maKH,tenKH,dc,maSP;
    int sl;
    long tt;
    Date ngayMua;
    Date ngayHan;
    SanPham sp;
    public KhachHang(int maKH, String tenKH, String dc, String maSP, int sl, String ngayMua,SanPham sp) throws ParseException {
        SimpleDateFormat spd = new SimpleDateFormat("dd/MM/yyyy");
        this.maKH = String.format("KH%02d", maKH);
        this.tenKH = tenKH;
        this.dc = dc;
        this.maSP = maSP;
        this.sl = sl;
        this.ngayMua = spd.parse(ngayMua);
        Calendar c = Calendar.getInstance();
        c.setTime(this.ngayMua);
        c.add(Calendar.MONTH, (int) sp.han);
        ngayHan = spd.parse(spd.format(c.getTime()));
        this.sp = sp;
        tt= sp.gia * sl;
    }

    @Override
    public String toString() {
        return maKH+" "+tenKH+" "+dc+" "+sp.mSP+" "+tt+" "+new SimpleDateFormat("dd/MM/yyyy").format(ngayHan);
    }

    @Override
    public int compareTo(KhachHang o) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        String s1 = new SimpleDateFormat("dd/MM/yyyy").format(this.ngayHan);
        String s2 = new SimpleDateFormat("dd/MM/yyyy").format(o.ngayHan);
        String[] w1 = s1.split("/");
        String[] w2 = s2.split("/");
        String n1 = w1[2]+w1[1]+w1[0];
        String n2 = w2[2]+w2[1]+w2[0];
        if(n1.equals(n2)==false){
            return n1.compareTo(n2);
        }
        return this.maKH.compareTo(o.maKH);
                
    }
    
}
public class OnthiB_1 {
    public static void main(String[] args) throws IOException, ParseException {
        FileReader fr = new FileReader("C:\\Users\\cle13\\Documents\\NetBeansProjects\\Self Practices\\src\\prepareforfinal\\MUAHANG.in");
        BufferedReader bf = new BufferedReader(fr);
        Vector<SanPham> vSP = new Vector<>();
        int t = Integer.parseInt(bf.readLine());
        while(t-->0){
            String maSP = bf.readLine();
            String tenSP = bf.readLine();
            int gia = Integer.parseInt(bf.readLine());
            int han = Integer.parseInt(bf.readLine());
            SanPham sp = new SanPham(maSP, tenSP, gia, han);
            vSP.add(sp);
        }
        int t1 = Integer.parseInt(bf.readLine());
        Vector<KhachHang> vKH = new Vector<>();
        for(int i=1;i<=t1;i++){
            int maKH = i;
            String tenKH = bf.readLine();
            String dc = bf.readLine();
            String maSP = bf.readLine();
            int sl = Integer.parseInt(bf.readLine());
            String ngayMua = bf.readLine();
            SanPham sp = null;
            for(SanPham x : vSP){
                if(maSP.equals(x.mSP)){
                    sp = x;
                    break;
                }
            }
            KhachHang kh = new KhachHang(maKH, tenKH, dc, maSP, sl, ngayMua, sp);
            vKH.add(kh);
                
        }
        Collections.sort(vKH);
        for(KhachHang x : vKH){
            System.out.println(x);
        }
    }
}
