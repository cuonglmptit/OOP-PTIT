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
public class NhoNhatVaLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            if(n != 0){
                BigInteger Min = new BigInteger("0");
                BigInteger Max = new BigInteger("0");
                for(int i = 0; i < n; i++){
                    if(i == 0){
                        Min = sc.nextBigInteger();
                        Max = Min;
                    }else{
                        BigInteger tmp = sc.nextBigInteger();
                        if(tmp.compareTo(Max) == 1) Max = tmp;
                        if(tmp.compareTo(Min) == -1) Min = tmp;
                    }
                }
                if(Min.compareTo(Max) != 0) System.out.println(Min+" "+Max);
                else System.out.println("BANG NHAU");
            }else break;
        }
    }
}
