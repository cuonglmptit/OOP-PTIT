/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package binaryio;

/**
 *
 * @author cle13
 */
import java.io.*;
import java.util.*;
public class J07015 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        boolean[] Eratosthenes = new boolean[10000];
        Arrays.fill(Eratosthenes, true);
        Eratosthenes[0] = false; Eratosthenes[1] = false;
        for(int i = 2; i * i <= 1001; ++i) {
        if(Eratosthenes[i] == true) {
            for(int j = i * i; j <= 1001; j += i)
                Eratosthenes[j] = false;
            }
        }
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> ds = (ArrayList<Integer>) sc.readObject();
        int[] a = new int[100000];
        for (Integer i : ds) {
            if(Eratosthenes[i]){
                a[i]++;
            }
        }
        for (int i = 0; i < 10000; i++) {
            if(a[i] > 0){
                System.out.println(i+" "+a[i]);
            }
        }
    }

    private static boolean isPrime(Integer n) {
        if(n <= 1) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i == 0) return false;
        }
        return true;
    }
}
