/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j07017_lop_pair;

/**
 *
 * @author DarkShadowDemon200x
 */
public class Pair<T, S>{
    private T first;
    private S second;
    public Pair(T firstElement, S secondElement){
        this.first = firstElement;
        this.second = secondElement;
    }
    private boolean checkPrime(Integer n){
        if(n <= 1) return false; 
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i == 0) return false;
        }
        return true;
    }
    public boolean isPrime(){
        return checkPrime((Integer) this.first) && checkPrime((Integer) this.second);
    }
    @Override
    public String toString(){
        return this.first+" "+this.second;
    }
}
