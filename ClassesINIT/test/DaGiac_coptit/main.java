/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DaGiac_coptit;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            polygon po = new polygon(n);
            po.setP(sc);
            System.out.printf("%.3f",po.getArea());
            System.out.println("");
        }
    }
}
