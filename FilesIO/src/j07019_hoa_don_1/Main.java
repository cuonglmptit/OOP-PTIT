/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j07019_hoa_don_1;

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
        Scanner data1 = new Scanner(new File("DATA1.in"));
        Scanner data2 = new Scanner(new File("DATA2.in"));
        int n = Integer.parseInt(data1.nextLine());
        for (int i = 0; i < n; i++) {
            new SanPham(data1.nextLine(), data1.nextLine(), Double.parseDouble(data1.nextLine()), Double.parseDouble(data1.nextLine()));
        }
        int m = Integer.parseInt(data2.nextLine());
        ArrayList<HoaDon> ds = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String[] tmp = data2.nextLine().split("\\s+");
            ds.add(new HoaDon(i+1, tmp[0], Integer.parseInt(tmp[1])));
        }
        for (HoaDon hd : ds) {
            System.out.println(hd);
        }
    }
}
