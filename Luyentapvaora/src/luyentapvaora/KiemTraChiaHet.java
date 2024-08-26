/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luyentapvaora;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author cle13
 */
public class KiemTraChiaHet {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SONGUYEN.IN"));
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            BigInteger tmp = new BigInteger(sc.nextLine());
            if((tmp.mod(BigInteger.valueOf(7))).equals(BigInteger.valueOf(0)) &&
                    (tmp.mod(BigInteger.valueOf(13))).equals(BigInteger.valueOf(0))) System.out.println("Both");
            else if((tmp.mod(BigInteger.valueOf(7))).equals(BigInteger.valueOf(0)) &&
                    !(tmp.mod(BigInteger.valueOf(13))).equals(BigInteger.valueOf(0))) System.out.println("Div 7");
            else if(!(tmp.mod(BigInteger.valueOf(7))).equals(BigInteger.valueOf(0)) &&
                    (tmp.mod(BigInteger.valueOf(13))).equals(BigInteger.valueOf(0))) System.out.println("Div 13");
            else System.out.println("None");
        }
    }
}
