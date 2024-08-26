/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05067_quan_ly_kho_xang_dau;

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
        ArrayList<SanPham> ds = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] tmp = sc.nextLine().split(" ");
            ds.add(new SanPham(tmp[0], Integer.parseInt(tmp[1])));
        }
        for (SanPham d : ds) {
            System.out.println(d);
        }
    }
}
