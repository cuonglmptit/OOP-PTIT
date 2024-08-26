/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05077_tinh_luong;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DarkShadowDemon200x
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nPB = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < nPB; i++) {
            PhongBan tmp = new PhongBan(sc.nextLine());
        }
        int nNV = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> ds = new ArrayList<>();
        for (int i = 0; i < nNV; i++) {
            NhanVien tmp = new NhanVien(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            ds.add(tmp);
        }
        for (NhanVien d : ds) {
            System.out.println(d);
        }
    }
}
