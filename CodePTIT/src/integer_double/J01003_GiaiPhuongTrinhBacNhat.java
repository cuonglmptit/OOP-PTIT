/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package integer_double;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author cle13
 */
public class J01003_GiaiPhuongTrinhBacNhat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        if(a==0 && b==0) System.out.print("VSN");
        else if(a==0) System.out.print("VN");
        else{
            System.out.printf("%.2f",-b/a);
        }
    }
    
}
