/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiemtra1;

import java.util.Scanner;

/**
 *
 * @author cle13
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = 0;
        System.out.println("Menu:\n1. Nhap vao so nguyen n\n2. Viet ra tong\n3. Dua day prime nho hon = n");
        while(true){
            int select = sc.nextInt();
            if(select == 1){
                n = sc.nextInt();
            }
            if(select == 2){
                XuLySoNguyen tmp = new XuLySoNguyen(n);
                System.out.println("Tong tu 1 den n:\n"+tmp.tong1toN());
            }
            if(select == 3){
                XuLySoNguyen tmp = new XuLySoNguyen(n);
                System.out.println("Nguyen to nho hon = n:\n"+tmp.primeLessThanN());
            }
        }
    }
}
