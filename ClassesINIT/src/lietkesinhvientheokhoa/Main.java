/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lietkesinhvientheokhoa;

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
            String khoa = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN KHOA "+khoa+":");
            String nKhoa = khoa.substring(khoa.length()-2);
            for (Student student : arl) {
                if(student.getsClass().charAt(1) == nKhoa.charAt(0) && student.getsClass().charAt(2) == nKhoa.charAt(1))
                    System.out.println(student);
            }
        }
    }
}
