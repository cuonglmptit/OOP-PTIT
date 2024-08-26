/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiemtra2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author DarkShadowDemon200x
 */
public class Sap_Xep_Theo_Thu_Tu_Xuat_Hien {

    public static HashMap<Integer, Integer> sortedByKeyDesc(LinkedHashMap<Integer, Integer> hm) {
        List<Map.Entry<Integer, Integer>> list = new LinkedList<>(hm.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                if (o1.getValue() > o2.getValue()) {
                    return -1;
                }
                if (o1.getValue() < o2.getValue()) {
                    return 1;
                }
                return 0;
            }
        });
        LinkedHashMap<Integer, Integer> tmp = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> entry : list) {
            tmp.put(entry.getKey(), entry.getValue());
        }
        return tmp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
            ArrayList<Integer> ds = new ArrayList<>();
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int tmp = sc.nextInt();
                if (map.containsKey(tmp)) {
                    map.put(tmp, map.get(tmp) + 1);
                } else {
                    map.put(tmp, 1);
                }
            }
            HashMap<Integer, Integer> sorted = sortedByKeyDesc(map);
            for (Map.Entry<Integer, Integer> entry : sorted.entrySet()) {
                for (int i = 0; i < entry.getValue(); i++) {
                    System.out.print(entry.getKey() + " ");
                }
            }
            System.out.println("");
        }
    }
}
