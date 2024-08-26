/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biginteger;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author cle13
 */
public class J07003_Tach_Doi_Va_Tinh_Tong {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        BigInteger a = sc.nextBigInteger();
        while(true){
            String s = a.toString();
            if(s.length() == 1) break;
            BigInteger n1 = new BigInteger(s.substring(0,s.length()/2));
            BigInteger n2 = new BigInteger(s.substring(s.length()/2));
            a = n1.add(n2);
            System.out.println(a);
        }
    }
}
