/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package timthukhoacuakithi;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author cle13
 */
public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Candidate> arl = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            Candidate tmp = new Candidate(i, sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()));
            arl.add(tmp);
        }
        Collections.sort(arl);
        arl.get(0).setValedictorian();
        for(Candidate i : arl){
            if(i.getTotal() == Candidate.getmaxOfAll()) System.out.println(i);
        }
    }
}
