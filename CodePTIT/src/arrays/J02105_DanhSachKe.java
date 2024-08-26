/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author cle13
 * IDEA: lưu các cạnh vào ArayList 2 chiều rồi in ra
 */
public class J02105_DanhSachKe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                a[i][j] = sc.nextInt();
            }
        }
        ArrayList<ArrayList<Integer>> arl = new ArrayList<>();
        for(int i = 0; i < n; i++){
            ArrayList tmp = new ArrayList<>();
            for(int j = 0; j < n; j++){
                if(a[i][j] == 1) tmp.add(j+1);
            }
            arl.add(tmp);
        }
        for(int i = 0; i < arl.size(); i++){
            System.out.print("List("+(i+1)+") = ");
            for(int j = 0; j < arl.get(i).size(); j++){
                System.out.print(arl.get(i).get(j)+" ");   
            }
            System.out.println();
        }
    }
}
