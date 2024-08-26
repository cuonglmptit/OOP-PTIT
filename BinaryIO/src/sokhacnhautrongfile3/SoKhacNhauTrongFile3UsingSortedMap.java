/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sokhacnhautrongfile3;

import java.io.*;
import java.util.*;

/**
 *
 * @author cle13
 */
public class SoKhacNhauTrongFile3UsingSortedMap {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        SortedMap<Integer, Integer> a = new TreeMap<>();
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> ds = (ArrayList<Integer>) in.readObject();
        for (Integer x : ds) {
            if(a.get(x) == null) a.put(x, 1);
            else a.put(x, a.get(x)+1);
        }
        for (Map.Entry<Integer, Integer> entry : a.entrySet()){
            System.out.println(entry.getKey() + " " +entry.getValue());
        }
            
    }
}
