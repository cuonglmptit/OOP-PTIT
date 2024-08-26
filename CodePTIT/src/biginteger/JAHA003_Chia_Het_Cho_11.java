/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biginteger;

/**
 *
 * @author DarkShadowDemon200x
 */
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author cle13
 */
public class JAHA003_Chia_Het_Cho_11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        while(t-- >0){
            BigInteger a = sc.nextBigInteger();
            if(a.mod(BigInteger.valueOf(11)) == BigInteger.ZERO) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
