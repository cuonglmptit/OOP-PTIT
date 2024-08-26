/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author cle13
 */
public class J02007_DemSoLanXuatHien {

    /**
     * @param args the command line arguments
     * main idea: tạo một mảng để xem đã in ra chưa, nếu in ra rồi thì lần sau k in ra nữa. Rồi for-trâu(brutal force thôi)
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int t1 = 1;
        while(t-->0){
            int n = sc.nextInt();
            int a[] = new int [n];
            for(int i = 0; i < n; i++) a[i] = sc.nextInt();
            boolean visited[] = new boolean [n];
            for(int i = 0; i < n; i++) visited[i] = false;
            System.out.printf("Test %d:\n", t1); t1++;
            for(int i = 0; i < n; i++){
                if(visited[i] == false){
                    int cnt = 0;
                    for(int j = i+1; j<n ; j++){
                        if(a[i] == a[j]){
                            cnt++;
                            visited[i] = visited[j] = true; 
                        }
                    }
                    System.out.printf("%d xuat hien %d lan\n", a[i], cnt+1); 
                }
            }
        }
    }
    
}
