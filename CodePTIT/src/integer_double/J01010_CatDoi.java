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
public class J01010_CatDoi {

    /**
     * @param args the command line arguments
     */ 
    public void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            boolean ok  = true;
            String s = "";
            while(n>0){
                long tmp = n%10;
                if(tmp == 0) s = "0" + s;
                else if(tmp == 1) s = "1" + s;
                else if(tmp == 9 || tmp == 8) s = "0" + s;
                else ok = false;
                n/=10;
            }
            long n1 = Long.parseLong(s);
            if(n1 == 0) ok  = false;
            if(ok == true) System.out.println(n1);
            else System.out.println("INVALID");
        }
    }
    
}
