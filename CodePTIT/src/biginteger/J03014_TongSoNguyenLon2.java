/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bigInteger;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author cle13
 * idea: dùng BigInteger để cộng 2 dố nguyên lớn
 */
public class J03014_TongSoNguyenLon2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger(), b = sc.nextBigInteger();
        System.out.print(a.add(b));
    }
}
