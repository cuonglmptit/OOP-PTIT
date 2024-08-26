/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dientichhinhtronngoaitieptamgiac;

import java.util.Scanner;

/**
 *
 * @author cle13
 */
public class Main {
    public static void main(String[] args) throws KhongTheTaoTamGiacException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            try{
                Point p1 = new Point(sc.nextDouble(), sc.nextDouble());
                Point p2 = new Point(sc.nextDouble(), sc.nextDouble());
                Point p3 = new Point(sc.nextDouble(), sc.nextDouble());
                Triangle tmp = new Triangle(p1, p2, p3);
                System.out.println(String.format("%.3f", tmp.areaOfOutterCircleOfTri()));
            }catch (KhongTheTaoTamGiacException e){
                System.out.println(e.getError());
            }
        }
    }
}
