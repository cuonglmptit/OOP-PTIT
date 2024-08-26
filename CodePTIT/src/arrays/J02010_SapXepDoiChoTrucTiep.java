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
public class J02010_SapXepDoiChoTrucTiep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int  i = 0; i < n; i++) a[i] = sc.nextInt();
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n ; j++){
                if(a[i] > a[j]){
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
            System.out.printf("Buoc %d: ", i+1);
            for(int k = 0; k < n; k++) System.out.printf("%d ",a[k]);
            System.out.print("\n");
            boolean ok = true;
	    for(int o=0;o<n-1;++o) if(a[o]>a[o+1]) ok = false;
            if(ok == true) break; 
        }
    }
    
}
