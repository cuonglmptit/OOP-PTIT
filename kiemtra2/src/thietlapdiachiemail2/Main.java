/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thietlapdiachiemail2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

/**
 *
 * @author DarkShadowDemon200x
 */
public class Main {
    public static String chuanHoa(String s){
        StringTokenizer st = new StringTokenizer(s.toLowerCase());
        String name  = "";
        while(st.hasMoreTokens()){
            name += st.nextToken()+" ";
        }
        return name.trim();
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<Email> ds = new ArrayList<>();
        Set<String> setName = new LinkedHashSet<>();
        while(sc.hasNextLine()){
            String tmp = sc.nextLine();
            setName.add(chuanHoa(tmp));
        }
        for (String name : setName) {
            ds.add(new Email(name));
        }
        for (Email d : ds) {
            System.out.println(d);
        }
    }
}
