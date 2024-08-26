/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05047_bangkenhapkhosapxeptheochietkhau;

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
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> ds = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            MatHang tmp = new MatHang(sc.nextLine(), Integer.parseInt(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            ds.add(tmp);
        }
        Collections.sort(ds);
        for (MatHang i : ds) {
            System.out.println(i);
        }
    }
}
