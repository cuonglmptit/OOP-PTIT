/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sothuannghichtrongfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author cle13
 */
public class SoThuanNghichTrongFile {
    public static boolean isThuanNghich(Integer n){
        String s = Integer.toString(n);
        if(s.length()%2 == 0 || s.length() <= 1) return false;
        for (int i = 0; i < s.length(); i++) {
            int a = s.charAt(i);
            a -= '0';
            if(a%2 ==  0) return false;
        }
        for (int i = 0; i <= s.length()/2; i++) {
            if(s.charAt(i) != s.charAt(s.length()-1-i)) return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream data1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream data2 = new ObjectInputStream(new FileInputStream("DATA2.in"));  
        ArrayList<Integer> ds1 = (ArrayList<Integer>) data1.readObject();
        ArrayList<Integer> ds2 = (ArrayList<Integer>) data2.readObject();
        SortedMap<Integer, Integer> mapds1 = new TreeMap<>();
        SortedMap<Integer, Integer> mapds2 = new TreeMap<>();
        for (Integer i : ds1) {
            if(isThuanNghich(i)){
                if(mapds1.containsKey(i)) mapds1.put(i, mapds1.get(i)+1);
                else mapds1.put(i, 1);
            }
        }
        for (Integer i : ds2) {
            if(isThuanNghich(i)){
                if(mapds2.containsKey(i)) mapds2.put(i, mapds2.get(i)+1);
                else mapds2.put(i, 1);
            }
        }
        int q = 10;
        for (Map.Entry<Integer, Integer> entry : mapds1.entrySet()) {
            if(mapds2.containsKey(entry.getKey())){
                System.out.println(entry.getKey()+" "+(entry.getValue()+mapds2.get(entry.getKey())));
                q--;
            }
            if(q == 0) break;
        }
    }
}
