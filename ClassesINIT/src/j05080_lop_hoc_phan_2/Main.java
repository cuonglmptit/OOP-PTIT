/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05080_lop_hoc_phan_2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author DarkShadowDemon200x
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            new LopHP(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        int m = Integer.parseInt(sc.nextLine());
        while (m-- > 0) {
            LopHP.inDanhSachTheoGiangVien(sc.nextLine());
        }
    }
}
