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
public class J03013_HieuSoNguyenLon1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            BigInteger a = sc.nextBigInteger(); String sa = a.toString();
            BigInteger b = sc.nextBigInteger(); String sb = b.toString();
            String kq = a.subtract(b).abs().toString();
            if(sa.length() > sb.length()) for(int i = 1; i <= Math.abs(sa.length()-kq.length()); i++) kq = "0" +kq;
            else for(int i = 1; i <= Math.abs(sb.length()-kq.length()); i++) kq = "0" +kq;
            System.out.println(kq);
        }
    }
}
