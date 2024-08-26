/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author cle13
 */
public class J02011_SapXepChon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int  i = 0; i < n; i++) a[i] = sc.nextInt();
        for(int i = 0; i < n-1; ++i){
            boolean ok=false;
            int min = i;
            for(int j=i+1;j<n;++j){
                if(a[j]<a[min]){
                min = j;
                ok = false;
                }
            }
            int tmp = a[i];
            a[i] = a[min];
            a[min] = tmp;
            System.out.printf("Buoc %d: ", i+1);
            for(int k=0;k<n;++k) System.out.printf("%d ", a[k]);
            System.out.printf("\n");
        }
    }
    
}
