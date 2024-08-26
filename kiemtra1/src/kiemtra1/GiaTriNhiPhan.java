/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiemtra1;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author DarkShadowDemon200x
 */
public class GiaTriNhiPhan {
    public static long gtNP(String s){
        String np = "";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '0') np += s.charAt(i);
            else if(s.charAt(i) == '1') np += s.charAt(i);
        }
        for (int i = 0; i < np.length(); i++) {
            if(np.charAt(i) == '1'){
                np = np.substring(i);
                break;
            }
        }
//        System.out.println(np);
        long sum = 0;
        for (int i = 0; i < np.length(); i++) {
            if(np.charAt(i) == '1'){
                sum += Math.pow(2, np.length()-i-1);
            }
        }
        return sum;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream oi = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> ds = (ArrayList<String>) oi.readObject();
//        ArrayList<String> ds = new ArrayList<>();
//        ds.add("5678321010286421");
//        ds.add("9999999000000000000000000");
        for (String s : ds) {
            String np = "";
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '0') np += s.charAt(i);
                else if(s.charAt(i) == '1') np += s.charAt(i);
            }
            System.out.print(np+" "+gtNP(s));
            System.out.println("");
        }
    }
}
