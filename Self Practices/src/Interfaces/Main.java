/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

/**
 *
 * @author DarkShadowDemon200x
 */
public class Main {
    public static void main(String[] args) {
        MayTinhBoTui  fx500 = new MayTinhCasioFX500();
        MayTinhVinacal500 vnc500 = new MayTinhVinacal500();
        System.out.println("4+5 = "+ fx500.cong(4, 5));
        System.out.println("4*5 = "+ fx500.nhan(4, 5));
        System.out.println("4/0 = "+ fx500.chia(4, 0));
    }
}
