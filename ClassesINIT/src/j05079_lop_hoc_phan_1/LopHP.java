/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05079_lop_hoc_phan_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 *
 * @author DarkShadowDemon200x
 */
public class LopHP implements Comparable<LopHP>{
    private String mamh, ten, nhom, tengv;
    private static HashMap<String, ArrayList<LopHP>> map = new HashMap<>();
    public LopHP(String mamh, String ten, String nhom, String tengv) {
        this.mamh = mamh;
        this.ten = ten;
        this.nhom = nhom;
        this.tengv = tengv;
        if(map.containsKey(mamh)) map.get(mamh).add(this);
        else{
            map.put(mamh, new ArrayList<>());
            map.get(mamh).add(this);
        }
    }

    @Override
    public String toString() {
        return nhom + " " + tengv;
    }
    
    public static void inDanhSachTheoTenLop(String s){
        Collections.sort(map.get(s));
        System.out.println("Danh sach nhom lop mon "+map.get(s).get(0).ten+":");
        for (LopHP lopHP : map.get(s)) {
            System.out.println(lopHP);
        }
    }
    
    @Override
    public int compareTo(LopHP o) {
        return (Integer.parseInt(this.nhom) - Integer.parseInt(o.nhom));
    }
    
    
}
