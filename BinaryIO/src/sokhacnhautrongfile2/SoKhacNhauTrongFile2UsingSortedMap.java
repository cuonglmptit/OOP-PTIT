/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sokhacnhautrongfile2;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author cle13
 */
public class SoKhacNhauTrongFile2UsingSortedMap {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        SortedMap<Integer, Integer> a = new TreeMap<>();
        DataInputStream bfi = new DataInputStream(new FileInputStream("DATA.IN"));
//        while(sc.hasNext()){
//            int tmp = Integer.parseInt(sc.next());
//            if(a.get(tmp) == null) a.put(tmp, 1);
//            else a.put(tmp, a.get(tmp)+1);
//        }
        for (int i = 0; i < 100000; i++) {
            int tmp = bfi.readInt();
            if(a.get(tmp) == null) a.put(tmp, 1);
            else a.put(tmp, a.get(tmp)+1);
        }
        for (Map.Entry<Integer, Integer> entry : a.entrySet()){
            System.out.println(entry.getKey() + " " +entry.getValue());
        }
            
    }
}
