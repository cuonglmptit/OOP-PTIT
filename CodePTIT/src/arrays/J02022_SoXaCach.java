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
public class J02022_SoXaCach {
    private static int n;
    private static int[] x = new int[20];
    
    public static void Print(){
        for(int i=1;i<=n;i++)
            System.out.print(x[i]);
        System.out.println("");
    }
    
    public static boolean check(){
        for (int i = 1; i <= n-1; i++) {
            if(Math.abs(x[i]-x[i+1]) == 1) return false;
        }
        return true;
    }
    public static void Sinh(){
        while(true){
            if(check()) Print();
            int j=n-1,k=n;
            while(x[j]>x[j+1] && j>0) j--;
            if(j==0) break;
            else{
                while(x[k]<x[j]) k--;
                int tmp = x[j];
                x[j] = x[k];
                x[k] = tmp;
                int l=j+1,r=n;
                while(l<r){
                    int tmp1 = x[l];
                    x[l] = x[r];
                    x[r] = tmp1;
                    l++; r--;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            n = sc.nextInt();
            for(int i=1;i<=n;i++) x[i] = i;
            Sinh();
        }
    }
}
