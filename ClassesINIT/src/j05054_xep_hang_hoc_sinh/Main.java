/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05054_xep_hang_hoc_sinh;

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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<HocSinh> ds = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; i++) {
            HocSinh tmp = new HocSinh(i, sc.nextLine(), Float.parseFloat(sc.nextLine()));
            ds.add(tmp);
        }
        ArrayList<HocSinh> ds1 = (ArrayList<HocSinh>) ds.clone();
        Collections.sort(ds1);
        ds1.get(0).setXepHang(1);
        int rank = 1;
        float lastGpa = -1;
        for (int i = 0; i < ds1.size(); i++) {
            if(ds1.get(i).getGpa() == lastGpa){
                ds1.get(i).setXepHang(rank);
            }else{
                rank = i+1;
                ds1.get(i).setXepHang(rank);
                lastGpa = ds1.get(i).getGpa();
            }
        }
        for (HocSinh d : ds) {
            System.out.println(d);
        }
    }
}
