/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biginteger;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author cle13
 */
public class J03016_ChiaHetCho11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        while(t-- >0){
            BigInteger a = sc.nextBigInteger();
            if(a.mod(BigInteger.valueOf(11)) == BigInteger.ZERO) System.out.println(1);
            else System.out.println(0);
        }
    }
}
