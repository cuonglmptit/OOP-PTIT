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
public class DaThuc {
    private String heso;

    public DaThuc() {
    }

    public DaThuc(String heso) {
        this.heso = heso;
    }
    private int horner(int poly[], int n, int x)
    {
        int result = poly[0]; 
        for (int i=1; i<n; i++)
            result = result*x + poly[i];
        return result;
    }
    public int giaTriTrai1(){
        String[] tmp = this.heso.split("\\s+");
        int[] a = new int[tmp.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(tmp[i]);
        }
        return horner(a, a.length, 1);
    }
}
