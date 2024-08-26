/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diemcanbang;

import java.util.Scanner;

/**
 *
 * @author cle13
 */
public class J02014_DiemCanBang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int  i = 0; i < n; i++) a[i] = sc.nextInt();
            int total = 0, sumleft = 0, sumright = 0;
            boolean ok = false;
            for(int i = 0; i < n; ++i){
                    total += a[i];
            }
            for(int i = 0; i < n; ++i){
                    sumright = total - a[i] - sumleft;
                    if(sumleft == sumright){
                            System.out.println(i+1);   
                            ok = true;
                            break;
                    }
                    sumleft+=a[i];
            }
            if(ok == false) System.out.println(-1); 
        }
        
    }
    
}
