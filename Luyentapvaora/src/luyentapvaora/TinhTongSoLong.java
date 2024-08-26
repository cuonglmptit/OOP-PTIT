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
public class TinhTongSoLong {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        BigInteger sum = BigInteger.ZERO;
        while(sc.hasNext()){
            String tmp = sc.next();
            try{
                Integer.parseInt(tmp);
            } catch(NumberFormatException e){
                try{
                    long a = Long.parseLong(tmp);
                    sum = sum.add(BigInteger.valueOf(a));
                } catch (NumberFormatException e1){
                    continue;
                }
            }
        }
        System.out.println(sum);
    }
}
