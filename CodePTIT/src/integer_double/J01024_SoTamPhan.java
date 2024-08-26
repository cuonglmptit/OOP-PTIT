/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package integer_double;

/**
 *
 * @author cle13
 */
import java.util.*;
public class J01024_SoTamPhan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean ok = true;
            while(n>0){
                if(n%10 != 0 && n%10 != 1 && n%10 != 2) ok = false;
                n/=10;
            }
            if(ok == true) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
}
