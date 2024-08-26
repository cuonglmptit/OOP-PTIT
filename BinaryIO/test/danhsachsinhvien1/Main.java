package danhsachsinhvien1;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
            ObjectInputStream oi = new ObjectInputStream( new FileInputStream("SV.in"));
            ArrayList<SinhVien> arr = (ArrayList<SinhVien>)oi.readObject();
            oi.close();
            for(SinhVien x : arr){
                System.out.println(x);
            }
    }
}
