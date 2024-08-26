/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiemtra;

import java.util.Scanner;

/**
 *
 * @author cle13
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        XuLySoNguyen n = new XuLySoNguyen();
        XuLyXau s = new XuLyXau();
        DaThuc da = new DaThuc();
        System.out.println("1. Nhap vao so nguyen duong n.");
        System.out.println("2. Viet ra cac so chia het co 6 nho hon n.");
        System.out.println("3. Viet ra cac hoan vi cua n.");
        System.out.println("4. Nhap vao 1 xau.");
        System.out.println("5. Dua ra so tu cua xau.");
        System.out.println("6. Dua ra chuan hoa cua xau neu la ho ten.");
        System.out.println("7. Nhap da thuc.");
        System.out.println("8. Tinh da thuc tai x=1.");
        while(true){
            int chon = Integer.parseInt(sc.nextLine());
            if(chon == 1){
                System.out.print("Nhap n: ");
                n = new XuLySoNguyen(Long.parseLong(sc.nextLine()));
            }
            if(chon == 2){
                System.out.println("Cac so chia het cho 6 nho hon n:");
                System.out.println(n.chiaHetCho6());
            }
            if(chon == 3){
                System.out.println("Hoan vi cua n:");
                n.hoanVi();
            }
            if(chon == 4){
                System.out.print("Nhap vao xau ky tu: ");
                s = new XuLyXau(sc.nextLine());
            }
            if(chon == 5){
                System.out.println("So tu cua xau: "+s.soTu());
            }
            if(chon == 6){
                System.out.println("Neu xau la ho ten thi khi duoc chuan hoa ten se la: ");
                System.out.println(s.chuanHoa());
            }
            if(chon == 7){
                System.out.println("Viet cac he so cua da thuc theo giam dan(VD 2x^2 - 3x^1 + 1x^0 => nhap 2 -3 1)"
                + "\nChu y:neu he so cua x^0 = 0 thi nhap 0): ");
                da = new DaThuc(sc.nextLine());
            }
            if(chon == 8){
                System.out.print("Da thuc tai x=1: ");
                System.out.println(da.giaTriTrai1());
            }
        }
    }
}
