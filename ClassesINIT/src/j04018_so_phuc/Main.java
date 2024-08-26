/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j04018_so_phuc;

import java.util.Scanner;

/**
 *
 * @author DarkShadowDemon200x
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            ComplexNumber a = new ComplexNumber(sc.nextFloat(), sc.nextFloat());
            ComplexNumber b = new ComplexNumber(sc.nextFloat(), sc.nextFloat());
            System.out.println((a.add(b)).multiply(a) +", "+ (a.add(b)).multiply(a.add(b)));
        }
    }
}
