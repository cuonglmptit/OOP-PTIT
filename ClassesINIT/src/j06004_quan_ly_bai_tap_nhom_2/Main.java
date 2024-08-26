/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j06004_quan_ly_bai_tap_nhom_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author DarkShadowDemon200x
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        SinhVien tmp = new SinhVien("SV1", "LMC", "0099", 1);
        ArrayList<BaiTap> dsbt = new ArrayList<>();
        ArrayList<SinhVien> dssv = new ArrayList<>();
        String[] mn = sc.nextLine().split(" ");
        int n = Integer.parseInt(mn[0]), m = Integer.parseInt(mn[1]);
        for (int i = 0; i < m; i++) {
            BaiTap tmp = new BaiTap(i+1);
            dsbt.add(tmp);
        }
        for (int i = 0; i < n; i++) {
            SinhVien tmp = new  SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine());
            tmp.setBaiTap(dsbt.get(Integer.parseInt(sc.nextLine())-1));
            dssv.add(tmp);
        } 
        for (BaiTap baiTap : dsbt) {
            baiTap.setTenBT(sc.nextLine());
        }
        Collections.sort(dssv);
        for (SinhVien sv : dssv) {
            System.out.println(sv);
        }
    }
}
