/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lichgiangdaytheomonhoc;

import java.io.*;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author cle13
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner mon = new Scanner(new File("MONHOC.in"));
        Scanner lich = new Scanner(new File("LICHGD.in"));
        int somon = Integer.parseInt(mon.nextLine());
        ArrayList<MonHoc> dsmh = new ArrayList<>();
        for(int i = 0; i < somon; i++){
            MonHoc tmp = new MonHoc(mon.nextLine(), mon.nextLine(), mon.nextLine());
            dsmh.add(tmp);
        }
        int solich = Integer.parseInt(lich.nextLine());
        ArrayList<LichGiangDay> dslgd = new ArrayList<>();
        for (int i = 1; i <= solich; i++) {
            LichGiangDay tmp = new LichGiangDay(i, lich.nextLine(), Integer.parseInt(lich.nextLine()), Integer.parseInt(lich.nextLine()), lich.nextLine(), lich.nextLine());
            dslgd.add(tmp);
        }
        Collections.sort(dslgd);
        Map<String, String> tentheoma = new HashMap<>();
        for (MonHoc i : dsmh) {
            tentheoma.put(i.getmID(), i.getTenMH());
        }
        String mamoncanlietke = lich.nextLine();
        System.out.println("LICH GIANG DAY MON "+tentheoma.get(mamoncanlietke)+":");
        for (LichGiangDay lichGiangDay : dslgd) {
            if(lichGiangDay.getMaMon().equals(mamoncanlietke)){
                System.out.println(lichGiangDay);
            }
        }
    }
}
