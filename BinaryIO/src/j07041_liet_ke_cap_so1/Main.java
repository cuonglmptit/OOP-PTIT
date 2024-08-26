/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j07041_liet_ke_cap_so1;
import test.Pair;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

/**
 *
 * @author DarkShadowDemon200x
 */
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new  ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Pair> ds = (ArrayList<Pair>) ois.readObject();
//        ArrayList<Pair> ds = new ArrayList<>();
//        ds.add(new Pair(10, 20));
//        ds.add(new Pair(10, 20));
//        ds.add(new Pair(10, 21));
//        ds.add(new Pair(3, 40));
        Collections.sort(ds);
        LinkedHashSet<String> set = new LinkedHashSet<>();
        for (Pair d : ds) {
            if(d.getFirst() < d.getSecond()){
                set.add(d.toString());
            }
        }
        for (String pair : set) {
            System.out.println(pair);
        }
    }
}
