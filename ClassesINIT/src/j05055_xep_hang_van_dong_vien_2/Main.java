/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05055_xep_hang_van_dong_vien_2;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author DarkShadowDemon200x
 */
public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<VanDongVien> ds = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            VanDongVien tmp = new VanDongVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            ds.add(tmp);
        }
        Collections.sort(ds);
        ds.get(0).setXepHang(1);
        int lastXepHang = 1;
        for (int i = 1; i < ds.size(); i++) {
            if(ds.get(i-1).getThanhTichXepHang().equals(ds.get(i).getThanhTichXepHang())){
                ds.get(i).setXepHang(lastXepHang);
            }else{
                ds.get(i).setXepHang(i+1);
                lastXepHang = i+1;
            }
        }
        for (VanDongVien vdv : ds) {
            System.out.println(vdv);
        }
    }
}
