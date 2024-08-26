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
public class J01026_SoChinhPhuong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
           if((long)Math.sqrt(n)*(long)Math.sqrt(n) == n) System.out.println("YES");
           else System.out.println("NO");
        }
    }
    
}
