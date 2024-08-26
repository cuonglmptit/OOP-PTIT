/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package integer_double;

import java.util.Scanner;

/**
 *
 * @author cle13
 */
public class J01013_TongUocSo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long sum = 0;
        while(t-->0){
            int n = sc.nextInt();
            for(int i=2;i<=Math.sqrt(n);i++){
                while(n%i==0){
                    sum += i;
                    n/=i;
                }
            }
            if(n>2) sum+=n;
        }
        System.out.print(sum);
    }
    
}
