/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package integer_double;
import java.util.Scanner;
/**
 *
 * @author cle13
 */
public class J01001_HinhChuNhat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int dai = scanner.nextInt();
        int rong = scanner.nextInt();
        if(dai<=0 || rong<=0) System.out.print(0);
        else{
            System.out.print((dai+rong)*2+" ");
            System.out.print(dai*rong);
        }
    }
    
}
