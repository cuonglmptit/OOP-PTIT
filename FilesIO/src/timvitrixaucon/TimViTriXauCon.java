/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package timvitrixaucon;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author cle13
 */
public class TimViTriXauCon {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc  =  new Scanner(new File("STRING.in"));
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s1 = sc.nextLine(), s2 = sc.nextLine(); 
            for (int i = 0; i < s1.length()-s2.length()+1; i++) {
                if(s1.substring(i, i+s2.length()).equals(s2)) System.out.print((i+1)+" ");
            }
            System.out.println("");
        }
    }
}
