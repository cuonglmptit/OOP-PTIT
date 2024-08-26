/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tinhthunhapchonhanvien;

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
        ArrayList<Employee> arl =  new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Employee tmp = new Employee(i+1, sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()));
            arl.add(tmp);
        }
        for (Employee employee : arl) {
            System.out.println(employee);
        }
    }
}
