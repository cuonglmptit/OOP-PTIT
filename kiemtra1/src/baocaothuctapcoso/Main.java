/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baocaothuctapcoso;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author DarkShadowDemon200x
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sv = new Scanner(new File("SINHVIEN.in"));
        Scanner dt = new Scanner(new File("DETAI.in"));
        Scanner hd = new Scanner(new File("HOIDONG.in"));
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
        int n2 = Integer.parseInt(hd.nextLine());
        Map<String, ArrayList<SinhVien>> map1 = new TreeMap<>();
        for (int i = 1; i <= n2; i++) {
            String[] tmp = hd.nextLine().split(" ");
            map.get(tmp[0]).setDeTai(DeTai.getMapTen().get(tmp[1]), DeTai.getMapDT().get(tmp[1]));
            if(map1.get(tmp[2]) == null){
                map1.put(tmp[2], new ArrayList<>());
                map1.get(tmp[2]).add(map.get(tmp[0]));
            }else {
                map1.get(tmp[2]).add(map.get(tmp[0]));
            }
            
        }
        for (Map.Entry<String, ArrayList<SinhVien>> entry : map1.entrySet()) {
            System.out.println("DANH SACH HOI DONG "+entry.getKey().substring(entry.getKey().length()-1)+":");
            Collections.sort(entry.getValue());
            for (SinhVien sinhVien : entry.getValue()) {
                System.out.println(sinhVien);
            }
        }
        if(map1.size()<8){
            for (int i = map1.size()+1; i <= 8; i++) {
                System.out.println("DANH SACH HOI DONG "+i+":");
            }
        }
    }
}
