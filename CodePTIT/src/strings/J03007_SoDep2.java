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
public class J03007_SoDep2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String s="";
        while(t-->0){
            s = sc.next();
            boolean ok = true;
            int n = s.length();
            int sum = 0;
            for(int i = 0; i < n/2; i++){
                if(s.charAt(i) != s.charAt(n-i-1)) ok = false;
            }
            for(int i = 0; i < n; i++) sum += s.charAt(i) - '0';
            if(s.charAt(0) != '8' && s.charAt(n-1)!= '8') ok = false;
            if(sum%10 != 0) ok = false;
            if(ok == true) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
}
