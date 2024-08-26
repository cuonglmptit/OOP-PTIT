/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package candidate;

import java.util.Scanner;

/**
 *
 * @author cle13
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine(), birth = sc.nextLine(); 
        float m1 = sc.nextFloat(),m2 =sc.nextFloat(),m3 = sc.nextFloat();
        Candidate a = new Candidate(name, birth, m1, m2, m3);
        a.Print();
    }
}
