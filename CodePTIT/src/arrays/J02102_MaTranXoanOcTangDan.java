/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author cle13
 */
public class J02102_MaTranXoanOcTangDan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        ArrayList<Integer> sortedarray = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
                sortedarray.add(a[i][j]);
            }
        }
        Collections.sort(sortedarray);
        int dong = n, cot = n, k = 0, p = 0, i, j;
        while(k < n*n){
            for(i = p; i < cot; i++){/*Loop to access the first row of the array*/
                a[p][i] = sortedarray.get(k);
                k++;
            }
            for(i = p+1; i < dong; i++){/*Loop to access the last column of the array*/
                a[i][cot-1] = sortedarray.get(k);
                k++;
            }
            if ( p != dong-1){
                for(i = cot-2; i >=p; i--){/*Loop to access the last row of the array*/
                    a[dong-1][i] = sortedarray.get(k);
                    k++;
                }
            }
            if(p!=cot-1){
                for(i = dong-2; i > p; i--){ /*Loop to access the first column of the array*/
                    a[i][p] = sortedarray.get(k);
                    k++;
                }
            }
            p++;dong --; cot --;
        }
        for (int x = 0; x < n; x++) {
            for (int z = 0; z < n; z++) {
                System.out.print(a[x][z]+" ");
            }
            System.out.println("");
        }
    }
}
