/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tenviettat;

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
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<NameArrType> allName = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            NameArrType tmp = new NameArrType(sc.nextLine());
            allName.add(tmp);
        }
        ArrayList<String> allAcronym = new ArrayList<>();
        int m = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < m; i++){
            allAcronym.add(sc.nextLine().trim());
        }
        for(String arc : allAcronym){
            ArrayList<NameArrType> allPossible = new ArrayList<>();
            for(NameArrType name : allName){
                if(name.isPossibleThisAcronym(arc)) allPossible.add(name);
            }
            Collections.sort(allPossible);
            for(NameArrType i : allPossible){
                System.out.println(i);
            }
        }
        
    }
}
