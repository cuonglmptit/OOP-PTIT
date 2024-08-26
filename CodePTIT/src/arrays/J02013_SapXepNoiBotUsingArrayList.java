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
public class J02013_SapXepNoiBotUsingArrayList {
        public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int  i = 0; i < n; i++) a.add(sc.nextInt());
        for(int i = 0;i < n-1; ++i){
            boolean stop = true;
            for(int j = 0; j < n-i-1; ++j){
                if(a.get(j) > a.get(j+1)){
                    int tmp = a.get(j);
                    a.set(j,a.get(j+1));
                    a.set(j+1, tmp);
                    stop = false;
                }
            }
            if(stop == true) break;
            System.out.printf("Buoc %d: ", i+1);
            for(int k = 0; k < n; ++k) System.out.printf("%d ", a.get(k));
            System.out.printf("\n");
	}
    }
}
