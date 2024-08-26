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
public class J02020_LietKeToHop1 {
    private static int n, k, ok=0;
    private static int[] a = new int[20];
    
    public static void Print(){
        for(int i=1;i<=k;i++)
            System.out.print(a[i]+" ");
        System.out.println("");
    }
    public static void Sinh(){
        int i = k;
        while(a[i]==n-k+i) i--;
        if(i==0) ok = 1;
        else{
            a[i]++;
            for(int j=i+1;j<=k;j++)
                a[j] = a[j-1] +1;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        for(int i=1;i<=k;i++) a[i] = i;
        int cnt = 0;
        while(ok==0){
            cnt++;
            Print();
            Sinh();
        }
        System.out.println("Tong cong co "+cnt+" to hop");
    }
}
