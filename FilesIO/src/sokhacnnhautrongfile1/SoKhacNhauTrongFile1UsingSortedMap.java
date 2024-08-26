/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sokhacnnhautrongfile1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 *
 * @author cle13
 */
public class SoKhacNhauTrongFile1UsingSortedMap {
    public static void main(String[] args) throws FileNotFoundException {
        SortedMap<Integer, Integer> a = new TreeMap<>();
        Scanner sc = new Scanner(new File("DATA.in"));
        while(sc.hasNext()){
            int tmp = Integer.parseInt(sc.next());
            if(a.get(tmp) == null) a.put(tmp, 1);
            else a.put(tmp, a.get(tmp)+1);
        }
        for (Map.Entry<Integer, Integer> entry : a.entrySet()){
            System.out.println(entry.getKey() + " " +entry.getValue());
        }
            
    }
}
