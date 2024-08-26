/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author DarkShadowDemon200x
 */
public class J08012_Hinh_Sao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < n-1; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            if(map.containsKey(a)){
                map.get(a).add(b);
            }else{
                map.put(a, new ArrayList<>());
                map.get(a).add(b);
            }
            if(map.containsKey(b)){
                map.get(b).add(a);
            }else{
                map.put(b, new ArrayList<>());
                map.get(b).add(a);
            }
        }
        boolean check = false;
        for (Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()) {
            if(entry.getValue().size() == n-1){
                System.out.println("Yes");
                check = true;
                break;
            }
        }
        if(check == false) System.out.println("No");
    }
}
