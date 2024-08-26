/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05048_bang_theo_doi_nhap_xuat_hang;

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
        ArrayList<MatHang> ds = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            MatHang tmp = new MatHang(sc.nextLine(), Integer.parseInt(sc.nextLine()));
            ds.add(tmp);
        }
        for (MatHang mh : ds) {
            System.out.println(mh);
        }
    }
}
