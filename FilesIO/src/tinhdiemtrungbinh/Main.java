/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tinhdiemtrungbinh;

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
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        ArrayList<Student> arl = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            Student tmp = new Student(i, sc.nextLine(), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine()));
            arl.add(tmp);
        }
        Collections.sort(arl);
        for(int i = 1; i < arl.size(); i++){
            arl.get(i-1).setRank(i);
            while(arl.get(i).getGPA() == arl.get(i-1).getGPA() && i < arl.size()-1){
                arl.get(i).setRank(arl.get(i-1).getRank());
                i++;
            }
        }
        if(arl.get(arl.size()-1).getGPA() == arl.get(arl.size()-2).getGPA()) arl.get(arl.size()-1).setRank(arl.get(arl.size()-2).getRank());
        else arl.get(arl.size()-1).setRank(arl.size());
        for(Student i : arl){
            System.out.println(i);
        }
    }
}
