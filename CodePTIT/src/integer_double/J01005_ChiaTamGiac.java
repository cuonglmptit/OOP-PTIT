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
public class J01005_ChiaTamGiac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt(), h = sc.nextInt();
            for (int i = 1; i < n; i++) System.out.printf("%.6f ", Math.sqrt(i / (n * 1.0)) * h);
            System.out.println();
        }
    }
    
}
