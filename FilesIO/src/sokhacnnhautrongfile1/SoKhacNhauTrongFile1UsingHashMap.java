/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sokhacnnhautrongfile1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author cle13
 */
public class SoKhacNhauTrongFile1UsingHashMap {
        public static void main(String[] args) throws FileNotFoundException {
        HashMap<Integer, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(new File("DATA.in"));
        while(sc.hasNextInt()){
            int tmp = sc.nextInt();
            if(map.containsKey(tmp)) map.put(tmp, map.get(tmp)+1);
            else map.put(tmp, 1);
        }
        Set<Integer> st = map.keySet();
        for (Integer key : st){
            System.out.println(key + " " + map.get(key));
        }
    }
}
