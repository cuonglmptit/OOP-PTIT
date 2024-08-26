/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diemtuyensinh;

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
            Candidate tmp = new Candidate(i, sc.nextLine(), Float.parseFloat(sc.nextLine()), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            arl.add(tmp);
        }
        Collections.sort(arl);
        for(Candidate i : arl){
            System.out.println(i);
        }
    }
}
