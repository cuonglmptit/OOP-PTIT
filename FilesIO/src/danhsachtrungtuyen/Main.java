/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachtrungtuyen;

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
        Scanner sc = new Scanner(new File("THISINH.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Candidate> arl = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            Candidate tmp = new Candidate(sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()));
            arl.add(tmp);
        }
        int amount = Integer.parseInt(sc.nextLine());
        Collections.sort(arl);
        arl.get(amount-1).setBaseMark();
        System.out.println(Candidate.getBaseMark());
        for(Candidate i : arl){
            i.setMatriculate();
            System.out.println(i);
        }
    }
}
