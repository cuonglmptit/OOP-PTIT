/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package files;

import java.util.*;
import java.io.*;
/**
 *
 * @author cle13
 */
public class TinhTong {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        long sum = 0;
        while(sc.hasNext()){
            try{
                int tmp = Integer.parseInt(sc.next());
                sum += tmp;
            }catch(NumberFormatException e){
            }
        }
        System.out.print(sum);
    }
}
