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
public class J01006_TinhSoFibonacci {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        long[] a= new long[94];
        a[1]=1; a[2]=1;
        for(int i=3;i<=93;++i){
            a[i]=a[i-1]+a[i-2];
        }
        while(t-- >0){
            int n = sc.nextInt();
            System.out.println(a[n]);
        }
    }
    
}
