/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luyentapvaora;

import java.io.*;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author cle13
 */
public class GhepMa {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream os1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream os2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<String> ds1 = (ArrayList<String>) os1.readObject();
        ArrayList<Integer> ds2 = (ArrayList<Integer>) os2.readObject();
        Set<String> set = new TreeSet<>();
        for (String s1 : ds1) {
            for (Integer i : ds2) {
                set.add(s1+i);
            }
        }
        for (String s : set) {
            System.out.println(s);
        }
    }
}
