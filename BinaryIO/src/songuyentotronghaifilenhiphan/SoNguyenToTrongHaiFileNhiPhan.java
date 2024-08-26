/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package songuyentotronghaifilenhiphan;

import java.io.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author cle13
 */
public class SoNguyenToTrongHaiFileNhiPhan {
    public static boolean isPrime(int n){
        if(n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i == 0) return false;
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
            if(isPrime(i)){
                if(m1.containsKey(i)) m1.put(i, m1.get(i)+1);
                else m1.put(i, 1);
            }
        }
        for (Integer i : arl2) {
            if(isPrime(i)){
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
