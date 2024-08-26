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
 */
public class J02012_SapXepChenUsingArrayList {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int  i = 0; i < n; i++) a.add(i,sc.nextInt());
	for(int i = 0; i < n; ++i){
            System.out.printf("Buoc %d: ", i);
            int p=a.get(i);
            int j=i-1;
            while(j>=0&&a.get(j)>p){
                a.set(j+1, a.get(j));
                j--;
            }
            a.set(j+1, p);	
            for(int k=0;k<=i;++k) System.out.printf("%d ", a.get(k));
            System.out.printf("\n");
        }
    }
}
