/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuanhoaxauhotentrongfile;

import java.util.*;
import java.io.*;

/**
 *
 * @author cle13
 */
public class ChuanHoaXauHoTenTrongFile {
    private static String chuanHoa(String s){
        s = s.trim().toLowerCase();
        s = s.replaceAll("\\s+", " ");
        String[] tmp = s.split(" ");
        String name = "";
        for(int i = 0; i < tmp.length; i++){
            if(i < tmp.length-1){
                name += String.valueOf(tmp[i].charAt(0)).toUpperCase();
                name += tmp[i].substring(1);
                name += " ";
            }else{
                name += String.valueOf(tmp[i].charAt(0)).toUpperCase();
                name += tmp[i].substring(1);
            }
        }
        return name;
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> arl = new ArrayList<>();
        while(sc.hasNextLine()){
            String tmp = sc.nextLine();
            if(tmp.equals("END")) break;
            else{
                arl.add(chuanHoa(tmp));
            }
        }
        for(String tmp : arl){
            System.out.println(tmp);
        }
    }
}
