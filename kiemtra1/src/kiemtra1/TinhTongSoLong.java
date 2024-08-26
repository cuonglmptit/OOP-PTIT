/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiemtra1;

import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author DarkShadowDemon200x
 */
public class TinhTongSoLong {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        BigInteger sum = new BigInteger("0");
        while(sc.hasNext()){
            String tmp = sc.next();
            try{
                int add1 = Integer.parseInt(tmp);
            }catch(NumberFormatException e){
                try{
                    long add2 = Long.parseLong(tmp);
                    sum = sum.add(BigInteger.valueOf(add2));
                }catch(NumberFormatException e1){
                    continue;
                }
            }
        }
        System.out.println(sum);
    }
}
