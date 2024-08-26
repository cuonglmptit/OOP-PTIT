/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luyentapvaora;

/**
 *
 * @author cle13
 */
import java.util.*;
import java.io.*;
public class SoKhongGiam {
    public static boolean isASC(int n) {
        String s = Integer.toString(n);
        if(s.length() < 2) return false;
        for (int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i) > s.charAt(i+1)) return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois1 =  new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ois2 =  new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> arl1 = (ArrayList<Integer>) ois1.readObject();
        ArrayList<Integer> arl2 = (ArrayList<Integer>) ois2.readObject();
        SortedMap<Integer, Integer> m1 = new TreeMap<>();
        SortedMap<Integer, Integer> m2 = new TreeMap<>();
        for (Integer i : arl1) {
            if(isASC(i)){
                if(m1.containsKey(i)) m1.put(i, m1.get(i)+1);
                else m1.put(i, 1);
            }
        }
        for (Integer i : arl2) {
            if(isASC(i)){
                if(m2.containsKey(i)) m2.put(i, m2.get(i)+1);
                else m2.put(i, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : m1.entrySet()) {
            if(m2.containsKey(entry.getKey()))
                System.out.println(entry.getKey()+" "+entry.getValue()+" "+m2.get(entry.getKey()));
        }
    }
}
