/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capsonguyentotrongfile2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author cle13
 */
public class CapSoNguyenToTrongFile2 {
    public static boolean isPrime(int n){
        if(n <= 1) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream data1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream data2 = new ObjectInputStream(new FileInputStream("DATA2.in"));  
        ArrayList<Integer> ds1 = (ArrayList<Integer>) data1.readObject();
        ArrayList<Integer> ds2 = (ArrayList<Integer>) data2.readObject();
        Set<Integer> set1 = new TreeSet<>();
        Set<Integer> set2 = new TreeSet<>();
        for (Integer tmp : ds1) {
            if(isPrime(tmp)) set1.add(tmp);
        }
        for (Integer tmp : ds2) {
            if(isPrime(tmp)) set2.add(tmp);
        }
        for (Integer n : set1) {
            for (Integer m : set1) {
                if(n+m == 1000000 && n<m){
                    boolean exist = false;
                    for (Integer integer : set2) {
                        if(Objects.equals(integer, n)) exist = true;
                        if(Objects.equals(integer, m)) exist = true;
                    }
                    if(exist == false) System.out.println(n+" "+m);
                }
            }
        }
    }
}
