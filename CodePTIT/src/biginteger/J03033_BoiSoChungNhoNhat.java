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
public class J03033_BoiSoChungNhoNhat {
    public static BigInteger lcm(BigInteger a, BigInteger b)
    {
        // calculate multiplication of two bigintegers
        BigInteger mul = a.multiply(b);
 
        // calculate gcd of two bigintegers
        BigInteger gcd = a.gcd(b);
 
        // calculate lcm using formula: lcm * gcd = x * y
        BigInteger lcm = mul.divide(gcd);
        return lcm;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            System.out.println(lcm(a,b));
        }
    }
}
