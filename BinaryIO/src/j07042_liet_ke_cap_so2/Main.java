/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j07042_liet_ke_cap_so2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import test.Pair;

/**
 *
 * @author DarkShadowDemon200x
 */
public class Main {
        public static long  GCD(long a, long b){ 
            if (a == 0) 
                return b;  
            return GCD(b % a, a);  
        }   
        public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new  ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Pair> ds = (ArrayList<Pair>) ois.readObject();
//        ArrayList<Pair> ds = new ArrayList<>();
//        ds.add(new Pair(10, 20));
//        ds.add(new Pair(10, 20));
//        ds.add(new Pair(10, 21));
//        ds.add(new Pair(3, 7));
        Collections.sort(ds);
        LinkedHashSet<String> set = new LinkedHashSet<>();
        for (Pair d : ds) {
            if(d.getFirst() < d.getSecond()){
                if(GCD(d.getFirst(), d.getSecond()) == 1){
                    set.add(d.toString());
                }
            }
        }
        for (String pair : set) {
            System.out.println(pair);
        }
    }
}
