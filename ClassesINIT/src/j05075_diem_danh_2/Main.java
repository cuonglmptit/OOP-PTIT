/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05075_diem_danh_2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DarkShadowDemon200x
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> ds = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ds.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        for (int i = 0; i < n; i++) {
           SinhVien.tinhDiem(sc.nextLine());
        }
        String lop = sc.nextLine();
        for (SinhVien sv : ds) {
            if(sv.getLop().equals(lop)) System.out.println(sv);
        }
    }
}
