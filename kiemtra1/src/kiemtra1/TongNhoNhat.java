/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiemtra1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author DarkShadowDemon200x
 */
public class TongNhoNhat {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:\\Users\\cle13\\Desktop\\B20DCCN100\\kiemtra1\\src\\kiemtra1\\newfile"));
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            ArrayList<Integer> ds = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                ds.add(a[i]);
            }
            ds.sort(Comparator.naturalOrder());
            int x = 0, y = 0;
            for (int i = 0; i < ds.size(); i++) {
                if(i%2 != 0){
                    x = x*10 + ds.get(i);
                }else{
                    y = y*10 + ds.get(i);
                }
            }
            System.out.println(x+y);
        }
    }
}
