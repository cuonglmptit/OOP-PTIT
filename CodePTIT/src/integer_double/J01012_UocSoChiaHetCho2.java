/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package integer_double;

/**
 *
 * @author cle13
 */
import java.util.Scanner;
import java.lang.Math;
public class J01012_UocSoChiaHetCho2 {

    /**
     * @param args the command line arguments
     */
    public static int uocsochia2ofn(int n){
        int cnt=0;
        for(int i=1;i<=Math.sqrt(n);++i){
            if(n%i==0){
                if(i%2==0) cnt++;
                if((n/i)%2==0) cnt++;
                if(i*i==n && i%2==0) cnt--;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            System.out.println(uocsochia2ofn(n));
        }
    }
    
}
