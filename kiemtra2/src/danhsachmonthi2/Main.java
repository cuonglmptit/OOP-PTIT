/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danhsachmonthi2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author DarkShadowDemon200x
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        Set<Subject> set = new TreeSet<>();
        while (sc.hasNextLine()) {
            String sID = sc.nextLine();
            String name = sc.nextLine();
            String method = sc.nextLine();
            set.add(new Subject(sID, name, method));
        }
        for (Subject subject : set) {
            System.out.println(subject);
        }
    }
}
