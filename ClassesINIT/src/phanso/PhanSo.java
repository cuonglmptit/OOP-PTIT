/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phanso;

import java.util.Scanner;

/**
 *
 * @author cle13
 */
public class PhanSo {
    private long x, y;
    public void PhanSo(){
        
    }
    public PhanSo(long x, long y){
        this.x = x;
        this.y = y;
        rutgon();
    }
    public PhanSo(PhanSo p){
        this.x = p.x;
        this.y = p.y;        
    }
    public long getTu(){
        return x;
    }
    public long getMau(){
        return y;
    }
    public void Print(){
        System.out.print(this.x + "/" +this.y+" ");
    }
    long GCD(long a, long b){
        if (a == 0)
            return b;
        return GCD(b % a, a);  
    }
    void rutgon(){
	long u = GCD(x, y);
	x /= u;
	y /= u;
    }
    void add(PhanSo b){
        x = x*b.getMau() + y*b.getTu();
        y = y*b.getMau();
        rutgon();
    }
    void pow2(){
        x = x*x;
        y = y*y;
        rutgon();
    }
    void multiply(PhanSo b){
        x = x*b.getTu();
        y = y*b.getMau();
        rutgon();
    }
    public static void main(String[] args) {
        //tính tổng phân số
//        Scanner sc = new Scanner(System.in);
//        PhanSo a = new PhanSo(sc.nextLong(), sc.nextLong());
//        PhanSo b = new PhanSo(sc.nextLong(), sc.nextLong());
//        a.add(b);
//        a.Print();
        // tính toán phân số
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            PhanSo a = new PhanSo(sc.nextLong(), sc.nextLong());
            PhanSo b = new PhanSo(sc.nextLong(), sc.nextLong());
            PhanSo a1 = new PhanSo(a);
            a1.add(b); a1.pow2(); PhanSo c = new PhanSo(a1);
            PhanSo d = new PhanSo(a);
            d.multiply(b);
            d.multiply(c);
            c.Print();
            d.Print();
            System.out.println("");
        }
    }
}
