/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05078_bang_luong_theo_phong_ban;

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
        for (int i = 0; i < nNV; i++) {
            new NhanVien(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Integer.parseInt(sc.nextLine()));
        }
        PhongBan.InDsByPhongBan(sc.nextLine());
    }
}
