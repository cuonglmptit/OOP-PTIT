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
public class J01016_ChuSo4VaChuSo7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int cnt=0;
        while(n>0){
            long a = n%10;
            n/=10;
            if(a==4||a==7) cnt++;
        }
        if(cnt==4||cnt==7) System.out.print("YES");
        else System.out.print("NO");
    }
    
}
