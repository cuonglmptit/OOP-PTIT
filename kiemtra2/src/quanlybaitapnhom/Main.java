/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlybaitapnhom;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Collections;


/**
 *
 * @author DarkShadowDemon200x
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner insv = new Scanner(new File("SINHVIEN.in"));
        Scanner inbt = new Scanner(new File("BAITAP.in"));
        Scanner innhom = new Scanner(new File("NHOM.in"));
        int nsv = Integer.parseInt(insv.nextLine());
        Map<String, SinhVien> dssv = new HashMap<>();
        for (int i = 0; i < nsv; i++) {
            String ma  = insv.nextLine();
            SinhVien tmp = new SinhVien(ma, insv.nextLine(), insv.nextLine());
            dssv.put(ma, tmp);
        }
        Map<Integer, BaiTap> dsbt = new HashMap<>();
        int nbt = Integer.parseInt(inbt.nextLine());
        for (int i = 0; i < nbt; i++) {
            BaiTap tmp = new BaiTap(inbt.nextLine(), i+1);
            dsbt.put(i+1, tmp);
        }
        ArrayList<SinhVien> dsn = new ArrayList<>();
        for (int i = 0; i < nsv; i++) {
            String[] s = innhom.nextLine().split(" ");
            dssv.get(s[0]).setBt(dsbt.get(Integer.parseInt(s[1])));
            dsn.add(dssv.get(s[0]));
        }
        Collections.sort(dsn);
        for (SinhVien sinhVien : dsn) {
            System.out.println(sinhVien);
        }
    }
}
