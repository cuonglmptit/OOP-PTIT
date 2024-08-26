/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachgiangvientheobomon;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author cle13
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Teacher> arl = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; i++) {
            Teacher tmp = new Teacher(i, sc.nextLine(), sc.nextLine());
            arl.add(tmp);
        }
        int q = Integer.parseInt(sc.nextLine());
        while(q-->0){
            String major = sc.nextLine().toUpperCase();
            String acr = "";
            StringTokenizer st = new StringTokenizer(major);
            while(st.hasMoreTokens()){
                String tmp = st.nextToken();
                acr += String.valueOf(tmp.charAt(0)).toUpperCase();
            }
            System.out.println("DANH SACH GIANG VIEN BO MON "+acr+":");
            for (Teacher teacher : arl) {
                if(teacher.checkMajor(major)) System.out.println(teacher);
            }    
        }
        
    }
}
