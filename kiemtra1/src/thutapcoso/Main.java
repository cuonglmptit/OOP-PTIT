/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thutapcoso;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author DarkShadowDemon200x
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sv = new Scanner(new File("SINHVIEN.in"));
        Scanner dt = new Scanner(new File("DETAI.in"));
        Scanner nv = new Scanner(new File("NHIEMVU.in"));
        int n = Integer.parseInt(sv.nextLine());
        ArrayList<SinhVien> ds = new ArrayList<>();
        Map<String, SinhVien> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            SinhVien tmp = new SinhVien(sv.nextLine(), sv.nextLine(), sv.nextLine(), sv.nextLine());
            ds.add(tmp);
            map.put(tmp.getMaSV(), tmp);
        }
        int n1 = Integer.parseInt(dt.nextLine());
        for (int i = 1; i <= n1; i++) {
            DeTai tmp = new DeTai(i, dt.nextLine(), dt.nextLine());
        }
        int n2 = Integer.parseInt(nv.nextLine());
        for (int i = 1; i <= n2; i++) {
            String[] tmp = nv.nextLine().split(" ");
            map.get(tmp[0]).setDeTai(DeTai.getMapTen().get(tmp[1]), DeTai.getMapDT().get(tmp[1]));
        }
        Collections.sort(ds);
        for (SinhVien d : ds) {
            System.out.println(d);
        }
    }
}
