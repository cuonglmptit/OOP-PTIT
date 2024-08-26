/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lietkesinhvientheolop;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author cle13
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Student> arl = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Student tmp = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            arl.add(tmp);
        }
        int q = Integer.parseInt(sc.nextLine());
        while(q-->0){
            String lop = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP "+lop+":");
            for (Student student : arl) {
                if(student.toString().contains(lop)) System.out.println(student);
            }
        }
    }
}
