/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author DarkShadowDemon200x
 * Cho dãy số A[] gồm có N phần tử.

Nhiệm vụ của bạn là đếm xem có bao nhiêu cặp (i, j) mà A[i] + A[j] = K cho trước.

Input:

Dòng đầu tiên là số lượng bộ test T (T ≤ 10).
Mỗi test gồm số nguyên N và K (1≤ N ≤ 100 000, 0 ≤ K ≤ 109).
Dòng tiếp theo gồm N số nguyên A[i] (0 ≤ A[i] ≤ 109).
Output: 

Với mỗi test, in ra trên một dòng là đáp án thu được.
 */
public class J08015_Cap_So_Co_Tong_Bang_K {
    public static long countPair(int[] a, int n, int k){
        Map<Integer, Integer> map = new HashMap<>();
        long cnt = 0;
        for (int i = 0; i < n; i++) {
            if(map.containsKey(k - a[i])){
                cnt += map.get(k - a[i]);
            }
            
            if(map.containsKey(a[i])){
                map.put(a[i], map.get(a[i]) + 1);
            }else{
                map.put(a[i], 1);
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt(), k = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            System.out.println(countPair(a, n, k));
        }
    }
}
