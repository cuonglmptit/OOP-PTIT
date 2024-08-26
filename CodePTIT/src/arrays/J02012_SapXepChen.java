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
public class J02012_SapXepChen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int  i = 0; i < n; i++) a[i] = sc.nextInt();
	for(int i = 0; i < n; ++i){
            System.out.printf("Buoc %d: ", i);
            int p=a[i];
            int j=i-1;
            while(j>=0&&a[j]>p){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=p;	
            for(int k=0;k<=i;++k) System.out.printf("%d ", a[k]);
            System.out.printf("\n");
        }
    }
    
}
