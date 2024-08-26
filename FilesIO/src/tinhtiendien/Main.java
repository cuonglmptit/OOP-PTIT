/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tinhtiendien;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author cle13
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<ElectricityBill> arl = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            ElectricityBill tmp = new ElectricityBill(i, sc.nextLine(), sc.nextLine());
            arl.add(tmp);
        }
        Collections.sort(arl);
        for(ElectricityBill i : arl){
            System.out.println(i);
        }
    }
}
