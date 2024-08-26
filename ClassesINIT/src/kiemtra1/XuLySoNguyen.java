/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiemtra1;

/**
 *
 * @author cle13
 */
public class XuLySoNguyen {
    private long n;
    public XuLySoNguyen(long n){
        this.n = n;
    }
    public long tong1toN(){
        return (this.n+1)*n/2;
    }
    private boolean isPrime(long n){
        if(n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i == 0) return false;
        }
        return true;
    }
    public String primeLessThanN(){
        String s = "";
        for (int i = 0; i <= this.n; i++) {
            if(isPrime(i)) s += i + " ";
        }
        return s.substring(0, s.length()-1);
    }
}
