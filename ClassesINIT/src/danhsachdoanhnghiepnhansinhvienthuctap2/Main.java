/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachdoanhnghiepnhansinhvienthuctap2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author cle13
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Enterprise> arl = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            Enterprise tmp = new Enterprise(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            arl.add(tmp);
        }
        Collections.sort(arl);
        int q = Integer.parseInt(sc.nextLine());
        while(q-->0){
            int a = sc.nextInt(), b = sc.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU "+a+" DEN "+b+" SINH VIEN:");
            for (Enterprise enterprise : arl) {
                if(enterprise.getAccept() >= a && enterprise.getAccept() <= b){
                    System.out.println(enterprise);
                }
            }
        }
        
    }
}
