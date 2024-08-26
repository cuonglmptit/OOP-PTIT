/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tongchuso;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

/**
 *
 * @author cle13
 */
public class TongChuSo {
    private static long sumDigits(String s){
        long sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += (s.charAt(i)-'0');
        }
        return sum;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> arl =  (ArrayList<String>) ois.readObject();
        for (String i : arl) {
            String n = i.replaceAll("[\\D]", "");
            BigInteger a = new BigInteger(n);
            System.out.println(a+" "+sumDigits(n));
        }
    }
}
