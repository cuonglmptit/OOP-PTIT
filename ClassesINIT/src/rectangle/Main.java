/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rectangle;

import java.util.Scanner;

/**
 *
 * @author cle13
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dai = sc.nextDouble(), rong = sc.nextDouble();
        String mau = sc.next();
        if(dai>0 && rong>0){
            Rectangle a = new Rectangle(rong, dai, mau);
            System.out.println(a);
        }else System.out.print("INVALID");
    }
}
