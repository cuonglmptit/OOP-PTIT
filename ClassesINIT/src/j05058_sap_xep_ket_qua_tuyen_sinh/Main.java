/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05058_sap_xep_ket_qua_tuyen_sinh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author DarkShadowDemon200x
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Candidate> ds = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Candidate tmp = new Candidate(sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()));
            ds.add(tmp);
        }
        Collections.sort(ds);
        for (Candidate d : ds) {
            System.out.println(d);
        }
    }
}
