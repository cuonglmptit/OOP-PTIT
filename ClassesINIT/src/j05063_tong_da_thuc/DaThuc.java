/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05063_tong_da_thuc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author DarkShadowDemon200x
 */
class DaThuc {
    private String dathuc;

    public DaThuc(String dathuc) {
        this.dathuc = dathuc;
    }
    private static HashMap<String, Integer> sortedByKeyDesc(HashMap<String, Integer> hm){
        List<Map.Entry<String, Integer>> list = new LinkedList<>(hm.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>(){
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2){
                int somu1 = Integer.parseInt(o1.getKey().substring(2));
                int somu2 = Integer.parseInt(o2.getKey().substring(2));
                if(somu1 > somu2) return -1;
                if(somu1 < somu2) return 1;
                return 0;
            }
        });
        HashMap<String, Integer> temp = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
    public DaThuc cong(DaThuc b){
        String[] tmp = b.dathuc.split("[+]");
        HashMap<String, Integer> m = new HashMap<>();
        for (String s : tmp) {
            String[] tach = s.trim().split("[*]");
            if(m.containsKey(tach[1])){
                m.put(tach[1], m.get(tach[1])+Integer.parseInt(tach[0]));
            }else{
                m.put(tach[1], Integer.parseInt(tach[0]));
            }
        }
        tmp = this.dathuc.split("[+]");
        for (String s : tmp) {
            String[] tach = s.trim().split("[*]");
            if(m.containsKey(tach[1])){
                m.put(tach[1], m.get(tach[1])+Integer.parseInt(tach[0]));
            }else{
                m.put(tach[1], Integer.parseInt(tach[0]));
            }
        }
        String ress = "";
        HashMap<String, Integer> reverseSortedMap = sortedByKeyDesc(m);
//        reverseSortedMap.putAll(m);
        for (Map.Entry<String, Integer> entry : reverseSortedMap.entrySet()) {
            if(!entry.getValue().equals(0)){
                ress += entry.getValue()+"*"+entry.getKey()+" + ";
            }
        }
        DaThuc res = new DaThuc(ress.substring(0, ress.length()-3));
        return res;
    }
    public String toString(){
        return this.dathuc;
    }
}
