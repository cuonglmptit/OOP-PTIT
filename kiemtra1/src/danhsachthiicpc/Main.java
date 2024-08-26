/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachthiicpc;

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
        for (int i = 1; i <= n; i++) {
            Team tmp = new Team(i, sc.nextLine(), sc.nextLine());
        }
        ArrayList<ThiSinh> ds = new ArrayList<>();
        int n1 = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n1; i++) {
            ThiSinh tmp = new ThiSinh(i, sc.nextLine(), sc.nextLine());
            ds.add(tmp);
        }
        Collections.sort(ds);
        for (ThiSinh d : ds) {
            System.out.println(d);
        }
    }
}
