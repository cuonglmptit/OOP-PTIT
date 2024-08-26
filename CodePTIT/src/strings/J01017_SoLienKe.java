/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strings;

/**
 *
 * @author cle13
 */
import java.util.Scanner;
public class J01017_SoLienKe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            boolean ok=true;
            while(n>=10){
                long a = n%10;
                long b = (n/10)%10;
                if(a-b!=1 && a-b!=-1) ok = false;
                n/=10;
            }
            if(ok==true) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
}
