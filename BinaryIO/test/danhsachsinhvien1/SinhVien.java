package danhsachsinhvien1;

import java.text.*;
import java.io.*;
import java.util.*;

public class SinhVien{
    private String ma,ten,lop;
    private Date ngaysinh;
    private float gpa;
    public SinhVien(int ma, String ten, String lop, String ns, float gpa) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.ma = "B20DCCN"+String.format("%03d", ma);
        this.ten = ten;
        this.lop = lop;
        this.ngaysinh = sdf.parse(ns);
        this.gpa = gpa;
    }
    @Override
    public String toString(){
       return ma+" "+ten+" "+lop+" "+new SimpleDateFormat("dd/MM/yyyy").format(ngaysinh)+" "+String.format("%.2f", gpa);
    }
}
