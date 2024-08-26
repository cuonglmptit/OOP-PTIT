/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuanhoadanhsachsinhvien;

import java.io.*;
import java.text.ParseException;
import java.util.*;

/**
 *
 * @author cle13
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Student> arl = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            Student tmp = new Student(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()));
            arl.add(tmp);
        }
        for(Student i : arl){
            System.out.println(i);
        }
    }
}
