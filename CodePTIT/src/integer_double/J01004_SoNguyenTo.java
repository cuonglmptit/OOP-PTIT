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
public class J01004_SoNguyenTo {

    /**
     * @param args the command line arguments
     */
    public static boolean isNguyento(int n){
        for(int i=2; i <= Math.sqrt(n); ++i) if(n%i==0) return false;
        return true;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            if(isNguyento(n)==true) System.out.println("YES");
            else System.out.println("NO");
        }  
    }
}
