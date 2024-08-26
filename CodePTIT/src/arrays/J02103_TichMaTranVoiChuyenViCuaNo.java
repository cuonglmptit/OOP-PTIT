/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author cle13
 */
public class J02103_TichMaTranVoiChuyenViCuaNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int test = 1;
        while(t-->0){
            int n = sc.nextInt(), m = sc.nextInt();
            int[][] a = new int[n][m];
            int[][] b = new int[m][n];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    a[i][j] = sc.nextInt();
                    b[j][i] = a[i][j];
                } 
            }
            int[][] tich = new int[n][n];
            for(int i = 0; i <n ; i++){
                for(int j = 0; j <n ; j++){    
                    tich[i][j] = 0;
                }
            }
            for(int i = 0; i <n ; i++){
                for(int j = 0; j <n ; j++){    
                    for(int k = 0; k < m; k++) tich[i][j] += a[i][k]*b[k][j];
                }
            }
            System.out.println("Test "+test+":");
            for(int i = 0; i <n ; i++){
                for(int j = 0; j <n ; j++){
                    System.out.print(tich[i][j]+" ");
                }
                System.out.println();
            }    
            test++;
        }
        
    }
}
