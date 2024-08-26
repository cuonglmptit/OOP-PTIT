/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collections;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.*;

/**
 *
 * @author DarkShadowDemon200x
 */
public class J08011_Liet_Ke_Va_Dem {
    public static boolean isAcs(String s){
        for (int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i) > s.charAt(i+1)) return false;
        }
        return true;
    }
    public static  HashMap<String, Integer> sortedByVal(HashMap<String, Integer> hm){
        List<Map.Entry<String, Integer>> list = new LinkedList<>(hm.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>(){
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2){
                return -o1.getValue().compareTo(o2.getValue());
            }
        });
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map = new LinkedHashMap<>();
        while(sc.hasNext()){
            String tmp = sc.next();
            if(isAcs(tmp)){
                if(map.containsKey(tmp)){
                    map.put(tmp, map.get(tmp)+1);
                }else{
                    map.put(tmp, 1);
                }
            }
        }
        HashMap<String, Integer> hm1 = sortedByVal(map);
        for (Map.Entry<String, Integer> en : hm1.entrySet()) {
            System.out.println(en.getKey()+" "+en.getValue());
        }
    }
}
