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
public class J01008_PhanTichThuaSoNguyento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int t1=1;
        while(t-->0){
            int n = sc.nextInt();
            System.out.printf("Test %d: ",t1);
            for(int i=2;i<=Math.sqrt(n);i++){
                int cnt=0;
                while(n%i==0){
                    cnt++;
                    n/=i;
                }
                if(cnt>0)System.out.printf("%d(%d) ",i,cnt);    
            }
            if(n>1)System.out.printf("%d(%d)",n,1);
            System.out.printf("\n");
            t1++;
        }
    }
    
}