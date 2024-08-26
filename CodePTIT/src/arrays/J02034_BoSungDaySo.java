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
public class J02034_BoSungDaySo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        for(int i = 1; i <= n; i++) a[i] = sc.nextInt();
        int[] b = new int[a[n]+1];
        for(int i = 0; i < a[n]+1; i++) b[i] = 0;
        for(int i = 1; i <= n; ++i) b[a[i]]=a[i];
        int dem = 0;
	for(int i = 1; i <= a[n]; ++i) if(b[i]==0){
            System.out.println(i+" ");    
            dem++;
	} 
        if(dem == 0)System.out.print("Excellent!");
    }
}
