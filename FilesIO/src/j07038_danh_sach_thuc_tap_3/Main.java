/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j07038_danh_sach_thuc_tap_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DarkShadowDemon200x
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        Scanner sv = new Scanner(new File("C:\\Users\\cle13\\Documents\\NetBeansProjects\\FilesIO\\src\\j07038_danh_sach_thuc_tap_3\\SINHVIEN.in"));
//        Scanner dn = new Scanner(new File("C:\\Users\\cle13\\Documents\\NetBeansProjects\\FilesIO\\src\\j07038_danh_sach_thuc_tap_3\\DN.in"));
//        Scanner tt = new Scanner(new File("C:\\Users\\cle13\\Documents\\NetBeansProjects\\FilesIO\\src\\j07038_danh_sach_thuc_tap_3\\THUCTAP.in"));
        Scanner sv = new Scanner(new File("SINHVIEN.in"));
        Scanner dn = new Scanner(new File("DN.in"));
        Scanner tt = new Scanner(new File("THUCTAP.in"));
        int nsv = Integer.parseInt(sv.nextLine());
        for (int i = 0; i < nsv; i++) {
            new SinhVien(sv.nextLine(), sv.nextLine(), sv.nextLine(), sv.nextLine());
        }
        sv.close();
        
        int ndn = Integer.parseInt(dn.nextLine());
        for (int i = 0; i < ndn; i++) {
            new DoanhNghiep(dn.nextLine(), dn.nextLine(), Integer.parseInt(dn.nextLine()));
        }
        dn.close();
        
        int ntt = Integer.parseInt(tt.nextLine());
        for (int i = 0; i < ntt; i++) {
            String[] tmp = tt.nextLine().split(" ");
            DoanhNghiep.themSVvaoDN(tmp[1], SinhVien.getSVbyID(tmp[0]));
        }
        int t = Integer.parseInt(tt.nextLine());
        while(t-->0){
            System.out.println(DoanhNghiep.inDSSVTT(tt.nextLine()));
        }
        tt.close();
    }
}
