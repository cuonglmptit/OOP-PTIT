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
public class J01009_TongGiaiThua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        long sum = 0;
        long sum1 = 1;
        for(int i=1;i<=n; ++i){
            sum1=1;
            for(int j=1;j<=i;++j){
                sum1*=j;
            }
            sum+=sum1;
        }
        System.out.print(sum);
    }
    
}
