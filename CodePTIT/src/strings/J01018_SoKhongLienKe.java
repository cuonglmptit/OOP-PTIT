/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strings;

import java.util.Scanner;

/**
 *
 * @author cle13
 */
public class J01018_SoKhongLienKe {

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
            long sumdigit = 0;
            while(n>=10){
                long a = n%10;
                long b = (n/10)%10;
                if(a-b!=2 && a-b!=-2) ok = false;
                sumdigit += a;
                n/=10;
            }
            sumdigit += n;
            if(sumdigit%10 != 0) ok = false;
            if(ok==true) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
