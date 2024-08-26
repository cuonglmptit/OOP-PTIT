/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuanhoavasapxep;

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
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<PersonName> arl = new ArrayList<>();
        while(sc.hasNextLine()){
            PersonName tmp = new PersonName(sc.nextLine());
            arl.add(tmp);
        }
        Collections.sort(arl);
        for(PersonName i : arl){
            System.out.println(i);
        }
    }
}
