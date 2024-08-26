/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05070_cau_lac_bong_da_2;

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
        for (int i = 0; i < n; i++) {
            new FootBallClub(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()));
        }
        n = Integer.parseInt(sc.nextLine());
        ArrayList<Match> ds = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] tmp = sc.nextLine().split(" ");
            ds.add(new Match(tmp[0], Integer.parseInt(tmp[1]), FootBallClub.getFBClubById(tmp[0].substring(1, 3))));
        }
        Collections.sort(ds);
        for (Match m : ds) {
            System.out.println(m);
        }
    }
}
