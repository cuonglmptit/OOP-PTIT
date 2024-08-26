/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sapxepdanhsachsinhvien;

import java.io.*;
import java.util.*;

/**
 *
 * @author cle13
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Student> arl = new ArrayList<>();
        while(sc.hasNextLine()){
            Student tmp = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            arl.add(tmp);
        }
        Collections.sort(arl);
        for(Student i : arl){
            System.out.println(i);
        }
    }
}
